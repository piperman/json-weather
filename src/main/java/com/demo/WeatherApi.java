package com.demo.weather;

import java.util.*;


public class WeatherApi{
    static List<String> city = new ArrayList<String>();


    public WeatherApi(){
    }
    
    public static void main(String[] args){
        runTest();
    }

    private static void runTest(){
        //Weather we = new Weather();
        populateCity();

        for (String cc : city) {
            try {
                new Thread(() -> {
                    String wes = Weather.getWeather(cc);
                    System.out.println("Weather for "+ cc + " "+ wes);
                });
            } catch (Exception e) {
                System.out.print(e);
            }
            
        }

    }
    private static void populateCity(){
        city.clear();
        city.add("Chicago");
        city.add("Sydney");
        city.add("London");
        city.add("San Antonio");
        city.add("Antarctica");
    }
}