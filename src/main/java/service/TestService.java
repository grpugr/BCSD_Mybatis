package service;

import domain.Users;

import java.util.List;

public interface TestService {
    String test();
    List<Users> getUsers();
    List<Users> postUsers();
    List<Users> patchUsers();
    List<Users> deleteUsers();
}
