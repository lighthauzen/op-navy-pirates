package br.com.oscaralthausen.opnavypirates.crews;

import br.com.oscaralthausen.opnavypirates.crews.models.Crew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("pirates/crew")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CrewController {

    @Autowired
    CrewService crewService;

    @GetMapping
    public ResponseEntity<List<Crew>> getAllCrews() {
        List<Crew> crews = crewService.getAllCrews();
        return ResponseEntity.status(HttpStatus.OK).body(crews);
    }

    @PostMapping
    public ResponseEntity<Crew> createCrew(@RequestBody Crew crew) {
        Crew result = crewService.createCrew(crew);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
