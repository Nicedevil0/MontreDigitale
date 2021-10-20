import java.util.ArrayList;
import java.util.List;

public class Stockage {
    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public boolean removeCompte(CompteBancaire compte){
        return comptes.remove(compte);
    }

    public boolean removeCompte(String id){
        int a=-1;
        for(CompteBancaire c : comptes){
            if(c.getNumero().equals(id)){
                comptes.remove(c);
                return true;
            }
        }
        return false;
    }

    public void addCompte(CompteBancaire compte) {
        this.comptes = comptes;
    }

    List<CompteBancaire> comptes = new ArrayList<CompteBancaire>();

}
