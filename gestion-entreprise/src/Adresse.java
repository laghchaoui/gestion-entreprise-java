public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
    //constructeur
    public void Adresse(String rue,String ville,String codePostal){
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    //getters
    public String getRue(){return rue;}
    public String getVille(){return ville;}
    public String getCodePostal(){return codePostal;}
    //setters 
    public void setRue(String rue){this.rue = rue;}
    public void setVille(String ville){this.rue = ville;}
    public void setCodePostal(String codePostal){this.codePostal = codePostal;}
    
    @Override 
    public String toString(){
        return "Votre rue :"+rue+" Ville :"+ville+" Code Postal :"+codePostal;
    }
}
