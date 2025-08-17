public class Rabbit implements Animal{
    
    private String furColor;
    private double earlength;
    
    public Rabbit(String furColor, double earlenght){
        this.furColor = furColor;
        this.earlength = earlenght;
    }

    @Override
    public void eat(){
        System.out.println("comiedo zanahorias");
    }

    @Override
    public void sleep(){
        System.out.println("Durmiendo en Madriguera");
    }

    @Override
    public void makeSound(){
        System.out.println("Zapatea..");
    }

    @Override
    public void move(){
        System.out.println("Saltando...");
    }

    @Override
    public String getSpecies(){
        return "Rabbit(conejo)";
    }

    public void dig(){
        System.out.println("cavando madriguera");
    }

    public void wiggleEars(){
        System.out.println("Moviendo orejitas de " + earlength + " cm" );
    }

    // getter methods

    public String getFurColor(){
        return this.furColor;
    }

    public double getEarlength(){
        return this.earlength;
    }

}