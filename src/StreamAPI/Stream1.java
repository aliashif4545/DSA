package StreamAPI;

import java.util.ArrayList;

class Product
{
    int id;
    String name;
    double price;

    public Product(int id, String name,double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class Stream1 {

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,"Apple",83000));
        list.add(new Product(2,"HP",25000));
        list.add(new Product(1,"Lenovo",23000));
        list.add(new Product(1,"Dell",53000));

        list.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.price));


    }
}
