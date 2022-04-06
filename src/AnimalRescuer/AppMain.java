package AnimalRescuer;

public class AppMain {

    public static void main (String [] args) {

        Dog animal = new Dog();
        Adopter adopt = new Adopter();
        AnimalsFood food = new AnimalsFood();
        RecreationalActivity activity = new RecreationalActivity();
        Veterinarian doctor = new Veterinarian();

        String adoptername = adopt.name;
        System.out.println(adopt.name);
        int adopterage = adopt.age;
        System.out.println(adopt.age);
        double money = adopt.amountOfMoneyAvailable;
        System.out.println(adopt.amountOfMoneyAvailable);


         String animalName = animal.name;
        System.out.println("Name of the dog is " +  animal.name);
        int age = animal.ageInMonths;
        System.out.println("Age of the puppy is " + animal.ageInMonths);
        int health = animal.healthStatus;
        System.out.println("The state of health of the puppy is at level " + animal.healthStatus);
        int starving = animal.starving;
        System.out.println("The level of starvation is " + animal.starving);
        int mood = animal.stateOfMind;
        System.out.println ("The state of mind is " + animal.stateOfMind);
        String favFood = animal.favoriteFood;
        System.out.println ( " Fav food -> " + animal.favoriteFood);
        String activities = animal.recreationalActivity;
        System.out.println (animal.recreationalActivity);

        String nameOfFood = food.name;
        System.out.println("The name of food is " + food.name);
        String priceOfFood = food.price;
        System.out.println("The price is " + food.price);
        String checkstock = food.stockAvailability;
        System.out.println("The status of stock availability is " + food.stockAvailability);
        double quantityOfFood = food.quantityInGrams;
        System.out.println("Quantity of food in grams=" + food.quantityInGrams);

        String nameOfActivity = activity.name;
        System.out.println("Name of activity -> "+ activity.name);

        String nameOfDoctor = doctor.name;
        System.out.println("Name of doctor is " + doctor.name);
        String specialization = doctor.specialization;
        System.out.println("Doctor specialization is " + doctor.specialization);

    }
}
