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
    public void ajouterEmploye(Employe emp){
        this.employes.add(emp);
        System.out.println(emp.getNom() + " a bien été ajouté au département " + this.nomDepartement);
    }
}
