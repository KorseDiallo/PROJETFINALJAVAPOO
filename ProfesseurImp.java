
package projetjavaimp;

import java.util.ArrayList;
import java.util.List;
import projejavapoo.Professeur;
import projetjavapoo.dao.IProfesseur;

/**
 *
 * @author DIALLO
 */
public class ProfesseurImp implements IProfesseur {
    
    List<Professeur> professeurs= new ArrayList<Professeur>();

    @Override
    public void addProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    @Override
    public void updateProfesseur(Professeur professeur) {
        for(Professeur professeur2:professeurs){
            if(professeur2.getId()==professeur.getId()){
                professeur2.setNom(professeur.getNom());
                professeur2.setPrenom(professeur.getPrenom());
                professeur2.setAdresse(professeur.getAdresse());
                professeur2.setDateDeNaissance(professeur.getDateDeNaissance());
                professeur2.setLieuNaissance(professeur.getLieuNaissance());
                professeur2.setMatricule(professeur.getMatricule());
                professeur2.setTelephone(professeur.getTelephone());
                professeur2.setGenre(professeur.getGenre());
                professeur2.setEmail(professeur.getEmail());
                professeur2.setNationnalite(professeur.getNationnalite());
                professeur2.setSituationMatrimoniale(professeur.getSituationMatrimoniale());
                professeur2.setSpecialite(professeur.getSpecialite());
            }
        }
    }

    @Override
    public void deleteProfesseur(Professeur professeur) {
        professeurs.remove(professeur);
    }

    @Override
    public Professeur getProfesseurById(int i) {
        for(Professeur professeur:professeurs){
           
            if(professeur.getId()==i ){
                return professeur;
            } 
        }
        return null;
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return  professeurs;
    }
    
}
