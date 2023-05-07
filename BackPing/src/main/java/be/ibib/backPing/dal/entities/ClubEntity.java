package be.ibib.backPing.dal.entities;

import be.ibib.backPing.business.dto.ClubDTO;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "club")
public class ClubEntity implements Serializable {

    @Id
    @Column(name = "idFederation")
    private String idFederation;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    private Collection<PlayerEntity> playerEntities;

    public ClubEntity (ClubDTO clubDTO) {
        this.name = clubDTO.getName();
        this.idFederation = clubDTO.getIdFederation();
        this.adresse = clubDTO.getAdresse();
        this.phone = clubDTO.getAdresse();
    }

}
