package com.ecom.cliente.ecom.service;

import java.util.List;

import com.ecom.cliente.ecom.dto.ProductDTO;
import com.ecom.cliente.ecom.dto.UserDTO;

public interface UserService {
    UserDTO getUserById(Long id);

    List<UserDTO> getAllUsers();

    UserDTO createUser(UserDTO userDTO);

    void updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);

    UserDTO addProductToUser(Long userId, ProductDTO productDTO);

    UserDTO addDomicilioToUser(Long userId, Long domicilioId);
}
