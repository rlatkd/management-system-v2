package com.folder.server.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {
    public List<UserDTO> findAll() {
        return null;
    }

    public int editById(UserDTO uDto) {
        return 0;
    }

    public int delete(int no) {
        return 0;
    }

    public int save(UserDTO uDto) {
        return 0;
    }
}
