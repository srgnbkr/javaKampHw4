package com.company.Business;

import com.company.Entities.Game;

public class GameManager implements GameService{
    @Override
    public void add(Game game) {
        System.out.println("" +
                "Oyun Eklendi "+"Id:"+game.getId()+" Adı: "
                +game.getName()+" Fiyatı: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());
    }

    @Override
    public void delete(Game game) {
        System.out.println("" +
                "Oyun Silindi "+"Id:"+game.getId()+" Adı: "
                +game.getName()+" Fiyatı: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());

    }

    @Override
    public void update(Game game) {
        System.out.println("" +
                "Oyun Güncellendi "+"Id:"+game.getId()+" Adı: "
                +game.getName()+" Fiyatı: "+game.getPrice()+" TL"+"  Kampanya Kodu: "+game.getCampaignId());
    }
}
