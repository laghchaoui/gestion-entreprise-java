public class Developpeur extends Employe {
    public String specialisation;
    private double primeFixe;
    //constracteur
    public Developpeur(String id,String nom,double salaireDeBase,NiveauPoste niveau,String specialisation,double primeFixe){
        super(id, nom, salaireDeBase,niveau);
        this.specialisation = specialisation;
        this.primeFixe = primeFixe;
    }
    @Override 
    public double calculerSalaireFinal(){
        return getSalaireDeBase() + this.primeFixe;
    }
    @Override 
    public void evaluerPerformance(){
        System.out.println("Evaluation de la performance du developeur "+getNom()+" specialisation "+specialisation+" bon niveau thechnique");
    }
    //getters
    public String getSpecialisation(){return specialisation;}
    public double getPrimeFixe(){return primeFixe;}
    //setters
    public void setSpecialisation(String specialisation){this.specialisation = specialisation;}
    public void setPrimeFixe(double primeFixe){this.primeFixe = primeFixe;}
}