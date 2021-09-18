package com.agendamiento.HSJD.component.user.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)


public class User implements Serializable {

    @NotNull
    @NotBlank
    @Size(min = 6, max = 20)
    private String numeroDeDocumento;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 4)
    private String tipoDeDocumento;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 100)
    private String nombres;

    @NotNull
    @NotBlank
    private Boolean estado;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 45)
    private String cargo;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 45)
    private String palabraClave;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 20)
    private String clave;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
