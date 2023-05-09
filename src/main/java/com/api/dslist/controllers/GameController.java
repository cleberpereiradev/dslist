package com.api.dslist.controllers;

import com.api.dslist.dto.GameMinDTO;
import com.api.dslist.entities.Game;
import com.api.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/dslist")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/games")
    public List<GameMinDTO> findAll() {
        var games = gameService.findAll();
        return games;
    }

}
