
package projejavapoo;

import java.util.List;
import java.util.Scanner;
import projetjavaimp.GroupeImp;
import projetjavaimp.EtudiantImp;
import projetjavaimp.ProfesseurImp;

/**
 *
 * @author DIALLO
 */
public class Menu {
    static Scanner scanner= new Scanner(System.in);
    static GroupeImp groupeImp= new GroupeImp() ;
    static EtudiantImp etudiantImp= new EtudiantImp() ;
    static ProfesseurImp professeurImp= new ProfesseurImp() ;
    
    
    public static String menuPrincipal(){
        String menu="1-Gestion Groupe\n";
        menu+="2-Gestion Etudiant\n";
        menu+="3-Gestion Professeur\n";
        menu+="4-Gestion Groupe/Etudiant\n";
        menu+="5-Quitter\n";
        return menu;
    }
    
    public static String menuGroupe(){
        String menuGroupe="1-Créer Un Groupe\n";
        menuGroupe+="2-Modifier Un Groupe\n";
        menuGroupe+="3-Voir les Details D'un Groupe\n";
        menuGroupe+="4-Supprimer Un Groupe\n";
        menuGroupe+="5-Afficher tous les Groupes\n";
        menuGroupe+="6-Quitter\n";
        return menuGroupe;
    }
    
    public static Groupe formulaireCreationGroupe(){
         System.out.println("Veuillez saisir L'ID");
         int id=scanner.nextInt();
         System.out.println("Veuillez Saisir Le Nom Du Groupe:");
         String nomGroupe=scanner.next();
         System.out.println("Veuillez Saisir La Date De Creation:");
         String dateCreation=scanner.next();
         Groupe groupe= new Groupe(id,nomGroupe,dateCreation);
         groupeImp.addGroupe(groupe);
         System.out.println("Ajout Effectuer avec succès!");
        return groupe;
    }
    
      public static void formulaireModificationGroupe(){
        // System.out.println("Modifier Un Groupe");
        System.out.println("Id:");
        int idMod=scanner.nextInt();
        Groupe groupe2=groupeImp.getGroupeById(idMod);
        groupeImp.updateGroupe(groupe2);
        System.out.println("Nom Du Groupe:");
        String nomG=scanner.next();
        groupe2.setNomGroupe(nomG);
        System.out.println("Date de Creation:");
        String dateG=scanner.next();
        groupe2.setDateCreation(dateG);
        System.out.println("Modification effectuer");
        
    }
      
     public static void formulaireVoirDetailsGroupe(){
       System.out.println("Id:");
       int idE=scanner.nextInt();
       Groupe groupe6=groupeImp.getGroupeById(idE);
       System.out.println(groupe6.getNomGroupe());
       System.out.println(groupe6.getDateCreation());
    }
     
      public static void formulaireSupprimerGroupe(){
       // System.out.println("Supprimer Un Groupe");
           System.out.println("Veuillez saisir L'Id");
           int ID=scanner.nextInt();
           Groupe groupe4=groupeImp.getGroupeById(ID);
           groupeImp.deleteGroupe(groupe4);
          System.out.println("Suppression effectuer");
    }
      
       public  static void formulaireVoirTousLesGroupe(){
        List<Groupe> groupes=  groupeImp.getAllGroupe();
        for(Groupe groupe5:groupes){
            System.out.println(groupe5.getId());
            System.out.println(groupe5.getNomGroupe());
            System.out.println(groupe5.getDateCreation());
    }
    }
    public static String menuEtudiant(){
        String menuEtudiant="1-Ajouter Un Etudiant\n";
        menuEtudiant+="2-Modifier Un Etudiant\n";
        menuEtudiant+="3-Voir les Details D'un Etudiant\n";
        menuEtudiant+="4-Supprimer Un Etudiant\n";
        menuEtudiant+="5-Afficher tous les Etudiants\n";
        menuEtudiant+="6-Quitter\n";
        return menuEtudiant;
    }
    
    public static Etudiant formulaireCreationEtudiant(){
     System.out.println("Veuillez saisir L'ID");
     int id=scanner.nextInt();
     System.out.println("Veuillez saisir Le nom:");
     String nom=scanner.next();
     System.out.println("Veuillez saisir Le prenom:");
     String prenom=scanner.next();
     System.out.println("Veuillez saisir L'adresse:");
     String adresse=scanner.next();
     System.out.println("Veuillez saisir La Date de Naissance:");
     String dateNaissance=scanner.next();
     System.out.println("Veuillez saisir Le Lieu de Naissance:");
     String lieuNaissance=scanner.next();
     System.out.println("Veuillez saisir Le Matricule:");
     String matricule=scanner.next();
     System.out.println("Veuillez saisir Le Numero de Telephone:");
     String telephone=scanner.next();
     System.out.println("Veuillez saisir Le Genre:");
     String genre=scanner.next();
     System.out.println("Veuillez saisir L'EMAIL:");
     String email=scanner.next();
     System.out.println("Veuillez saisir La Nationnalite:");
     String nationnalite=scanner.next();
     System.out.println("Situation Matrimoniale:");
     String situationMatrimoniale=scanner.next();
     System.out.println("Veuillez saisir le groupe sanguin:");
     String groupeSanguin=scanner.next();
     Etudiant etudiant= new Etudiant( id,matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,telephone,email,nationnalite,genre,situationMatrimoniale,groupeSanguin);
     etudiantImp.addEtudiant(etudiant);
     System.out.println("Ajout Effectuer avec succès!");
        return etudiant;
    }
    
     public static void formulaireModificationEtudiant(){
       System.out.println("Id:");
       int idMod=scanner.nextInt();
       Etudiant etudiant3=etudiantImp.getEtudiantById(idMod);
       etudiantImp.updateEtudiant(etudiant3);
       System.out.println("Nom:");
       String nomE=scanner.next();
       etudiant3.setNom(nomE);
       System.out.println("Prenom:");
       String PrenomE=scanner.next();
       etudiant3.setPrenom(PrenomE);
       System.out.println("Adresse:");
       String AdresseE=scanner.next();
       etudiant3.setAdresse(AdresseE);
       System.out.println("Date de Naissance:");
       String DateE=scanner.next();
       etudiant3.setDateDeNaissance(DateE);
       System.out.println("Lieu de Naissance:");
       String LieuE=scanner.next();
       etudiant3.setLieuNaissance(LieuE);
       System.out.println("Matricule:");
       String matriculeE=scanner.next();
       etudiant3.setMatricule(matriculeE);
       System.out.println("Telephone:");
       String telephoneE=scanner.next();
       etudiant3.setTelephone(telephoneE);
       System.out.println("Email:");
       String emailE=scanner.next();
       etudiant3.setEmail(emailE);
       System.out.println("Nationnalite:");
       String nationnaliteE=scanner.next();
       etudiant3.setNationnalite(nationnaliteE);
       System.out.println("Situation Matrimoniale:");
       String situaltionE=scanner.next();
       etudiant3.setSituationMatrimoniale(situaltionE);
       System.out.println("Groupe Sanguin:");
       String groupeSanguinE=scanner.next();
       etudiant3.setGroupeSanguin(groupeSanguinE);
       System.out.println("Modification effectuer");
       
      }
     
     public static void formulaireVoirDetailsEtudiant(){
        System.out.println("Id:");
        int idE=scanner.nextInt();
        Etudiant etudiant6=etudiantImp.getEtudiantById(idE);
        System.out.println(etudiant6.getMatricule());
        System.out.println(etudiant6.getPrenom());
        System.out.println(etudiant6.getNom());
        System.out.println(etudiant6.getAdresse());
        System.out.println(etudiant6.getDateDeNaissance());
        System.out.println(etudiant6.getLieuNaissance());
        System.out.println(etudiant6.getTelephone());
        System.out.println(etudiant6.getGenre());
        System.out.println(etudiant6.getEmail());
        System.out.println(etudiant6.getNationnalite());
        System.out.println(etudiant6.getSituationMatrimoniale());
        System.out.println(etudiant6.getGroupeSanguin());
    }
     
     public static void formulaireSupprimerEtudiant(){
        System.out.println("Veuillez saisir L'Id");
        int ID=scanner.nextInt();
        Etudiant etudiant4=etudiantImp.getEtudiantById(ID);
        etudiantImp.deleteEtudiant(etudiant4);
        System.out.println("Suppression effectuer");
    }
    
   public  static void formulaireVoirTousLesEtudiant(){
     List<Etudiant> etudiants=  etudiantImp.getAllEtudiant();
      for(Etudiant etudiant5:etudiants){
            System.out.println(etudiant5.getNom());
            System.out.println(etudiant5.getPrenom());
            
       }  
    }
     
    public static String menuProfesseur(){
        String menuProfesseur="1-Ajouter Un Professeur\n";
        menuProfesseur+="2-Modifier Un Professeur\n";
        menuProfesseur+="3-Voir les Details D'un Professeur\n";
        menuProfesseur+="4-Supprimer Un Professeur\n";
        menuProfesseur+="5-Afficher tous les Professeur\n";
        menuProfesseur+="6-Quitter\n";
        return menuProfesseur;
    }
    
     public static Professeur formulaireCreationProfesseur(){
      System.out.println("Veuillez saisir L'ID");
      int id=scanner.nextInt();
      System.out.println("Veuillez saisir Le nom:");
      String nom=scanner.next();
      System.out.println("Veuillez saisir Le prenom:");
      String prenom=scanner.next();
      System.out.println("Veuillez saisir L'adresse:");
      String adresse=scanner.next();
      System.out.println("Veuillez saisir La Date de Naissance:");
      String dateNaissance=scanner.next();
      System.out.println("Veuillez saisir Le Lieu de Naissance:");
      String lieuNaissance=scanner.next();
      System.out.println("Veuillez saisir Le Matricule:");
      String matricule=scanner.next();
      System.out.println("Veuillez saisir Le Numero de Telephone:");
      String telephone=scanner.next();
      System.out.println("Veuillez saisir Le Genre:");
      String genre=scanner.next();
      System.out.println("Veuillez saisir L'EMAIL:");
      String email=scanner.next();
      System.out.println("Veuillez saisir La Nationnalite:");
      String nationnalite=scanner.next();
      System.out.println("Situation Matrimoniale:");
      String situationMatrimoniale=scanner.next();
      System.out.println("Veuillez saisir la specialite:");
      String specialite=scanner.next();
      Professeur professeur= new Professeur( id,matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,telephone,email,nationnalite,genre,situationMatrimoniale,specialite);
      professeurImp.addProfesseur(professeur);
      System.out.println("Ajout Effectuer avec succès!");   
   
        return professeur;
    }
     
  public static void formulaireModificationProfesseur(){
        System.out.println("Id:");
        int idMod=scanner.nextInt();
        Professeur professeur3=professeurImp.getProfesseurById(idMod);
        professeurImp.updateProfesseur(professeur3);
        System.out.println("Nom:");
        String nomP=scanner.next();
        professeur3.setNom(nomP);
        System.out.println("Prenom:");
        String PrenomP=scanner.next();
        professeur3.setPrenom(PrenomP);
        System.out.println("Adresse:");
        String AdresseP=scanner.next();
        professeur3.setAdresse(AdresseP);
        System.out.println("Date de Naissance:");
        String DateP=scanner.next();
        professeur3.setDateDeNaissance(DateP);
        System.out.println("Lieu de Naissance:");
        String LieuP=scanner.next();
        professeur3.setLieuNaissance(LieuP);
        System.out.println("Matricule:");
        String matriculeP=scanner.next();
        professeur3.setMatricule(matriculeP);
        System.out.println("Telephone:");
        String telephoneP=scanner.next();
        professeur3.setTelephone(telephoneP);
        System.out.println("Email:");
        String emailP=scanner.next();
        professeur3.setEmail(emailP);
        System.out.println("Nationnalite:");
        String nationnaliteP=scanner.next();
        professeur3.setNationnalite(nationnaliteP);
        System.out.println("Situation Matrimoniale:");
        String situaltionP=scanner.next();
        professeur3.setSituationMatrimoniale(situaltionP);
        System.out.println("Specialite:");
        String specialiteP=scanner.next();
        professeur3.setSpecialite(specialiteP);
        System.out.println("Modification effectuer");  
    }
  
  public static void formulaireVoirDetailsProfesseur(){
       System.out.println("Id:");
       int idP=scanner.nextInt();
       Professeur professeur6=professeurImp.getProfesseurById(idP);
       System.out.println(professeur6.getMatricule());
       System.out.println(professeur6.getPrenom());
       System.out.println(professeur6.getNom());
       System.out.println(professeur6.getAdresse());
       System.out.println(professeur6.getDateDeNaissance());
       System.out.println(professeur6.getLieuNaissance());
       System.out.println(professeur6.getTelephone());
       System.out.println(professeur6.getGenre());
       System.out.println(professeur6.getEmail());
       System.out.println(professeur6.getNationnalite());
       System.out.println(professeur6.getSituationMatrimoniale());
       System.out.println(professeur6.getSpecialite()); 
    }
  
    public static void formulaireSupprimerProfesseur(){
        System.out.println("Veuillez saisir L'Id");
        int ID=scanner.nextInt();
        Professeur professeur4=professeurImp.getProfesseurById(ID);
        professeurImp.deleteProfesseur(professeur4);
        System.out.println("Suppression effectuer");
    }
    
      public static void formulaireVoirTousProfesseur(){
           List<Professeur> professeurss=  professeurImp.getAllProfesseur();
           for(Professeur professeur5:professeurss){
           System.out.println(professeur5.getNom());
           System.out.println(professeur5.getPrenom());
      }
    }
    
     public static String menuGroupeEtudiant(){
        String menuProfesseur="1-Ajouter Un Etudiant dans le groupe\n";
        menuProfesseur+="2-Suppprimer Un Etudiant du groupe\n";
        menuProfesseur+="3-Afficher tous les Etudiants du Groupe\n";
        menuProfesseur+="4-Quitter\n";
        return menuProfesseur;
    }
    


}
