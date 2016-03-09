package persistence.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import persistence.entities.PersonaEmbeddedEntity;

public interface PersonaEmbeddedDao extends JpaRepository<PersonaEmbeddedEntity, Integer> {

}
