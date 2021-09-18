package com.agendamiento.HSJD.component.user.model.service.model;

import com.agendamiento.HSJD.component.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserCommand {

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

    public static User toModel (@NotNull UserCommand userToCreateCmd){
        return User.builder().numeroDeDocumento(userToCreateCmd.getNumeroDeDocumento()
        ).tipoDeDocumento(userToCreateCmd.getTipoDeDocumento()).nombres(userToCreateCmd.getNombres()
        ).estado(userToCreateCmd.getEstado()).cargo(userToCreateCmd.getCargo()
        ).palabraClave(userToCreateCmd.getPalabraClave()).clave(userToCreateCmd.getClave()).build();
    }
}
