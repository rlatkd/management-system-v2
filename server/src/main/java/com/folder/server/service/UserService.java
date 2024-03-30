package com.folder.server.service;

import com.folder.server.dto.ResultDTO;

public interface UserService {
    public ResultDTO findAll();
    public ResultDTO editById(UserDTO uDto);
    public ResultDTO delete(int no);
    public ResultDTO save(UserDTO uDto);
}
