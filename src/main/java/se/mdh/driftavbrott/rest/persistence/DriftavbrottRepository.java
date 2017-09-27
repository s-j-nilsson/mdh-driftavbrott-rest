package se.mdh.driftavbrott.rest.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import se.mdh.driftavbrott.rest.model.Driftavbrott;

public interface DriftavbrottRepository extends MongoRepository<Driftavbrott, String> {

}
