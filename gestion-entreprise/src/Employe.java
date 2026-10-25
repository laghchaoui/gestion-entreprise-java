public abstract class Employe implements Auditable {
    //attributs
    private String id;
    private  String nom;
    private double salaireDeBase;
    private  NiveauPoste niveau;
    private Adresse adresse;
    private static int compteurEmployes = 0;
    //constructeur
    public Employe(String id,String nom,double salaireDeBase,NiveauPoste niveau){
        this.id = id;
        this.nom = nom;
        this.salaireDeBase = salaireDeBase;
        this.niveau = niveau;
        compteurEmployes++;
    }
    //getters
    public String getId(){return id;}
    public String getNom(){return nom;}
    public double getSalaireDeBase(){return salaireDeBase;}
    public NiveauPoste getNiveau(){return niveau;}
    public static int getCompteurEmployes(){return compteurEmployes;}
    //setters
    public void setId(String id){this.id = id;}
    public void setNom(String nom){this.nom = nom;}
    public void setSalaireDeBase(double salaireDeBase){this.salaireDeBase = salaireDeBase;}
    public void setNiveau(NiveauPoste niveau){this.niveau = niveau;}

    //Une méthode abstraite double calculerSalaireFinal();
    public abstract double calculerSalaireFinal();

    @Override
    public String toString(){
        return "Employee { "+"id= '"+id+"' nom= '"+nom+"' Salaire de Base= '"+salaireDeBase+"' Poste Niveau= '"+niveau+"' }";
    }
    @Override 
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return java.util.Objects.equals(id,employe.id);
    }
    @Override 
    public int hashCode(){
        return java.util.Objects.hash(id);
    }
}
