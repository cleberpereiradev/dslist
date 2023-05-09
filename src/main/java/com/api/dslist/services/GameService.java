package com.api.dslist.services;

import com.api.dslist.dto.GameMinDTO;
import com.api.dslist.entities.Game;
import com.api.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameMinDTO> dto = games.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }


}
