package AnimalRescuer;

public class Dog extends Animal {

@Override
    public void play(){
        System.out.println("Playing fetch");
    }

   @Override
   public void eat() {

       System.out.println("Eating bones");
    }



    @Override

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
     public void sounds() {
        System.out.println("The dos says: woof, woof!");
    }
}

