package lk.ijse.gdse66.user_service.service;

import lk.ijse.gdse66.user_service.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO dto);
    UserDTO updateUser(UserDTO dto);
    void deleteUser(String id);
    List<UserDTO> getAllUser();
}
