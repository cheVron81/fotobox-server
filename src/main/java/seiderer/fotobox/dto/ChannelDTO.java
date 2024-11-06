// ChannelDTO.java
package seiderer.fotobox.dto;

import lombok.Data;

@Data
public class ChannelDTO {
    private Long id;
    private String name;
    private String infos;
    private Boolean downloadForAll;
    private Boolean visibleForAll;
}