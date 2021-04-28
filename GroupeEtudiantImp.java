

package projetjavaimp;

import java.util.ArrayList;
import java.util.List;
import projejavapoo.Etudiant;
import projejavapoo.Groupe;
import projetjavapoo.dao.IGroupeEtudiant;

/**
 *
 * @author DIALLO
 */
public class GroupeEtudiantImp implements IGroupeEtudiant {
    private Groupe groupe;
    
    EtudiantImp etudiant= new EtudiantImp();
    List<Groupe> groupes=new ArrayList<Groupe>();
    GroupeImp allGroupe;
   // List<Etudiant> etudiants= new ArrayList<Etudiant>();
    List<Etudiant> etudiantGroupe= new ArrayList<Etudiant>();
    public GroupeEtudiantImp(Groupe groupe, List<Etudiant> etudiant) {
        this.groupe=groupe;
        this.etudiantGroupe=groupe.getEtudiantGroupe();
        this.groupes= allGroupe.getAllGroupe();
      // etudiant= etudiant;
    }
    
    @Override
    public void addEtudiantGroupe(int id) {
        EtudiantImp etudiant=new EtudiantImp();
     Etudiant et=etudiant.getEtudiantById(id);
        for(Etudiant etud:etudiant.getEtudiants()){
            if(etud==et){
                etudiantGroupe.add(et);
            }
        }
    }

    @Override
    public void deleteEtudiantGroupe(int id) {
         EtudiantImp etudiant=new EtudiantImp();
     Etudiant et=etudiant.getEtudiantById(id);
        for(Etudiant etud:etudiant.getEtudiants()){
            if(etud==et){
                etudiantGroupe.remove(etudiantGroupe.indexOf(et));
            }
        }
    }

    @Override
    public void showEtudiantGroupe() {
        for(Etudiant etud:etudiant.getEtudiants()){
            System.out.println("Nom: " +etud.getNom());
        }
    }
    
}
