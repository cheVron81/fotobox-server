package seiderer.fotobox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seiderer.fotobox.dto.MediaDTO;
import seiderer.fotobox.repository.MediaRepository;

@RestController
@RequestMapping("/api/media")
public class MediaController {


    public MediaDTO putMedia(MediaDTO mediaDTO) {
        return mediaDTO;
    }

    @PostMapping
    public MediaDTO postMedia(@RequestBody MediaDTO mediaDTO) {



        return mediaDTO;
    }

}
