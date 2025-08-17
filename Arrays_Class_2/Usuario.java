public class Usuario {
    private String name;
    private String lastName;
    private String id;
    private boolean isAvailable;
    private String loans;

    public Usuario(String name, String lastName, String id, String loans){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.loans = loans;
        this.isAvailable = true;
    }
    //getter
    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getId(){
        return this.id;
    }

    public String getLoans(){
        return this.loans;
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

}
