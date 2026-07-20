package sn.edu.ucak.dar.mapper;

import sn.edu.ucak.dar.dto.PersonneCreateRequest;
import sn.edu.ucak.dar.dto.PersonneDto;
import sn.edu.ucak.dar.entities.Personne;

public class PersonneMapper {
    public static Personne toPersonne(PersonneCreateRequest request){
        Personne p= new Personne();
        p.setPrenom(request.getPrenom());
        p.setNom(request.getNom());
        p.setAdresse(request.getAdresse());
        p.setTelephone(request.getTelephone());
        return p;
    }

    public static PersonneDto toPersonneDto(Personne personne){
        PersonneDto p =new PersonneDto();
        p.setId(personne.getId());
        p.setPrenom(personne.getPrenom());
        p.setNom(personne.getNom());
        p.setAdresse(personne.getAdresse());
        p.setTelephone(personne.getTelephone());
        p.setDateEnregistrement(personne.getDateEnregistrement());
        p.setDateModification(personne.getDateModification());
        return p;
    }
}
