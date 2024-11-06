// MediaDTO.java
package seiderer.fotobox.dto;

import lombok.Data;

@Data
public class MediaDTO {
    private Long id;
    private String name;
    private String infos;
    private String path;
    private Long channelId;
    private String payload;
}