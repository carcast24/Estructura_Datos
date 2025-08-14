public class Rabbit implements Animal{
    
    private string furColor;
    private double earlenght;
    
    public Rabbit(string furColor, double earlenght){
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
    public makeSound(){
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
        System.out.println("Moviendo orejitas de " + earlenght + " cm" );
    }

    // getter methods

    public string getFurColor(){
        return this.furColor;
    }

    public double getEarlength(){
        return this.earlenght;
    }

}