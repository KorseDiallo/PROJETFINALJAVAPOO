
package projejavapoo;

/**
 *
 * @author DIALLO
 */
public class Personne {
    
        
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateDeNaissance;
    private String lieuNaissance;
    private String matricule;
    private String telephone;
    private String genre;
    private String email;
    private String nationnalite;
    private String situationMatrimoniale;
    
    public Personne(){
    }

    public Personne(int id, String nom, String prenom, String adresse, String dateDeNaissance, String lieuNaissance, String matricule, String telephone, String genre, String email, String nationnalite, String situationMatrimoniale) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuNaissance = lieuNaissance;
        this.matricule = matricule;
        this.telephone = telephone;
        this.genre = genre;
        this.email = email;
        this.nationnalite = nationnalite;
        this.situationMatrimoniale = situationMatrimoniale;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getGenre() {
        return genre;
    }

    public String getEmail() {
        return email;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public String getSituationMatrimoniale() {
        return situationMatrimoniale;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    public void setSituationMatrimoniale(String situationMatrimoniale) {
        this.situationMatrimoniale = situationMatrimoniale;
    }
    
}
