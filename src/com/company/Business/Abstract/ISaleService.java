package com.company.Business.Abstract;

import com.company.Entities.Campaign;
import com.company.Entities.Game;
import com.company.Entities.User;

public interface ISaleService {
    void sell(User user, Campaign campaign, Game game);
}
