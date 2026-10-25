import java.util.List;
import java.util.ArrayList;
public class Departement {
    private String nomDepartement;
    private List<Employe> employes;
    //constracteur
    public Departement(String nomDepartement){
        this.nomDepartement = nomDepartement;
        this.employes = new ArrayList<>();
    }
}
