package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TestMapper;
import service.TestService;

import domain.Users;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String test(){

        return testMapper.test();
    }

    public List<Users> getUsers(){

        List<Users> users = testMapper.getUsers();
        return users;
    }

    public List<Users> postUsers(){

        List<Users> users = testMapper.postUsers();
        return users;
    }

    public List<Users> patchUsers(){

        List<Users> users = testMapper.patchUsers();
        return users;

    }

    public List<Users> deleteUsers(){

        List<Users> users = testMapper.deleteUsers();
        return users;

    }
}
