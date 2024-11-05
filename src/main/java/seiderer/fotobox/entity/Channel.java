package seiderer.fotobox.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.YesNoConverter;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Channel {

    @Id @GeneratedValue(generator = "identity")
    Long id;
    String name;
    String infos;
    @Convert(converter = YesNoConverter.class)
    Boolean downloadForAll;
    @Convert(converter = YesNoConverter.class)
    Boolean visibleForAll;

    @OneToMany(mappedBy = "channel")
    List<Media> mediaList;
}
