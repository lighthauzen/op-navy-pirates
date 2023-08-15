package br.com.oscaralthausen.opnavypirates.pirate.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pirate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pirate {

   @Id
   private String id;
   private String name;
   private Integer age;
   private String bounty;
   private String origin;
   private String devilFruit;
   private String rank;
   private String poster;


}
