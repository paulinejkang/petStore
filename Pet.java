public class Pet{
    private int size;
    private int age;

    public Pet(int size, int age){
        this.size = size;
        this.age = age;
    }

    public int getSize(){
        return size;
    }

    public int getAge(){
        return age;
    }

    public void setSize(int size){
        this.size =  size;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Your pet is " + getSize() + "lbs and is " + getAge() + "years old";
    }
}