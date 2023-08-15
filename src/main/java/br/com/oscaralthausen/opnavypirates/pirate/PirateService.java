package br.com.oscaralthausen.opnavypirates.pirate;

import br.com.oscaralthausen.opnavypirates.pirate.models.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PirateService {

    @Autowired
    PirateRepository pirateRepository;

    public Optional<Pirate> findById(String id) {
        Optional<Pirate> pirate = pirateRepository.findById(id);
        return pirate;
    }

    public List<Pirate> findByIdList(List<String> list) {
        List<Pirate> pirates = new ArrayList<>();
        list.forEach(id -> {
            Optional<Pirate> current = pirateRepository.findById(id);
            if (current.isPresent()) pirates.add(current.get());
        });
        pirateRepository.findAllById(list);
        return pirates;
    }

    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    public Pirate createPirate(Pirate pirate) {
        pirate.setId(UUID.randomUUID().toString());
        Pirate createdPirate = pirateRepository.save(pirate);
        return createdPirate;
    }
}
