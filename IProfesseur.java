
package projetjavapoo.dao;

import java.util.List;
import projejavapoo.Professeur;

/**
 *
 * @author DIALLO
 */
public interface IProfesseur {
    
    public void addProfesseur(Professeur professeur);
    public void updateProfesseur(Professeur professeur);
    public void deleteProfesseur(Professeur professeur);
    public Professeur getProfesseurById(int id);
    public List<Professeur> getAllProfesseur();
}
