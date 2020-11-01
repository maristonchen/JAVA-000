package com.mariston.weektwo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/1 23:49
 */
public class OkClient {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url("http://localhost:8801").build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.protocol());
            System.out.println(response.code());
            System.out.println(response.message());
            System.out.println(response.headers());
            String result = Objects.requireNonNull(response.body()).string();
            System.out.println(result);
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
