package seiderer.fotobox.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Media {

    @Id @GeneratedValue(generator = "identity")
    Long id;

    String name;
    String infos;
    String path;

    @ManyToOne
    Channel channel;


}
