package com.company;

import com.company.Business.*;
import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager(new UserValidationManager());
        userManager.add(new User(
                1,
                123,
                2006,
                "Sergen",
                "Bakır",
                "cuseg09@gmail.com"

        ));
        userManager.update(new User(
                2,
                5345566,
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

        SaleManager saleManager = new SaleManager();
        saleManager.sell(new User(
                1,
                1234556,
                1994,
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
