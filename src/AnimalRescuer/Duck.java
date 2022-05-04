package AnimalRescuer;

public class Duck extends Animal {


    public void quacks() {
        System.out.println("Mac-mac");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void play(){
        System.out.println("Duck playing in the mud");
    }

    @Override
    public void sounds() {
        System.out.println("The duck says: mac!");
    }
}
