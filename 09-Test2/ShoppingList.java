import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> products = new ArrayList<Product>();

    public void add(Product product){
        this.products.add(product);
    }

    public String toString(){
        String result = "";
        for(Product product : products){
            result+=product.getName() + ",";
        }return result.substring(0, result.length()-1);
    }

    public int total(){
        int count=0;
        for(Product product : products){
            count+=product.getQuantity();
        }return count;
    }

    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        Product p1 = new Product("milk", 2);
        Product p2 = new Product("apple", 4);
        sl.add(p1);
        sl.add(p2);
        System.out.println(sl.toString());
        System.out.println(sl.total());
    }
}
