package de.itdesign.incubating.rmg.service;


import de.itdesign.incubating.rmg.model.Game;
import de.itdesign.incubating.rmg.model.ProjectPlan;
import de.itdesign.incubating.rmg.repository.GameRepository;

import java.util.Collection;
import java.util.List;

public class GameService implements GameRepository {

    public Game game=new Game();


    @Override
    public Collection<ProjectPlan> getProjectPlanes() {
        return game.getProjectPlans();
    }
}
