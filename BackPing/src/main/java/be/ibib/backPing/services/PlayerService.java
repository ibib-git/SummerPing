package be.ibib.backPing.services;

import be.ibib.backPing.business.dto.PlayerDTO;
import be.ibib.backPing.dal.entities.PlayerEntity;
import be.ibib.backPing.dal.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    final
    PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerDTO getPlayerById(Long id) throws Exception {

        Optional<PlayerEntity> playerEntityOptional = playerRepository.findById(id);

        return playerEntityOptional.map(PlayerDTO::new).orElseThrow(Exception::new);
    }

    public PlayerEntity savePlayer(PlayerDTO playerDTO) {
       return playerRepository.save(new PlayerEntity(playerDTO));
    }
}
