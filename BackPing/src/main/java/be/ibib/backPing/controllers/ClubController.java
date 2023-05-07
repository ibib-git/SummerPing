package be.ibib.backPing.controllers;

import be.ibib.backPing.business.dto.ClubDTO;
import be.ibib.backPing.business.dto.PlayerDTO;
import be.ibib.backPing.dal.repository.ClubRepository;
import be.ibib.backPing.services.ClubService;
import be.ibib.backPing.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping("/getClub/{id}")
    public ResponseEntity<ClubDTO> getClub(@PathVariable("idFederation") String idFederation) throws Exception {
        return ResponseEntity.ok(clubService.getClubById(idFederation));
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerPlayer(@RequestBody ClubDTO clubDTO) {
        clubService.saveClub(clubDTO);
        return ResponseEntity.ok("200"); //TODO Need error gest and Exeption
    }

}
