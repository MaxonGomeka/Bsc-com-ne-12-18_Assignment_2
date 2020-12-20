public class AnimalFeed{
    private double maize;
    private double groundnuts;
    private double soya;
    private double salt;

    AnimalFeed(double maize,double groundnuts,double soya, double salt){
        this.maize= maize;
        this.groundnuts= groundnuts;
        this.soya = soya;
        this.salt = salt;


    }
    public void  setMaizeKgs(double maize){
        this.maize=  maize;
    }
    public  double getMaizeKgs(){
        double maizekgs = (0.6*maize);
        return maizekgs;
    }

    public void setGroundnuts(double groundnuts){
        this.groundnuts= groundnuts;
    }
    public  double getGroundnuts(){
        double gnutskgs = (0.15*groundnuts);
        return gnutskgs;
    }

    public void setSoya(double soya){
        this.soya= soya;
    }
    public  double getSoya(){
        double soyakgs = (0.2*soya);
        return soyakgs;
    }

    public void setSalt(double salt){
        this.salt= salt;
    }
    public  double getSalt(){
        double saltkgs = (0.05*salt);
        return saltkgs;
    }
    public double getSum(){
        double sum = getMaizeKgs() + getGroundnuts() + getSalt() + getSoya() ;
        return sum;
    }
    public String getAnimaleFeed(){
        String animalfeed = " You will use (kgs)"+ "\n "+"Maize : " +this.getMaizeKgs()+ "\n"+
                           "Soya : " + this.getSoya()+ "\n" + "GroundNuts: " +this.getGroundnuts()+"\n"+
                           "Salt: "+(this.getSalt())+ "\n" +"You will make "+this.getSum()+ "kg " +" of feed" ;
                  return animalfeed;

    }







}
