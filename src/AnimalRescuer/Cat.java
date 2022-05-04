package AnimalRescuer;



public class Cat extends Animal{

    public void purr(){
        System.out.println("Prrrr");
    }
    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    @Override
    public void  eat(){
        System.out.println("Cat is eating mouses");
    }

    @Override
    public void play(){
        System.out.println("Playing with a ball of yarn");
    }

    @Override
    public void sounds() {
        System.out.println("The cat says: meow!");
    }

}
