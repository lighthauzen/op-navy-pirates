package br.com.oscaralthausen.opnavypirates.pirate;

import br.com.oscaralthausen.opnavypirates.pirate.mappers.PirateMapper;
import br.com.oscaralthausen.opnavypirates.pirate.models.Pirate;
import br.com.oscaralthausen.opnavypirates.pirate.models.PirateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("pirates/pirate")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PirateController {

    @Autowired
    PirateService pirateService;
    @Autowired
    PirateMapper pirateMapper;
    @GetMapping
    public ResponseEntity<List<Pirate>> getAllPirates() {
        List<Pirate> pirates = pirateService.getAllPirates();
        return ResponseEntity.status(HttpStatus.OK).body(pirates);
    }

    @GetMapping("/test")
    public ResponseEntity<List<Pirate>> getAllPiratesTest(@RequestBody List<String> list) {
        List<Pirate> pirates = pirateService.findByIdList(list);
        return ResponseEntity.status(HttpStatus.OK).body(pirates);
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<PirateDTO> getPirateDto(@PathVariable("id") String id) {
        Pirate pirate = pirateService.findById(id).get();
        PirateDTO dto = pirateMapper.entityToDto(pirate);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    @PostMapping
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate) {
        Pirate result = pirateService.createPirate(pirate);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }


}
