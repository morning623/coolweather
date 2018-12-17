package com.example.wahaha.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wahaha on 2018/12/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
