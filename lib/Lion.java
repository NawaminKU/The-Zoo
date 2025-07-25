package lib;

public class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
    
}
