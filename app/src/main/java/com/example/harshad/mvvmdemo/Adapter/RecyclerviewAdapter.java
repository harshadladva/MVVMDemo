package com.example.harshad.mvvmdemo.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harshad.mvvmdemo.Model.Movie;
import com.example.harshad.mvvmdemo.R;
import com.example.harshad.mvvmdemo.databinding.ItemViewBinding;
import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context context;
    private List<Movie> movieList;

    public RecyclerviewAdapter( Context context, List<Movie> movieList){
        this.context=context;
        this.movieList=movieList;
    }

    public void setMovieList(List<Movie> movieList){
        this.movieList=movieList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        ItemViewBinding itemViewBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_view,parent,false);
        return new MyViewHolder(itemViewBinding);
    }

    @Override
    public void onBindViewHolder( @NonNull MyViewHolder holder, int position ) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ItemViewBinding mItemViewBinding;

        public MyViewHolder( ItemViewBinding itemViewBinding) {
            super(itemViewBinding);
        }
    }
}
