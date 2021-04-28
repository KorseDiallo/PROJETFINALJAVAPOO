
package projejavapoo;

/**
 *
 * @author DIALLO
 */
public class Etudiant extends Personne{
    
    private String groupeSanguin;
    
    public Etudiant(){
        
    }
    
    public Etudiant(int id, String nom, String prenom, String adresse, String dateDeNaissance, String lieuNaissance, String matricule, String telephone, String genre, String email, String nationnalite, String situationMatrimoniale,String groupeSanguin){
        super(id, nom, prenom, adresse, dateDeNaissance, lieuNaissance, matricule, telephone, genre, email, nationnalite, situationMatrimoniale);
        this.groupeSanguin=groupeSanguin;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }
    
    
}
