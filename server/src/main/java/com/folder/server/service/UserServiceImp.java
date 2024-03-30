package com.folder.server.service;

import org.springframework.stereotype.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.folder.server.dto.ResultDTO;
import com.folder.server.dao.UserDao;

@Service
public class UserServiceImp implements UserService{
    private ResultDTO rDto;

    @Autowired UserDao uDao;

    public ResultDTO findAll() {
        rDto = new ResultDTO();
        return rDto;
    }

    public ResultDTO editById(UserDTO uDto) {
        return rDto;
    }

    public ResultDTO delete(int no) {
        return rDto;
    }

    public ResultDTO save(UserDTO uDto) {
        return rDto;
    }
}
