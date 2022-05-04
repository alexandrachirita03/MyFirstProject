package AnimalRescuer;

public class Labrador extends Dog {

    @Override
    public void eat(){
        System.out.println("Eating Royal Canin");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping in the doghouse");
    }

    @Override
    public void play(){
        System.out.println("Is chasing after cats!");
    }

   // @Override
   // public void sounds(){
    //    System.out.println("The dos says: woof, woof!");
   // }
}
