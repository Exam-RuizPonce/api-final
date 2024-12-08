package org.izpo.apigestionfacturas.model.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private UserResponseDTO user;
    private String token;
}
