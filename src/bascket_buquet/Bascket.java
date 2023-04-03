package bascket_buquet;

import java.util.*;


public class Bascket {
    private List<String> fruitBasket;

    Bascket(){
        fruitBasket=new ArrayList<>();

    }
    public boolean findFruit(String fruit){
       return  fruitBasket.contains(fruit);
    }
   public void addFruit(String fruit){
        fruitBasket.add(fruit);
   }
   public boolean removeFruit(String fruit){
        return fruitBasket.remove(fruit);
   }
   public int positionOfFruit(String fruit){
       int index=fruitBasket.indexOf(fruit);
       if(index!=-1){
           return index;
       }else return -1;
   }

    public String distinct(){
        Set<String>elementeUnice=new HashSet<>(fruitBasket);
            return elementeUnice.toString();
        }

    public int countFruits(){
        return fruitBasket.size();
    }
    public int CustomCountFruits(){
        int nr=0;
        if(fruitBasket.size()==0){
            System.exit(0);
        }else
        for(String fruit:fruitBasket){
            nr++;
        }
     return nr;
    }
}


