package com.music.musiclibrary.model;

import lombok.Data;
import java.util.List;

@Data
public class Car {
    private int id;
    private String brand;
    private List<String> model;
}
