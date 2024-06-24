package lk.ijse.gdse66.user_service.service.Impl;

import lk.ijse.gdse66.user_service.dto.UserDTO;
import lk.ijse.gdse66.user_service.entity.User;
import lk.ijse.gdse66.user_service.repository.UserRepo;
import lk.ijse.gdse66.user_service.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDTO saveUser(UserDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready Exits");
        }
        return mapper.map(repo.save(mapper.map(dto, User.class)), UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO deleteUser(String id) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return mapper.map(repo.findAll(), new TypeToken<UserDTO>(){}.getType());
    }
}
