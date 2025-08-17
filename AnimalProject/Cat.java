public class Cat implements Animal{
    private String cria;
    private int lives;

    public Cat(String cria, int lives){
        this.cria = cria;
        this.lives = lives;
    }
    @Override
    public void eat(){
        System.out.println("comiedo pescado");
    }

    @Override
    public void sleep(){
        System.out.println("Durmiendo ensima de Karen");
    }

    @Override
    public void makeSound(){
        System.out.println("ronronea..");
    }

    @Override
    public void move(){
        System.out.println("escalando cortinas...");
    }

    @Override
    public String getSpecies(){
        return "Cat(gato)";
    }

    

}
