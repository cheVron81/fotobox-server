// CustomerDTO.java
package seiderer.fotobox.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String role;
    private String infos;
}