package com.example.itc_recycle_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ViewHolder> {
    ArrayList<Movie> listMovie = new ArrayList<>();

    public MovieListAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
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
        CircleImageView ivmovie;
        TextView tvTitle, tvTags;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivmovie = itemView.findViewById(R.id.iv_movie);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvTags = itemView.findViewById(R.id.tv_tags);
        }

        void bind(Movie data){
            Picasso.get()
                    .load(data.getImage())
                    .placeholder(R.drawable.ic_baseline_image_24)
                    .error(R.drawable.ic_baseline_image_24)
                    .into(ivmovie);
            tvTitle.setText(data.getTitle());
            tvTags.setText(data.getTags());
        }
    }
}
