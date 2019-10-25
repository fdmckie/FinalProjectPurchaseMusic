package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long songId;

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

