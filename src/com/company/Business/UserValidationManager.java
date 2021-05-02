package com.company.Business;

import com.company.Entities.User;

public class UserValidationManager implements UserValidationService {

    @Override
    public Boolean validate(User user) {
        if(user.getBirthYear()<2004){
            return true;
        }
        return  false;


    }
}
