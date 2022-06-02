package com.coolweather.coolweathertest.util;

import okhttp3.Address;
import okhttp3.Callback;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOKHttpRequest(String address, Callback callback){
    OkHttpClient client=new OkHttpClient();
    Request request =new Request.Builder().url(address).build();
    client.newCall(request).enqueue(callback);
    }
}
