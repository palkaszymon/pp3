import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public int compareTo(Product other) {
        if(getName().compareTo(other.getName())>0){
            return 1;
        }
        else if(getName().compareTo(other.getName())<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        ArrayList<Product> arr = new ArrayList<Product>();
        Product p1 = new Product("Apple", 3.45);
        Product p2 = new Product("Parmezanik", 20.89);
        Product p3 = new Product("Carrot", 3.47);
        Product p4 = new Product("Baklazan", 3.32);
        Product p5 = new Product("Jpegmafia", 37.4);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        System.out.println("Before sort:");
        for(Product product : arr){
            System.out.println(product.getName() + " " + product.getPrice());
        }
        System.out.println("\n");
        Collections.sort(arr);
        System.out.println("After sort: ");
        for(Product product : arr){
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }
}
