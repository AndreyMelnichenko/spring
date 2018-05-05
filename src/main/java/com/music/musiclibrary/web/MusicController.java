package com.music.musiclibrary.web;

import com.music.musiclibrary.model.Music;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/music")
public class MusicController {

    @GetMapping
    public Music getMusicCollection(@RequestParam("id") int id){
        Music music = new Music();
        if (id == 1){
            music.setId(1);
            music.setName("Prodigy");
            music.setTracks(Arrays.asList("Breath","Diesel Power"));
        }else if(id==2){
            music.setId(2);
            music.setName("Linkin Park");
            music.setTracks(Arrays.asList("In the End","Crawler"));
        }
        return music;
    }
}
