
package projejavapoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIALLO
 */
public class Groupe {
    
    private int id;
    private String nomGroupe;
    private String dateCreation;
    List<Etudiant> etudiantGroupe;
    public Groupe(){
        
    }

    public Groupe(int id, String nomGroupe, String dateCreation) {
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.dateCreation = dateCreation;
        this.etudiantGroupe= new ArrayList<Etudiant>();
    }

    public int getId() {
        return id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public List<Etudiant> getEtudiantGroupe() {
        return etudiantGroupe;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setEtudiantGroupe(List<Etudiant> etudiantGroupe) {
        this.etudiantGroupe = etudiantGroupe;
    }
    
    

    @Override
    public String toString() {
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupe + ", dateCreation=" + dateCreation + '}';
    }

       
    
}
