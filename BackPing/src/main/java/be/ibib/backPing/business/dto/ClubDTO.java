package be.ibib.backPing.business.dto;

import be.ibib.backPing.dal.entities.ClubEntity;
import lombok.Data;

@Data
public class ClubDTO {
    private String idFederation;
    private String name;
    private String phone;
    private String adresse;

    public ClubDTO(ClubEntity clubEntity) {
        this.idFederation = clubEntity.getIdFederation();
        this.name = clubEntity.getName();
        this.phone = clubEntity.getPhone();
        this.adresse = clubEntity.getAdresse();
    }
}
