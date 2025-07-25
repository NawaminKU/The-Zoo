package lib;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Screech!";
    }

    @Override
    public String fly() {
        return "The eagle soars throught the sky.";
    }
    
}
