
package projetjavaimp;

import java.util.ArrayList;
import java.util.List;
import projejavapoo.Groupe;
import projetjavapoo.dao.IGroupe;


public class GroupeImp implements IGroupe {

   
    
    
    List<Groupe> groupes= new ArrayList<>();
    
     public GroupeImp() {
         this.groupes= new ArrayList<Groupe>();
    }
    @Override
    public void addGroupe(Groupe groupe) {
        groupes.add(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
        for(Groupe groupe2:groupes){
            if(groupe2.getId()==groupe.getId()){
                groupe2.setNomGroupe(groupe.getNomGroupe());
                groupe2.setDateCreation(groupe.getDateCreation());
            }
        }
    }

    @Override
    public void deleteGroupe(Groupe groupe) {
        groupes.remove(groupe);
    }

    @Override
    public Groupe getGroupeById(int i) {
           for(Groupe groupe:groupes){
            
            if(groupe.getId()==i ){
                return groupe;
            } 
        }
        return null;
    }

    @Override
    public List<Groupe> getAllGroupe() {
       return  groupes;
    }   
}
