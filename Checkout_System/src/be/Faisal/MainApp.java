package be.Faisal;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        //
        Random random = new Random();
        // String chekOut = userInput.nextLine();
        int totalPrice = 0;
        StringBuilder basket = new StringBuilder();
        String product1 = "Bread";
        int quintityOfBread = 0;
        int p1Price = random.nextInt(1, 5);
        String product2 = "Milk";
        int quintityOfMilk = 0;
        int p2Price = random.nextInt(1, 5);
        String product3 = "Water";
        int quintityOfWater = 0;
        int p3Price = random.nextInt(1, 5);
        String product4 = "Chocolate";
        int quintityOfChocolate = 0;
        int p4Price = random.nextInt(1, 5);
        String product5 = "Apple";
        int quintityOfApple = 0;
        int p5Price = random.nextInt(1, 5);

        System.out.println("******** Welcome To My Shop **********");

        System.out.println("Here are the articles available in our shop with there prices : ");
        System.out.println(product1 + " = " + p1Price + "€.");
        System.out.println(product2 + " = " + p2Price + "€.");
        System.out.println(product3 + " = " + p3Price + "€.");
        System.out.println(product4 + " = " + p4Price + "€.");
        System.out.println(product5 + " = " + p5Price + "€.");
        System.out.println("********** Please make your choice or type 'Checkout' to stop your shopping! **********");
        String chekOut = "";
        Scanner userInput = new Scanner(System.in);
        // String  chekOut =userInput.nextLine().toLowerCase();
        while (!chekOut.equals("checkout")) {
            chekOut = userInput.nextLine().toLowerCase();
            if (chekOut.equals("checkout") && basket.isEmpty()) {
                System.out.println("you bought nothing!");
                break;
            }
            switch (chekOut) {
                case "bread":
                    if (quintityOfBread < 3) {
                        basket.append(chekOut + " ");
                        quintityOfBread++;
                        totalPrice = totalPrice + p1Price;
                        System.out.println("Your basket = " + basket);
                        System.out.println("Type 'checkout' to stop shopping.");
                    } else {
                        System.out.println("You have already 3 times bread in your basket,we can't give more breads sorry.");
                        System.out.println("Your basket = " + basket);
                    }
                    break;
                case "milk":
                    if (quintityOfMilk < 3) {
                        basket.append(chekOut + " ");
                        quintityOfMilk++;
                        totalPrice = totalPrice + p2Price;
                        System.out.println("Your basket = " + basket);
                        System.out.println("Type 'checkout' to stop shopping.");
                    } else {
                        System.out.println("You have already 3 times milk in your basket,we can't give more milk sorry.");
                    }
                    break;
                case "water":
                    if (quintityOfWater < 3) {
                        basket.append(chekOut + " ");
                        quintityOfWater++;
                        totalPrice = totalPrice + p3Price;
                        System.out.println("Your basket = " + basket);
                        System.out.println("Type 'checkout' to stop shopping.");
                    } else {
                        System.out.println("You have already 3 times water in your basket,we can't give more water sorry.");
                    }
                    break;
                case "chocolate":
                    if (quintityOfChocolate < 3) {
                        basket.append(chekOut + " ");
                        quintityOfChocolate++;
                        totalPrice = totalPrice + p4Price;
                        System.out.println("Your basket = " + basket);
                        System.out.println("Type 'checkout' to stop shopping.");
                    } else {
                        System.out.println("You have already 3 times chocolate in your basket,we can't give more chocolate sorry.");
                    }
                    break;
                case "apple":
                    if (quintityOfApple < 3) {
                        basket.append(chekOut + " ");
                        quintityOfApple++;
                        totalPrice = totalPrice + p5Price;
                        System.out.println("Your basket = " + basket);
                        System.out.println("Type 'checkout' to stop shopping.");
                    } else {
                        System.out.println("You have already 3 times apple in your basket,we can't give more apple sorry.");
                    }
                    break;
                default:
                    if (!chekOut.equals("checkout")) {
                        System.out.println("article is not in the shop!");
                    }

            }
            if (chekOut.equals("checkout") && !basket.isEmpty()) {
                System.out.println("You bought: " + basket + " ");
                System.out.println("Your Total Bill : " + totalPrice + "€");
            }
        }


    }
}
