package com.company;

import com.company.Business.Concrete.*;
import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager(new UserValidationManager());
        userManager.add(new User(
                1,
                "12345678923",
                1996,
                "Sergen",
                "Bakır",
                "cuseg09@gmail.com"

        ));
        userManager.update(new User(
                2,
                "12345678911",
                1988,
                "Engin",
                "Demiroğ",
                "engin@engin.com"
        ));

        GameManager gameManager = new GameManager();
        gameManager.update(new Game(
                1,
                1,
                "Nba2k21",
                300
        ));

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.delete(new Campaign(
                1,
                "Kış Kampanyası",
                23
        ));

        SaleManager saleManager = new SaleManager(new UserValidationManager());
        saleManager.sell(new User(
                1,
                "36925814755",
                1996,
                "Sergencu",
                "Cu",
                "cuseg09@gmail.com"

        ),new Campaign(
                2,
                "Summer Campaign",
                33
        ),new Game(
                2,
                1,
                "Gta V",
                150

        ));









    }

}
