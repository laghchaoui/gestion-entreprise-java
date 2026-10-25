public class Main {
    public static void main(String args[]){
        Developpeur dev1 = new Developpeur("E001", "YAHYA", 10000, NiveauPoste.EXPERT, "JAVA", 500);
        Developpeur dev2 = new Developpeur("E002", "LAGHCHAOUI", 15000, NiveauPoste.JUNIOR, "LARAVEL", 600);
        Developpeur dev3 = new Developpeur("E001", "YAHYA", 10000, NiveauPoste.EXPERT, "JAVA", 500);
        Manager manager = new Manager("E003", "MANAGER", 20000, NiveauPoste.EXPERT, 800);

        Departement deptIT = new Departement("INFORMATIQUE");
        deptIT.ajouterEmploye(dev1);
        deptIT.ajouterEmploye(dev2);
        deptIT.ajouterEmploye(dev3);
        deptIT.ajouterEmploye(manager);


        System.out.println("================================  Details des employes  =================================");
        System.out.println(dev1.toString());
        System.out.println(dev2.toString());
        System.out.println(dev3.toString());
        System.out.println(manager.toString());
        System.out.println("==========================================================================================");

        System.out.println("Nombre Total d'employes :"+Employe.getCompteurEmployes());


        //equals 
        System.out.println("dev1 equals dev2 ?? :"+dev1.equals(dev2));
        System.out.println("dev1 equals dev3 ?? :"+dev1.equals(dev3));

        Employe[] listEmployes = {dev1,dev2,dev3,manager};
        for(Employe emp : listEmployes){
            System.out.println("-> Employé : " + emp.getNom());
            System.out.println("-> Salaire Final  : " + emp.calculerSalaireFinal());
        }
    }

}
