package com.teckarch.TafUserService.Service.Interfaces;

import com.teckarch.TafUserService.DTO.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long userId);
    UserDTO updateUser(Long userId, UserDTO updatedUser);
    void deleteUser(Long userId);
}