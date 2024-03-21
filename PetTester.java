import java.util.*;

import java.util.*;
public class PetTester{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<Pet>();

        while(true){
            System.out.println("What type of pet? (rabbit, dog, cat)");
            System.out.println("(exit to quit)");
            String type = in.nextLine();
            if(type.equals("exit"))break;
            System.out.println("What size(in lbs)?");
            int size = in.nextInt();
            in.nextLine();
            System.out.println("What age?");
            int age = in.nextInt();
            in.nextLine();
            if(type.equals("rabbit")){
                System.out.println("Fur color");
                String fur = in.nextLine();
                System.out.println("Do you want a cage? (Y/N)");
                String cageE = in.nextLine();
                Boolean cage = true;
                if(cageE.equals("Y")) cage = true;
                if(cageE.equals("N")) cage = false;
                pets.add(new Rabbit(size, age, fur, cage));
            }
            if(type.equals("dog")){
                System.out.println("Fur color");
                String fur = in.nextLine();
                System.out.println("What breed?");
                String breed = in.nextLine();
                pets.add(new Dog(size, age, fur, breed));
            }
            if(type.equals("cat")){
                System.out.println("Fur color");
                String fur = in.nextLine();
                System.out.println("Litter Box (Y/N)");
                String litter = in.nextLine();
                Boolean litterBox = true;
                if(litter.equals("Y")) litterBox = true;
                if(litter.equals("N")) litterBox = false;
                pets.add(new Cat(size,age,fur,litterBox));
            }
        }
        for (Pet pet: pets){
            System.out.println(pet.toString());
        }
    }
}