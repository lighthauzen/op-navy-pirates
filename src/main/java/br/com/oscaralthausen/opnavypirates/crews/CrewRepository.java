package br.com.oscaralthausen.opnavypirates.crews;

import br.com.oscaralthausen.opnavypirates.crews.models.Crew;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CrewRepository extends MongoRepository<Crew, String> {

    Optional<Crew> findById(String id);
}
