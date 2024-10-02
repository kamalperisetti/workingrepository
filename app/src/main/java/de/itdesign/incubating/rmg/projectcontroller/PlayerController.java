package de.itdesign.incubating.rmg.projectcontroller;


import de.itdesign.incubating.rmg.forworkingmodel.Game;
import de.itdesign.incubating.rmg.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    public GameService gameService;

  @GetMapping("/get-game")
    public Game getGame(){
        return gameService.getGame();
    }
}
