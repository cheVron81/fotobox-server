package seiderer.fotobox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import seiderer.fotobox.dto.MediaDTO;
import seiderer.fotobox.entity.Media;
import seiderer.fotobox.mapper.MediaMapper;
import seiderer.fotobox.repository.MediaRepository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

@Service
public class MediaService {

    @Autowired
    MediaRepository mediaRepository;

    @Value("${media.directory}")
    private String mediaDirectory;

    public MediaDTO save(MediaDTO mediaDTO) throws IllegalArgumentException {
        byte[] imageBytes = Base64.getDecoder().decode(mediaDTO.getPayload());
        File mediaFile = new File(mediaDirectory, mediaDTO.getName());
        int cnt = 1;
        while (mediaFile.exists()) {
            String name = mediaDTO.getName().substring(0, mediaDTO.getName().lastIndexOf('.'));
            String counter = "_" + cnt++;
            String extension = mediaDTO.getName().substring(mediaDTO.getName().lastIndexOf('.'));
            mediaFile = new File(mediaDirectory, name + counter + extension);
        }

        try {
            Files.write(mediaFile.toPath(), imageBytes);
        } catch (IOException e) {
            // todo: log error
            throw new RuntimeException(e);
        }
        MediaMapper mediaMapper = new MediaMapper();
        Media mediaFromDB =  mediaRepository.save(mediaMapper.toEntity(mediaDTO));

        return mediaMapper.toDTO(mediaFromDB);
    }


}