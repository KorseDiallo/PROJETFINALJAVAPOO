
package projetjavaimp;

import java.util.ArrayList;
import java.util.List;
import projejavapoo.Etudiant;
import projetjavapoo.dao.IEtudiant;



/**
 *
 * @author DIALLO
 */
public class EtudiantImp implements IEtudiant{
    List<Etudiant> etudiants= new ArrayList<Etudiant>();

   
    
    

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
    
        
    @Override
    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
         for(Etudiant etudiant2:etudiants){
            if(etudiant2.getId()==etudiant.getId()){
                etudiant2.setNom(etudiant.getNom());
                etudiant2.setPrenom(etudiant.getPrenom());
                etudiant2.setAdresse(etudiant.getAdresse());
                etudiant2.setDateDeNaissance(etudiant.getDateDeNaissance());
                etudiant2.setLieuNaissance(etudiant.getLieuNaissance());
                etudiant2.setMatricule(etudiant.getMatricule());
                etudiant2.setTelephone(etudiant.getTelephone());
                etudiant2.setGenre(etudiant.getGenre());
                etudiant2.setEmail(etudiant.getEmail());
                etudiant2.setNationnalite(etudiant.getNationnalite());
                etudiant2.setSituationMatrimoniale(etudiant.getSituationMatrimoniale());
                etudiant2.setGroupeSanguin(etudiant.getGroupeSanguin());
            }
        }
    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(int i) {
        for(Etudiant etudiant:etudiants){
           
            if(etudiant.getId()==i ){
                return etudiant;
            } 
        }
        return null;
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return  etudiants;
    }

    
}
