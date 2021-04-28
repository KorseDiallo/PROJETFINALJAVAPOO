
package projetjavapoo.dao;

import java.util.List;
import projejavapoo.Etudiant;

/**
 *
 * @author DIALLO
 */
public interface IEtudiant {
    
    public void addEtudiant(Etudiant etudiant);
    public void updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Etudiant etudiant);
    public Etudiant getEtudiantById(int id);
    public List<Etudiant> getAllEtudiant();
}
