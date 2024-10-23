package com.ecom.cliente.ecom.mapper;

import org.springframework.stereotype.Component;

import com.ecom.cliente.ecom.dto.UserDTO;
import com.ecom.cliente.ecom.model.User;

@Component
public class UserMapper {

    public UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        // dto.setEmail(user.getEmail());
        // dto.setPhone(user.getPhone());
        // dto.setWebsite(user.getWebsite());
        return dto;
    }

    public User toEntity(UserDTO dto) {
        if (dto == null) {
            return null;
        }

        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setWebsite(dto.getWebsite());
        return user;
    }
}
