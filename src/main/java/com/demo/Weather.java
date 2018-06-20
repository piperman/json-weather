package com.demo.weather;

import java.util.HashMap;
import java.util.Map;

public class Weather{
    

Map<String, String> wm = new HashMap<String, String>();


    public String getWeather(String city){
        weatherData();
        String weather = wm.get(city);
        return weather;
    }

    void weatherData(){
        wm.clear();

        wm.put("Chicago", "current  84, Clear, forecast 72, Windy");
        wm.put("Sydney", "current,  68, Rainy, forecast 53, Clear");
        wm.put("London", "current,  85, Hot, forecast,  66, Rainy");
        wm.put("San Antonio", "current, 102, Hot, forecast, 105, Hot");
        wm.put("Antarctica", "current, -85, Cold, forecast, -73, Cold");

    }
}