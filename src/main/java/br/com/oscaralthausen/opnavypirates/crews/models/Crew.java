package br.com.oscaralthausen.opnavypirates.crews.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "crew")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Crew {
    @Id
    private String id;
    private String name;
    private List<String> members;
    private String origin;
    private String ship;
}
