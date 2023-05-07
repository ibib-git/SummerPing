package be.ibib.backPing.business.dto;

import be.ibib.backPing.dal.entities.PlayerEntity;
import lombok.Data;

@Data
public class PlayerDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String mail;
    private String phone;
    private String officialRank;
    private ClubDTO clubDTO;

    public PlayerDTO(PlayerEntity playerEntity){
        this.id = playerEntity.getId();
        this.firstName = playerEntity.getFirstName();
        this.lastName = playerEntity.getLastName();
        this.mail = playerEntity.getMail();
        this.phone = playerEntity.getPhone();
        this.officialRank = playerEntity.getOfficialRank();
        this.clubDTO = new ClubDTO(playerEntity.getClub());
    }

}
