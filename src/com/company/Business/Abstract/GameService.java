package com.company.Business.Abstract;

import com.company.Entities.Game;

public interface GameService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
}
