
package projejavapoo;

import java.util.List;
import java.util.Scanner;
import projetjavaimp.EtudiantImp;
import projetjavaimp.GroupeImp;
import projetjavaimp.ProfesseurImp;
import projejavapoo.Etudiant;
import projejavapoo.Groupe;
import projejavapoo.Professeur;
import projetjavaimp.GroupeEtudiantImp;

/**
 *
 * @author DIALLO
 */
public class Test {
    
    public static void main(String[] args) {
        EtudiantImp etudiantImp= new EtudiantImp() ;
        GroupeEtudiantImp groupeEtudiantImp;
        GroupeImp gi= new GroupeImp();
   
        boolean var=true;
        while(var){
            String affichage= Menu.menuPrincipal();
            System.out.println(affichage);
            Scanner scanner= new Scanner(System.in);
            System.out.println("Faites votre Choix");
            int choix=scanner.nextInt();
            switch(choix){
               
                case 1:
                     boolean var1=true;
                     while(var1){
                    System.out.println("Gestion Groupe");
                      String  affichageGroupe= Menu.menuGroupe();
                      System.out.println(affichageGroupe);
                      System.out.println("choisisser Un option:");
                      int option=scanner.nextInt();
                      switch(option){
                          case 1:
                             System.out.println("Creer Un Groupe");
                             Menu.formulaireCreationGroupe();
                             break;
                          case 2:
                               System.out.println("Modifier Un Groupe");
                              Menu.formulaireModificationGroupe();
                              break;
                          case 3:
                              System.out.println("Voir les details d'un Groupe");
                              Menu.formulaireVoirDetailsGroupe();
                             break;
                         case 4:
                             System.out.println("Supprimer Un Groupe");
                             Menu.formulaireSupprimerGroupe();
                           break;
                         case 5:
                             System.out.println("Afficher tous les Groupes");
                             Menu.formulaireVoirTousLesGroupe();
                          break;
                          case 6:
                              System.out.println("Retour au Menu Principal");
                              var1=false;
                              var=true;
                              break;
                         default:
                             System.out.println("OUPS");
                      }
                     }
                    break;
                    
                 case 2:
                     boolean var2=true;
                     while(var2){
                     System.out.println("Gestion Etudiant");
                     String  affichageEtudiant= Menu.menuEtudiant();
                      System.out.println(affichageEtudiant);
                      System.out.println("choisisser Un option:");
                      int option1=scanner.nextInt();
                      switch(option1){
                          case 1:
                              System.out.println("Ajouter Un Etudiant");
                              Menu.formulaireCreationEtudiant();
                             break;
                          case 2:
                              System.out.println("Modifier Un Etudiant");
                              Menu.formulaireModificationEtudiant();
                              break;
                          case 3:
                             System.out.println("Voir les details d'un Etudiant");
                             Menu.formulaireVoirDetailsEtudiant();
                              break;
                         case 4:
                            System.out.println("Supprimer Un Etudiant");
                            Menu.formulaireSupprimerEtudiant();
                              break;
                         case 5:
                            System.out.println("Afficher tous les Etudiants");
                            Menu.formulaireVoirTousLesEtudiant();
                              break;
                          case 6:
                              System.out.println("Retour au Menu Principal");
                              var2=false;
                              var=true;
                              break;
                         default:
                             System.out.println("OUPS");
                      }
                      }
                     
                    break;
                  case 3:
                      boolean var3=true;
                      while(var3){
                     System.out.println("Gestion Professeur");
                     String  affichageProfesseur= Menu.menuProfesseur();
                      System.out.println(affichageProfesseur);
                      System.out.println("choisisser Un option:");
                      int option2=scanner.nextInt();
                      switch(option2){
                          case 1:
                          System.out.println("Ajouter Un Professeur");
                          Menu.formulaireCreationProfesseur();
                              break;
                              
                          case 2:
                          System.out.println("Modifier Un Professeur");
                          Menu.formulaireModificationProfesseur();
                              break;
                              
                          case 3:
                           System.out.println("Voir les details d'un Professeur");
                           Menu.formulaireVoirDetailsProfesseur();
                              break;
                              
                         case 4:
                              System.out.println("Supprimer Un Professeur");
                              Menu.formulaireSupprimerProfesseur();
                              break;
                              
                         case 5:
                             System.out.println("Afficher tous les Professeur");
                             Menu.formulaireVoirTousProfesseur();
                              break;
                              
                          case 6:
                              System.out.println("Retour au Menu Principal");
                              var3=false;
                              var=true;
                              break;
                         default:
                             System.out.println("OUPS");
                      }
                      }
                      
                    break;
                  case 4:
                      boolean var4=true;
                      while(var4){
                      System.out.println("Gestion Groupe/Etudiant");
                      String affichageGroupeEtudiant=Menu.menuGroupeEtudiant();
                      System.out.println("Donner l'Id du Groupe");
                      int idGRE=scanner.nextInt();
                     // GroupeImp gi= new GroupeImp();
                      Groupe gp = gi.getGroupeById(idGRE);
                      groupeEtudiantImp = new GroupeEtudiantImp(gp,etudiantImp.getAllEtudiant());
                      
                      //groupeEtudiantImp=ge;
                      System.out.println(affichageGroupeEtudiant);
                      System.out.println("Faites votre choix");
                      int CHOIX= scanner.nextInt();
                      switch(CHOIX){
                          case 1:
                              System.out.println("Ajout Un Etudiant dans le groupe");
                              System.out.println("Veuillez saisir l'ID à inserer");
                              int id= scanner.nextInt();
                              groupeEtudiantImp.addEtudiantGroupe(id);
                              break;
                           case 2:
                               System.out.println("");
                              break;
                            case 3:
                                System.out.println("Affichage des Etudiants du groupe");
                                //groupeEtudiantImp.showEtudiantGroupe();
                              break;
                             case 4:
                                 System.out.println("RETOUR AU MENU PRINCIPAL");
                                 var4=false;
                                var=true;
                              break;
                             default:
                                 System.out.println("OUps");
                      }
                      }
                      
                    break;
                  case 5:
                    System.out.println("BYE BYE");
                    System.exit(0);
                    break;
                  default:
                      System.out.println("OUPS chiffre non disponible!");
            }
        }
        
    }
}
