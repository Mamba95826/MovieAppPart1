package com.jab.movieapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mamba1 on 6/26/18.
 */

public class Client {

    public static final String BASE_URL = "http://api.themoviedb.org/3/movie/popular?api_key=07700c2b1106a846ad21a79360e15fab";
    public static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit ;
    }
}
