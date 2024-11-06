// MediaMapper.java
package seiderer.fotobox.mapper;

import seiderer.fotobox.dto.MediaDTO;
import seiderer.fotobox.entity.Media;

public class MediaMapper {

    public MediaDTO toDTO(Media media) {
        if (media == null) {
            return null;
        }

        MediaDTO mediaDTO = new MediaDTO();
        mediaDTO.setId(media.getId());
        mediaDTO.setName(media.getName());
        mediaDTO.setInfos(media.getInfos());
        mediaDTO.setPath(media.getPath());
        mediaDTO.setChannelId(media.getId());

        return mediaDTO;
    }

    public Media toEntity(MediaDTO mediaDTO) {
        if (mediaDTO == null) {
            return null;
        }

        Media media = new Media();
        media.setId(mediaDTO.getId());
        media.setName(mediaDTO.getName());
        media.setInfos(mediaDTO.getInfos());
        media.setPath(mediaDTO.getPath());
        media.setId(mediaDTO.getChannelId());

        return media;
    }
}