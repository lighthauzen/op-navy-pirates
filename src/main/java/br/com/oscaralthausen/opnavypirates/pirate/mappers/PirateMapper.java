package br.com.oscaralthausen.opnavypirates.pirate.mappers;


import br.com.oscaralthausen.opnavypirates.pirate.models.Pirate;
import br.com.oscaralthausen.opnavypirates.pirate.models.PirateDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PirateMapper {
    ModelMapper mapper = new ModelMapper();
    public PirateDTO entityToDto(Pirate pirate) {
        PirateDTO postDto = mapper.map(pirate, PirateDTO.class);
        return postDto;
    }

    public Pirate dtoToEntity(PirateDTO pirateDTO) {
        Pirate pirate = mapper.map(pirateDTO, Pirate.class);
        return pirate;
    }
}
