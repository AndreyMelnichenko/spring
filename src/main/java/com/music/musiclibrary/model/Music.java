package com.music.musiclibrary.model;

import lombok.Data;
import java.util.List;

@Data
public class Music {
    private int id;
    private String name;
    private List<String> tracks;
}
