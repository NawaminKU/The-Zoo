import java.util.ArrayList;

import lib.*;

public class Zoo {
    public static void main(String[] args) {
        printAnimal();
    }    
    
    public static void printAnimal() {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Lion("Lion"));
        animal.add(new Eagle("Eagle"));
        animal.add(new Penguin("Penguin"));
        animal.add(new Dolphin("Dolphin"));

        System.out.println();
        System.out.println("Animal sounds");
        System.out.println("----------------------------");
        
        for (Animal a : animal) {
            System.out.println(a.getName() + " : " + a.makeSound());
        }
        
        System.out.println();
        System.out.println("Animal special abilities");
        System.out.println("----------------------------");
        
        for (Animal a : animal) {
            if (a instanceof Flyable) {
                Flyable f = (Flyable) a;
                System.out.println(a.getName() + " : " + f.fly());
            } else if (a instanceof Swimable) {
                Swimable f = (Swimable) a;
                System.out.println(a.getName() + " : " + f.swim());
                
            } else {
                System.out.println("Walking in the Zoo.");
            }
        }
        
        System.out.println();
    }
}