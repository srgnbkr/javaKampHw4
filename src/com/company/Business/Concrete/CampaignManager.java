package com.company.Business.Concrete;

import com.company.Business.Abstract.CampaignService;
import com.company.Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya Eklendi Id:"+campaign.getId()+"Kampanya Adı"+campaign.getName()+" İndirim Yüzdesi: %"+campaign.getDiscount());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya Güncellendi Id:"+campaign.getId()+"Kampanya Adı"+campaign.getName()+" İndirim Yüzdesi: %"+campaign.getDiscount());

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya Silindi Id:"+campaign.getId()+" Kampanya Adı: "+campaign.getName()+" İndirim: %"+campaign.getDiscount());

    }
}
