import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShoppingApp {

    public static void main(String[] args) throws FileNotFoundException {

        InventoryBag<String[]> inv = new InventoryBag<>();
        ShoppingBasket<String[]> basket = new ShoppingBasket<>();
        MeatsCompartments<String[]> meat = new MeatsCompartments<>();
        BeveragesCompartment<String[]> beverages = new BeveragesCompartment<>();
        SnacksCompartment<String[]> snacks = new SnacksCompartment<>();
        VegetablesFruitsCompartment<String[]> vegetablesAndFruits = new VegetablesFruitsCompartment<>();

        // READ ITEMS FROM INVENTORY.TXT
        File _file = new File("inventory.txt");
        Scanner myReader = new Scanner(_file);

        while(myReader.hasNextLine()) {
            String str = myReader.nextLine();
            String[] arr = str.split(",");
            inv.add(arr);
        }
        // FİNİSH TO READİNG

        while(true)
        {
            Scanner scan = new Scanner(System.in);
            // PROGRAM START FROM HERE .

            System.out.println("Welcome to The Shopping App!");
            System.out.println("Please select an option:");
            System.out.println("[1]Go to shopping");
            System.out.println("[2]See the status of the fridge");
            System.out.println("[3]Exit");

            int choose = scan.nextInt();

            if (choose == 1) {
            while(true) {

                System.out.println("Please select an option:");
                System.out.println("[1]Add an item to the basket");
                System.out.println("[2]See the basket");
                System.out.println("[3]Finish shopping");

                int userOfChoosen = scan.nextInt();

                if (userOfChoosen == 1)
                {

                    System.out.println("Please select an item:");

                    // THE USER WHO GO TO MALL CHOICE ANY ITEM.

                    inv.displayItems();
                    int chooseItem = scan.nextInt();

                    if (basket.add(inv.getItem(chooseItem))) {

                        String[] x = inv.getItem(chooseItem);
                        System.out.println(x[0] + " is added to the basket");
                            if (basket.isEmpty()) {
                                if (basket.isFull()) {
                                    System.out.println("Basket is full now");
                                    System.out.println("Shopping is finished and going to fill the fridge");
                                    System.out.println("The fridge is filled");
                                    String[] item;


                                    for (int i = 0; i <= basket.getItemCount() ; i++) {

                                        item = basket.remove();
                                        if(item==null){
                                            break;
                                        }
                                        else if (item[1].equals("meats")) {
                                            if (meat.add(item))
                                            {

                                            }
                                            else
                                                System.out.println(item[0]+" couldn't be added to the fridge");


                                        }
                                        else if(item[1].equals("vegetables and fruits"))
                                        {
                                            if (meat.add(item))
                                            {

                                            }
                                            else
                                            {
                                                System.out.println(item[0]+" couldn't be added to the fridge");
                                            }



                                        }
                                        else if (item[1].equals("snacks"))
                                        {
                                            if (meat.add(item))
                                            {

                                            }
                                            else
                                                {
                                                System.out.println(item[0] + " couldn't be added to the fridge");
                                                }



                                        }
                                        else if (item[1].equals("beverages"))
                                        {

                                            if (meat.add(item))
                                            {

                                            }
                                            else
                                                {
                                                System.out.println(item[0] + " couldn't be added to the fridge");
                                                }



                                        }
                                        else{
                                            System.out.println("Warning ! ");
                                        }

                                    }break;

                            } else
                                {
                                System.out.println("You cannot add any more items to the basket");
                                System.out.println("Shopping is finished and going to fill the fridge");
                                System.out.println("The fridge is filled");
                                String[] item;


                                for (int i = 0; i <= basket.getItemCount(); i++) {

                                    item = basket.remove();
                                    if(item==null){
                                        break;


                                    }
                                    else if (item[1].equals("meats")) {

                                        if (meat.add(item)) {
                                            }
                                        else System.out.println(item[0]+" couldn't be added to the fridge");

                                    }

                                    else if (item[1].equals("vegetables and fruits")) {
                                        if (meat.add(item)) {

                                            }
                                        else System.out.println(item[0]+" couldn't be added to the fridge");


                                    }
                                    else if (item[1].equals("snacks")) {
                                        if (meat.add(item)) {

                                            }
                                        else
                                            System.out.println(item[0]+" couldn't be added to the fridge");



                                        }
                                    else if (item[1].equals("beverages")) {
                                        if (meat.add(item))
                                        {

                                        }
                                        else
                                            System.out.println(item[0]+" couldn't be added to the fridge");



                                        }

                                    }break;

                                }

                        }
                    } else {
                        System.out.println("You can not add this item to the basket");
                    }
                } else if (userOfChoosen == 2) {
                    basket.displayItems();
                } else if (userOfChoosen == 3) {
                    System.out.println("Shopping is finished and going to fill the fridge");
                    System.out.println("The fridge is filled");
                    String[] item;


                    for (int i = 0; i <= basket.getItemCount(); i++) {
                        item = basket.remove();
                        if (item==null){


                        }


                        else if (item[1].equals("meats")) {
                            if (meat.add(item)) {




                            }
                            else System.out.println(item[0]+" couldn't be added to the fridge");


                        } else if (item[1].equals("vegetables and fruits")) {
                            if (meat.add(item)) {

                            }
                            else System.out.println(item[0]+" couldn't be added to the fridge");



                        } else if (item[1].equals("snacks")) {
                            if (meat.add(item)) {

                            }
                            else System.out.println(item[0]+" couldn't be added to the fridge");



                        } else if (item[1].equals("beverages")) {
                            if (meat.add(item)) {

                            }
                            else System.out.println(item[0]+" couldn't be added to the fridge");



                            }


                        }break;

                    }
                }
            }
            // SEE THE STATUS OF FRİDGE
            else if(choose==2){
                System.out.println("Remaining capacities of each compartments:");
                System.out.println("Vegetables and Fruits"+vegetablesAndFruits.getRemainingCapacity()+" grams");
                System.out.println("Meats: "+meat.getRemainingCapacity()+" grams");
                System.out.println("Beverages"+beverages.getRemainingCapacity()+" grams");
                System.out.println("Snacks "+snacks.getRemainingCapacity()+" grams");

            }
            // EXİT

            else if (choose == 3) {
                System.exit(0);
            }
        }

    }
}
