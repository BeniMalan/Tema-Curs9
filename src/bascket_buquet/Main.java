package bascket_buquet;

public class Main {
    public static void main(String[] args) {
Bascket cos=new Bascket();
Buquet buquet=new Buquet();
cos.addFruit("Mar");
cos.addFruit("Banana");
cos.addFruit("Para");
cos.addFruit("Para");

 buquet.addFlower("Lalea");
 buquet.addFlower("Trandafir");
 buquet.addFlower("Garoafa");
 buquet.addFlower("Lalea");
        System.out.println("Marul se gaseste in cos? "+cos.findFruit("Mar"));
        System.out.println("S-a eliminat marul din cos? "+cos.removeFruit("Mar"));
        System.out.println("Fructul se gaseste pe pozitia:"+cos.positionOfFruit("Mar"));
        System.out.println("Cosul este format din urmatoarele fructe "+cos.distinct());
        System.out.println("Numarul de fructe din cos este "+cos.countFruits());
        System.out.println("Numarul de fructe din cos este "+cos.CustomCountFruits());
        System.out.println("Buchetul de flori "+buquet.getALL());
        buquet.removeFlower("Lalea");
        System.out.println(buquet.getALL());
    }
}