public class Dog extends Pet{
    private String furColor;
    private String breed;

    public Dog(int size, int age, String furColor, String breed){
        super(size, age);
        this.furColor = furColor;
        this.breed = breed;
    }

    public String getFurColor(){
        return furColor;
    }

    public String getBreed(){
        return breed;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public String toString(){
        return ("Dog color: " + getFurColor() + " Dog breed: " + getBreed());
    }
}