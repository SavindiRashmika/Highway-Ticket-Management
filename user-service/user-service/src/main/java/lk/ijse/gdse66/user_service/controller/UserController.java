package lk.ijse.gdse66.user_service.controller;

import lk.ijse.gdse66.user_service.dto.UserDTO;
import lk.ijse.gdse66.user_service.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping
    public List<UserDTO> getAllUser(){
        return service.getAllUser();
    }

    @PostMapping
    public UserDTO saveUser(@RequestBody UserDTO dto){
        System.out.println("saveUser");
        return service.saveUser(dto);
    }

    @PutMapping
    public UserDTO updateUser(UserDTO dto){
        System.out.println("updateUser");
        return service.updateUser(dto);
    }

    @DeleteMapping
    public void deleteUser(String id){
        System.out.println("deleteUser");
        service.deleteUser(id);
    }

}
