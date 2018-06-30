package com.jab.movieapp.api;

import com.jab.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mamba1 on 6/26/18.
 */

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("http://api.themoviedb.org/3/movie/popular?api_key=07700c2b1106a846ad21a79360e15fab")String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("http://api.themoviedb.org/3/movie/popular?api_key=07700c2b1106a846ad21a79360e15fab")String apiKey);

}
