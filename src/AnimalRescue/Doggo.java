package AnimalRescue;

public class Doggo {
     private int age;
     private String dogName;
    private String dogBreed;
    private String dogColor;
    private double dogWeight;
    private int height;
    private int healthLevel;
    private int happyLevel;
    private int hungerLevel;
    private String favouriteFood;
    private String favouriteActivity;


    public void feeding() {
        System.out.println("eats dog food");
    }

    public void sleeps() {
        System.out.println("dog snores while sleeping");
    }

    public void speaks() {
        System.out.println("Bork bork!!");
    }
    public void plays (){
        System.out.println("Playing fetch!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHappyLevel() {
        return happyLevel;
    }

    public void setHappyLevel(int happyLevel) {
        this.happyLevel = happyLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }
}
