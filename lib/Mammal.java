package lib;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Mammal Sound";
    }
    
}
