public class Manager extends Employe {
    public double bonusEquipe;
    //constructeur
    public Manager(String id,String nom,double salaireDeBase,NiveauPoste niveau,double bonusEquipe){
        super(id, nom, salaireDeBase,niveau);
        this.bonusEquipe = bonusEquipe;
    }
    @Override 
    public double calculerSalaireFinal(){
        return getSalaireDeBase();
    }
    @Override 
    public void evaluerPerformance() {
        System.out.println("Évaluation de la performance du manager " + getNom() + " : Objectifs d'équipe atteints.");
    }

    public double getBonusEquipe(){return bonusEquipe;}
}
