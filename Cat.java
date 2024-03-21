public class Cat extends Pet{
    private String furColor;
    private Boolean litterBox;

    public Cat(int size, int age, String furColor, Boolean litterBox){
        super(size, age);
        this.furColor = furColor;
        this.litterBox = litterBox;
    }

    public String getFurColor(){
        return furColor;
    }

    public Boolean getlitterBox(){
        return litterBox;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public void  setlitterBox(Boolean litterBox){
        this.litterBox = litterBox;
    }

    @Override
    public String toString(){
        String litterBoxE = "";
        if(getlitterBox()) litterBoxE = "needed";
        if(!getlitterBox()) litterBoxE = "unneccesary";
        return ("Cat color: " + getFurColor() + " Cat Litter Box: " + litterBoxE);
    }
}