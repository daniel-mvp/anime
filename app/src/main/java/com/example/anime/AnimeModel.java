package com.example.anime;

import java.io.Serializable;

public class AnimeModel implements Serializable {
    private String animeName;
    private String mainCharacter;
    private Integer numberOfEpisodes;

    public AnimeModel(String animeName, String mainCharacter, Integer numberOfEpisodes) {
        this.animeName = animeName;
        this.mainCharacter = mainCharacter;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getAnimeName() {
        return animeName;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
}

