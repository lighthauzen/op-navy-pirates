package br.com.oscaralthausen.opnavypirates.crews;

import br.com.oscaralthausen.opnavypirates.crews.models.Crew;
import br.com.oscaralthausen.opnavypirates.pirate.PirateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CrewService {

    @Autowired
    CrewRepository crewRepository;
    @Autowired
    PirateService pirateService;

    public Optional<Crew> findById(String id) {
        Optional<Crew> crew = crewRepository.findById(id);
        return crew;
    }

    public List<Crew> getAllCrews() {
        return crewRepository.findAll();
    }

    public Crew createCrew(Crew crew) {
        crew.setId(UUID.randomUUID().toString());
        Crew createdCrew = crewRepository.save(crew);
        return createdCrew;
    }

}
