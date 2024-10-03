package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.model.ProjectPlan;
import de.itdesign.incubating.rmg.newModel.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    Game newGame = new Game();


    public List<ProjectPlan> getProjectByPlayerId(int playerId) {
        Collection<ProjectPlan> allProjectPlans = newGame.getProjectPlans();

        List<ProjectPlan> projects = allProjectPlans.stream().filter(projectplan -> {
//            return projectplan.getOwner().id().equals(playerId);
            return Integer.valueOf(projectplan.getOwner().id()) == playerId;
        }).collect(Collectors.toList());
        return projects;
    }
}

