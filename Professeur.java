
package projejavapoo;

/**
 *
 * @author DIALLO
 */
public class Professeur extends Personne{
    
    
        
    private String specialite;
    
    public Professeur(){
        
    }
    
    public Professeur(int id, String nom, String prenom, String adresse, String dateDeNaissance, String lieuNaissance, String matricule, String telephone, String genre, String email, String nationnalite, String situationMatrimoniale,String specialite){
        super(id, nom, prenom, adresse, dateDeNaissance, lieuNaissance, matricule, telephone, genre, email, nationnalite, situationMatrimoniale);
        this.specialite=specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
}
