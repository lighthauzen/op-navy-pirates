package br.com.oscaralthausen.opnavypirates.pirate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PirateDTO {

    private String id;
    private String name;
    private Integer age;
    private String bounty;
    private String origin;
    private String devilFruit;
    private String rank;
    //private String poster;
}
