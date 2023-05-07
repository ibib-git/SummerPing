package be.ibib.backPing.controllers;

import be.ibib.backPing.business.dto.PlayerDTO;
import be.ibib.backPing.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/getPlayer/{id}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable("id") long idPlayer) throws Exception {
        return ResponseEntity.ok(playerService.getPlayerById(idPlayer));
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerPlayer(@RequestBody PlayerDTO playerDTO) {
        playerService.savePlayer(playerDTO);
        return ResponseEntity.ok("200"); //TODO Need error gest and Exeption
    }

}
