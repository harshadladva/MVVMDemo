package com.example.harshad.mvvmdemo;

import android.content.Context;
import android.databinding.BaseObservable;
import android.util.Log;
import android.widget.Toast;

import com.example.harshad.mvvmdemo.Model.Movie;
import com.example.harshad.mvvmdemo.api.ApiClient;
import com.example.harshad.mvvmdemo.api.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieListViewModel extends BaseObservable {

    private List<Movie> movieList;

    private Movie movie;

    private Context context;

    public MovieListViewModel( List<Movie> movieList, Context context ) {
        this.movieList = movieList;
        this.context = context;
    }

    public String getProfileThumb(){
        return movie.imageUrl;
    }

    public String getTitle(){
        return movie.title;
    }

    public void dataLoad(){
        ApiInterface apiInterface=ApiClient.getClient().create(ApiInterface.class);
        Call<List<Movie>> call=apiInterface.getMovieList();

        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse( Call<List<Movie>> call, Response<List<Movie>> response ) {
                movie = new Movie();
                movieList=response.body();
                Toast.makeText(context,response.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure( Call<List<Movie>> call, Throwable t ) {

            }
        });
    }


}
