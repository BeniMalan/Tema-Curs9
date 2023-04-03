package bascket_buquet;

import java.util.HashSet;
import java.util.Set;

public class Buquet {
 private Set<String>buquetFlori;
 Buquet(){
  buquetFlori=new HashSet<>();
 }
 public String getALL() {
   return buquetFlori.toString();
  }


 public void addFlower(String flower){
  buquetFlori.add(flower);
 }
 public void removeFlower(String flower){
  buquetFlori.remove(flower);
 }

}
