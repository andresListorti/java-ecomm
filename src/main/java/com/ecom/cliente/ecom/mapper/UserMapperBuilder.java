package com.ecom.cliente.ecom.mapper;


import org.springframework.stereotype.Component;

import com.ecom.cliente.ecom.dto.DomicilioDTO;
import com.ecom.cliente.ecom.dto.UserDTO;
import com.ecom.cliente.ecom.model.Domicilio;
import com.ecom.cliente.ecom.model.User;

@Component
public class UserMapperBuilder {

    public UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }

        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .build();
    }

    public User toEntity(UserDTO dto) {
        if (dto == null) {
            return null;
        }

        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .website(dto.getWebsite())
                .build();
    }

    public static DomicilioDTO toDomicilioDTO(Domicilio domicilio) {
        DomicilioDTO dto = new DomicilioDTO();
        dto.setId(domicilio.getId());
        dto.setDireccion(domicilio.getDireccion());
        dto.setDescripcion(domicilio.getDescripcion());
        return dto;
    }
}
