package com.company.Business.Concrete;

import com.company.Business.Abstract.UserService;
import com.company.Business.Abstract.UserValidationService;
import com.company.Entities.User;

public class UserManager implements UserService {
    UserValidationService userValidationService;

    public UserManager(UserValidationService userValidationService) {
        this.userValidationService = userValidationService;
    }

    @Override
    public void add(User user) {
        if(userValidationService.validate(user)==true){
            System.out.println("Kullanıcı Sisteme Kayıt Oldu "+user.getFirstName()+" "+user.getLastName());
        }
        else{
            System.out.println("Doğrulama Başarısız");
        }


    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı Silindi "+user.getFirstName()+" "+user.getLastName());

    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı Güncellendi "+user.getId()+" "+user.getFirstName()+" "+user.getLastName());

    }
}
