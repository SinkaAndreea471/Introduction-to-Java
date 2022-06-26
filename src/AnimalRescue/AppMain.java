package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Doggo dog = new Doggo();
        System.out.println("The dog's name is " + dog.dogName);
        System.out.println("The dog's breed is " + dog.dogBreed);
        System.out.println("The dog's health level is " + dog.healthLevel);
        System.out.println("The dog's happy level is " + dog.happyLevel);
        System.out.println("The dog's height is "+ dog.height + " cm.");

        Adopter adopter = new Adopter();
        System.out.println("The adopter's name is " + adopter.adopterName);
        System.out.println("The amount of money available is " + adopter.amountOfMoney + " RON.");

        DogFood dogfood = new DogFood();
        System.out.println("The name of the food is " + dogfood.foodName);
        System.out.println("The quantity of the food  is " + dogfood.foodQuantity + " kg per bag.");
        System.out.println("The price of the food is " + dogfood.foodPrice + " RON per bag.");
        System.out.println("The avaiable stock is " + dogfood.foodStockAvailability + " bags.");

        Activity activity = new Activity();
        System.out.println("The dog's favourite activity is " + activity.activityName);

        VeterinaryDoctor vetDr = new VeterinaryDoctor();
        System.out.println("The vet's name is " + vetDr.vetName);
        System.out.println("The vet's specialization is " + vetDr.vetSpecialization);
    }
}
