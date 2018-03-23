package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZZY on 2018/3/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherID;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
