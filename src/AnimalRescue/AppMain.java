package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Doggo dog = new Doggo();
        dog.setDogName("Dante");
        dog.setDogBreed("Labrador retriever");
        dog.setHappyLevel(8);
        dog.setHealthLevel(7);
        dog.setHeight(50);
        System.out.println("The dog's name is " + dog.getDogName());
        System.out.println("The dog's breed is " + dog.getDogBreed());
        System.out.println("The dog's health level is " + dog.getHealthLevel());
        System.out.println("The dog's happy level is " + dog.getHappyLevel());
        System.out.println("The dog's height is "+ dog.getHeight() + " cm.");

        Adopter adopter = new Adopter();
        adopter.setAdopterName("G.I. Joe");
        adopter.setAmountOfMoney(500);
        System.out.println("The adopter's name is " + adopter.getAdopterName());
        System.out.println("The amount of money available is " + adopter.getAmountOfMoney() + " RON.");

        DogFood dogfood = new DogFood();
        dogfood.setFoodName("Brit Care");
        dogfood.setFoodPrice(239);
        dogfood.setFoodQuantity(14);
        dogfood.setFoodStockAvailability(40);

        System.out.println("The name of the food is " + dogfood.getFoodName());
        System.out.println("The quantity of the food  is " + dogfood.getFoodQuantity() + " kg per bag.");
        System.out.println("The price of the food is " + dogfood.getFoodPrice() + " RON per bag.");
        System.out.println("The avaiable stock is " + dogfood.getFoodStockAvailability() + " bags.");

        Activity activity = new Activity();
        activity.setActivityName("Playing in puddles");

        System.out.println("The dog's favourite activity is " + activity.getActivityName());

        VeterinaryDoctor vetDr = new VeterinaryDoctor();
        vetDr.setVetName("Dr. Doolittle");
        vetDr.setVetSpecialization("Medical Veterinary Sciences");
        System.out.println("The vet's name is " + vetDr.getVetName());
        System.out.println("The vet's specialization is " + vetDr.getVetSpecialization());
    }
}
