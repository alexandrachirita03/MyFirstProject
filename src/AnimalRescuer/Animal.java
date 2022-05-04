package AnimalRescuer;

public abstract class Animal {

    private String name;
    private int ageInMonths;
    private int healthStatus;
    private int starving;
    private int stateOfMind;
    private String favoriteFood;
    private String recreationalActivity;



    public abstract void  eat();
    public abstract void sleep();
    public abstract void play();
    public abstract void sounds();

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAgeInMonths(){
        return ageInMonths;
    }
    public void setAgeInMonths(int ageInMonths){
        this.ageInMonths = ageInMonths;
    }

    public int getHealthStatus(){
        return healthStatus;
    }
    public void setHealthStatus(int healthStatus){
        this.healthStatus = healthStatus;
    }

    public int getStarving(){
        return starving;
    }
    public void setStarving(int starving){
        this.starving = starving;
    }

    public int getStateOfMind(){
        return stateOfMind;
    }
    public void setStateOfMind(int stateOfMind){
        this.stateOfMind = stateOfMind;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getRecreationalActivity(){
        return recreationalActivity;
    }
    public void setRecreationalActivity(String recreationalActivity){
        this.recreationalActivity = recreationalActivity;
    }
}
