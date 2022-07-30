package com.example.anime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.anime.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {

    AnimeModel animeModel;
    FragmentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        animeModel = (AnimeModel) getArguments().getSerializable("key");
        binding.tvAnimeName.setText(animeModel.getAnimeName());
        binding.tvMainCharacter.setText(animeModel.getMainCharacter());
        binding.episodes.setText(String.valueOf(animeModel.getNumberOfEpisodes()));
    }
}

