package com.company.Business.Abstract;

import com.company.Entities.User;

public interface UserService {
    void add(User user);
    void delete(User user);
    void update(User user);
}
