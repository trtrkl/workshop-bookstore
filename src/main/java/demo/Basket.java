package demo;

import java.util.ArrayList;
import java.util.Dictionary;

public class Basket {

     public int id;
     public ArrayList<Dictionary<Book, Integer>> items;

     public Basket() {
          id = 0; //TODO auto-generated id
          items = new ArrayList<>();
     }

     public int calculatePrice(){
         return 0;
     }
}
