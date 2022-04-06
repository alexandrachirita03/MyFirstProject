package AnimalRescuer;

public class AppMain {

    public static void main (String [] args) {

        Dog animal = new Dog();
        Adopter adopt = new Adopter();
        AnimalsFood food = new AnimalsFood();
        RecreationalActivity activity = new RecreationalActivity();
        Veterinarian doctor = new Veterinarian();
        System.out.println(adopt.name);
         String animalName = animal.name;
        System.out.println("Name of the dog is" + animal.name);
    }
}
