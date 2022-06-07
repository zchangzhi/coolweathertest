package com.coolweather.coolweathertest.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    //@SerializedName("date")
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;


    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
