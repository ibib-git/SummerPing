package be.ibib.backPing.dal.repository;

import be.ibib.backPing.dal.entities.ClubEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<ClubEntity, String> {
}
