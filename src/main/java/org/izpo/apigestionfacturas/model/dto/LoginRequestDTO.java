package org.izpo.apigestionfacturas.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {
    @Email(message = "tiene que tener la estructura de un email")
    private String email;
    @NotBlank(message = "El password no puede ser nulo")
    private String password;
}
