package sn.edu.ucak.dar.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PersonneDto {

    private Integer id;

    private String prenom;

    private String nom;

    private String adresse;

    private String telephone;

    private LocalDateTime dateEnregistrement;

    private LocalDateTime dateModification;
}
