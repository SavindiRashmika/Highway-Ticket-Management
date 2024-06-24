package lk.ijse.gdse66.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {

    @Id
    private String id;
    private String username;
    private String email;
    private String password;
}
