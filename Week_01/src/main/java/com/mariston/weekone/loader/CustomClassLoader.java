package com.mariston.weekone.loader;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/10/21 0:43
 */
public class CustomClassLoader extends ClassLoader {

    /**
     * Finds the class with the specified <a href="#name">binary name</a>.
     * This method should be overridden by class loader implementations that
     * follow the delegation model for loading classes, and will be invoked by
     * the {@link #loadClass <tt>loadClass</tt>} method after checking the
     * parent class loader for the requested class.  The default implementation
     * throws a <tt>ClassNotFoundException</tt>.
     *
     * @param name The <a href="#name">binary name</a> of the class
     * @return The resulting <tt>Class</tt> object
     * @throws ClassNotFoundException If the class could not be found
     * @since 1.2
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            URL url = Thread.currentThread().getContextClassLoader().getResource("");
            assert url != null;
            File file = new File(url.getPath() + "com/mariston/weekone/loader/Hello.xlass");
            byte[] fileBytes = FileUtils.readFileToByteArray(file);
            //TODO 解密 与 解码
            for (int i = 0; i < fileBytes.length; i++) {
                fileBytes[i] = (byte) ~fileBytes[i];
            }
            return defineClass(name, fileBytes, 0, fileBytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Hello", true, new CustomClassLoader());
            if (clazz != null) {
                Object obj = clazz.newInstance();
                // 通过反射获取方法
                Method method = clazz.getDeclaredMethod("hello");
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
