package com.example.anime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeHolder> {

    ArrayList<AnimeModel> list;
    OnItemClick onItemClick;

    public AnimeAdapter(ArrayList<AnimeModel> list, OnItemClick onItemClick) {
        this.list = list;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public AnimeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent , false);
        return new AnimeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AnimeHolder extends RecyclerView.ViewHolder {
        TextView tvAnimeName;
        public AnimeHolder(@NonNull View itemView) {
            super(itemView);
            tvAnimeName = itemView.findViewById(R.id.tv_anime_name);
        }

        public void onBind(AnimeModel animeModel) {
            tvAnimeName.setText(animeModel.getAnimeName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClick.onClick(animeModel);
                }
            });
        }
    }
}

