package com.example.itc_recycle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieGridAdapter extends RecyclerView.Adapter<MovieGridAdapter.ViewHolder> {
    ArrayList<Movie> listMovie;

    public MovieGridAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = new ArrayList<>();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listMovie.get(position));
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivmovie;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivmovie = itemView.findViewById(R.id.iv_movie);
        }

        void bind(Movie data){
            Picasso.get()
                    .load(data.getImage())
                    .placeholder(R.drawable.ic_baseline_image_24)
                    .error(R.drawable.ic_baseline_image_24)
                    .into(ivmovie);
        }
    }
}
