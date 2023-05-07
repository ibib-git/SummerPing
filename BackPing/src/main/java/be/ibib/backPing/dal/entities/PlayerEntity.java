package be.ibib.backPing.dal.entities;

import be.ibib.backPing.business.dto.PlayerDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class PlayerEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "officialRank")
    private String officialRank;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    private String phone;

    @Column(name = "ageCategory")
    private String ageCategory;

    @Column(name = "club")
    @JoinColumn(name = "club", referencedColumnName = "idFederation")
    @ManyToOne
    private ClubEntity club;

    public PlayerEntity(PlayerDTO playerDTO) {
        this.id = playerDTO.getId();
        this.firstName = playerDTO.getFirstName();
        this.lastName = playerDTO.getLastName();
        this.officialRank = playerDTO.getOfficialRank();
        this.mail = playerDTO.getMail();
        this.phone = playerDTO.getPhone();
    }
}
