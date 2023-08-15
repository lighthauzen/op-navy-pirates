package br.com.oscaralthausen.opnavypirates.pirate;



import br.com.oscaralthausen.opnavypirates.pirate.models.Pirate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PirateRepository extends MongoRepository<Pirate, String> {

    Optional<Pirate> findById(String id);
    List<Pirate> findAllById(List<String> list);
}
