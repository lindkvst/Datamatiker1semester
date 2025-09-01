package Lesson03.Homework;

import java.util.Random; //Importerer Random int generator klasse

public class tShirtItems {

    public static void main(String[] args) {
        //opretter tShirt objekter ud fra tShirt() klassen
        tShirt t1 = new tShirt();
        t1.print = "Leopard";
        t1.size = "L";
        t1.color = "dotted brown and orange";
        t1.cost = 350;

        tShirt t2 = new tShirt();
        t2.print = "Hawaii";
        t2.size = "XL";
        t2.color = "pink and teal";
        t2.cost = 150;

        tShirt t3 = new tShirt();
        t3.print = "Soul Train";
        t3.size = "L";
        t3.color = "brown and orange";
        t3.cost = 299;

  //      t1.listShirt();
  //      t2.listShirt();
  //      t3.listShirt();


        //laver array over mine tshirts
        tShirt[] shirts = {t1, t2, t3};

        Random r = new Random();
        int r1 = r.nextInt(shirts.length); // random værdi mellem 0 og 2

        System.out.println("Random index: " + r1);

        shirts[r1].chooseShirt();

        /*

       //følgende giver fejl, da jeg ikke kan bruge en variabel
       til at kalde et specifikt objekt i listShirt()

        Random r= new Random();

        int r1 = r.nextInt(3);
        r1 = r1 + 1;
        System.out.println(" random is " + r1);
        String itemRnd = "t" + r1;
        System.out.println(itemRnd);

        itemRnd.listShirt();


         */

    }

}
