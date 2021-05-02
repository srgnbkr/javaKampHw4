package com.company.Business.Concrete;

import com.company.Business.Abstract.ISaleService;
import com.company.Business.Abstract.UserValidationService;
import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;

public class SaleManager implements ISaleService {
    UserValidationService userValidationService;

    public SaleManager(UserValidationService userValidationService) {
        this.userValidationService = userValidationService;
    }

    @Override
    public void sell(User user, Campaign campaign, Game game) {
        if(userValidationService.validate(user)==true){
            System.out.println(
                    game.getName()
                            +" Oyunu "
                            +user.getFirstName()
                            +" Kullanıcısına "
                            +campaign.getName()
                            +" Kampanyasıyla"
                            +" %"+campaign.getDiscount()
                            +" İndirimli Olarak Satıldı");
        }else {
            System.out.println("Kimlik Doğrulaması Başarısız Satış Geçersiz");
        }
    }
}
