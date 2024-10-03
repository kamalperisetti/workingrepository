package de.itdesign.incubating.rmg.controller;

import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getAllPlayers(@PathVariable String gameId) {
        List<Player> data = playerService.getAllPlayers();
        return data;
    }


}
