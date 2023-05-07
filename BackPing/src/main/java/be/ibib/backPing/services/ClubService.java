package be.ibib.backPing.services;

import be.ibib.backPing.business.dto.ClubDTO;
import be.ibib.backPing.business.dto.PlayerDTO;
import be.ibib.backPing.dal.entities.ClubEntity;
import be.ibib.backPing.dal.entities.PlayerEntity;
import be.ibib.backPing.dal.repository.ClubRepository;
import be.ibib.backPing.dal.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClubService {

    final ClubRepository clubRepository;
    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public ClubDTO getClubById(String id) throws Exception {

        Optional<ClubEntity> clubEntityOptional = clubRepository.findById(id);

        return clubEntityOptional.map(ClubDTO::new).orElseThrow(Exception::new);
    }

    public ClubEntity saveClub(ClubDTO clubDTO) {
       return clubRepository.save(new ClubEntity(clubDTO));
    }
}
