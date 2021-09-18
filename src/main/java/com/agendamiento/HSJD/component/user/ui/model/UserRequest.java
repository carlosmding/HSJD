package com.agendamiento.HSJD.component.user.ui.model;

import com.agendamiento.HSJD.component.user.model.service.model.UserCommand;
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

public class UserRequest {

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

    public static UserCommand toModel (UserRequest userToCreate){
        return UserCommand.builder().numeroDeDocumento(userToCreate.getNumeroDeDocumento()
        ).tipoDeDocumento(userToCreate.getTipoDeDocumento()
        ).nombres(userToCreate.getNombres()).estado(userToCreate.getEstado()
        ).cargo(userToCreate.getCargo()).palabraClave(userToCreate.getPalabraClave()
        ).clave(userToCreate.getClave()).build();
    }

    //public static UserCommand toModel (UserRequest userToModify){

    //}

    //public static UserCommand toModel (UserRequest userToDelete){

    //}


}
