public class AnimalFeed{
    //declaring variables
    private double maize;
    private double groundnuts;
    private double soya;
    private double salt;

//Animal feed argument contructor
    AnimalFeed(double maize,double groundnuts,double soya, double salt){
        this.maize= maize;
        this.groundnuts= groundnuts;
        this.soya = soya;
        this.salt = salt;


    }
    //setter method for maize variable
    public void  setMaizeKgs(double maize){
        this.maize=  maize;
    }
    //getter method for maize variable
    public  double getMaizeKgs(){
        double maizekgs = (0.6*maize);
        return maizekgs;
    }
      //setter method for groundnut variable
    public void setGroundnuts(double groundnuts){
        this.groundnuts= groundnuts;
    }
      //getter method for groundnut variable
    public  double getGroundnuts(){
        double gnutskgs = (0.15*groundnuts);
        return gnutskgs;
    }
    
    //setter method for soya variable
    public void setSoya(double soya){
        this.soya= soya;
    }
 //getter method for soya variable
    public  double getSoya(){
        double soyakgs = (0.2*soya);
        return soyakgs;
    }
      //setter method for salt variable
    public void setSalt(double salt){
        this.salt= salt;
    }
     //getter method for salt variable
    public  double getSalt(){
        double saltkgs = (0.05*salt);
        return saltkgs;
    }
    //Adding method that get the total kgs to be used
    public double getSum(){
        double sum = getMaizeKgs() + getGroundnuts() + getSalt() + getSoya() ;
        return sum;
    }
    //Getting all the animal feed details
    public String getAnimaleFeed(){
        String animalfeed = " You will use (kgs)"+ "\n "+"Maize : " +this.getMaizeKgs()+ "\n"+
                           "Soya : " + this.getSoya()+ "\n" + "GroundNuts: " +this.getGroundnuts()+"\n"+
                           "Salt: "+(this.getSalt())+ "\n" +"You will make "+this.getSum()+ "kg " +" of feed" ;
                  return animalfeed;

    }







}
