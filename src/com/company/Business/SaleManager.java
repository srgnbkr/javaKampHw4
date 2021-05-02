package com.company.Business;

import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;

public class SaleManager implements ISaleService{
    @Override
    public void sell(User user, Campaign campaign, Game game) {
        System.out.println(game.getName()+" Oyunu "+user.getFirstName()+" Kullanıcısına "+campaign.getName()+" Kampanyasıyla"+" %"+campaign.getDiscount()+" İndirimli  Satıldı");
    }
}
