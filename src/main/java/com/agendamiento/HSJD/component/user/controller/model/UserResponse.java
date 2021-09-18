package com.agendamiento.HSJD.component.user.controller.model;

import com.agendamiento.HSJD.component.user.model.User;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserResponse {

    private String numeroDeDocumento;

    private String tipoDeDocumento;

    private String nombres;

    private Boolean estado;

    private String cargo;

    private String palabraClave;

    private String clave;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    public static UserResponse fromModel(User user){
        return UserResponse.builder().numeroDeDocumento(user.getNumeroDeDocumento()
        ).tipoDeDocumento(user.getTipoDeDocumento()).nombres(user.getNombres()).estado(user.getEstado()
        ).cargo(user.getCargo()).palabraClave(user.getPalabraClave()).clave(user.getClave()).build();

    }

}
