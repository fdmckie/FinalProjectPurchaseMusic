package com.example.demo;


import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Song {

    @NotEmpty
    @Size(min=1)
    private String songTitle;

    @NotEmpty
    @Size(min=1)
    private String artistName;

    @NotEmpty
    @Size(min=1)
    private String lengthDuration;

    @NotEmpty
    @Size(min=1)
    private String musicGenre;

    private String songYouTubeLink;



}

