package repository;

import org.springframework.stereotype.Repository;

import domain.Users;
import java.util.List;

@Repository
public interface TestMapper {

    String test();
    List<Users> getUsers();
    List<Users> postUsers();
    List<Users> patchUsers();
    List<Users> deleteUsers();
}