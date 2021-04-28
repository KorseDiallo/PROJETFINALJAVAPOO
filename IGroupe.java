
package projetjavapoo.dao;

import projejavapoo.Groupe;
import java.util.List;

/**
 *
 * @author DIALLO
 */
public interface IGroupe {
    
    public void addGroupe(Groupe groupe);
    public void updateGroupe(Groupe groupe);
    public void deleteGroupe(Groupe groupe);
    public Groupe getGroupeById(int id);
    public List<Groupe> getAllGroupe();
}
