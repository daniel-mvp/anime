package com.example.anime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.anime.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements OnItemClick {

    AnimeAdapter animeAdapter;
    FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<AnimeModel> list = new ArrayList<>();
        list.add(new AnimeModel("Naruto", "Naruto", 500));
        list.add(new AnimeModel("Bleach", "Ichigo", 366));
        list.add(new AnimeModel("One Piece", "Luffy", 1025));
        list.add(new AnimeModel("Sword Art Online", "Kirito", 73));
        list.add(new AnimeModel("Хоримия", "Миямура", 13));
        list.add(new AnimeModel("Дитя природы", "Ходака", 1));
        list.add(new AnimeModel("Чудачество любви не помеха", "Юта", 24));
        list.add(new AnimeModel("Волейболл", "Хината", 85));
        list.add(new AnimeModel("Реинкорнация Безработного", "Рудеус", 23));

        animeAdapter = new AnimeAdapter(list, this);
        binding.recyclerAnime.setAdapter(animeAdapter);
    }

    @Override
    public void onClick(AnimeModel animeModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", animeModel);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, detailFragment).commit();
    }
}
