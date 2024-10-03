package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.model.Role;

import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class PlayerService {

    public List<Player> players=new ArrayList<>();

    public PlayerService(){
        players.add(new Player(UUID.randomUUID().toString(), Role.RM,"Gowtham",List.of(20,30,50)));
        players.add(new Player(UUID.randomUUID().toString(),Role.PM,"Bharath",List.of(40,30,50)));
        players.add(new Player(UUID.randomUUID().toString(), Role.PM,"Kamal",List.of(20,30,50)));
        players.add(new Player(UUID.randomUUID().toString(),Role.RM,"Bhagyasri",List.of(40,30,50)));
    }
    public List<Player> getAllPlayers(){
        return  players;
    }






}
