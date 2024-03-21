public class Rabbit extends Pet{
    private String furColor;
    private Boolean cage;

    public Rabbit(int size, int age, String furColor, Boolean cage){
        super(size, age);
        this.furColor = furColor;
        this.cage = cage;
    }

    public String getFurColor(){
        return furColor;
    }

    public Boolean getCage(){
        return cage;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public void setCage(Boolean cage){
        this.cage = cage;
    }

    @Override
    public String toString(){
        String cageE = "";
        if(getCage()) cageE = "needed";
        if(!getCage())cageE = "unneccesary";
        return ("Rabbit color: " + getFurColor() + " Rabbit cage: " + cageE);
    }
}