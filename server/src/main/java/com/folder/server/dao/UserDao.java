package com.folder.server.dao;

import java.util.List;
import com.folder.server.dto.UserDTO;

public interface UserDao {
    public List<UserDTO> findAll();
    public int editById(UserDTO uDto);
    public int delete(int no);
    public int save(UserDTO uDto);
}
