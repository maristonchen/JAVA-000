package com.mariston.weektwo;

import java.io.*;
import java.net.Socket;
import java.util.stream.Collectors;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/10/29 15:34
 */
public class HttpClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8801);

            //从socket中获取输入输出流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            //从输入流中读取数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            bufferedReader.lines().collect(Collectors.toList()).forEach(System.out::println);

            //往输出流中写数据
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println("hello, socket!");
            printWriter.flush();

            Thread.sleep(10000L);

            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
