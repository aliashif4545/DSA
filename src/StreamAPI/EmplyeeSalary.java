package StreamAPI;

import java.util.Arrays;
import java.util.List;

class Emp
{
    int id;
    String name;
    int salary;

    public Emp(int id, String name,int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class EmplyeeSalary {

    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
                new Emp(101,"Ashif Ali",50000),
                new Emp(102,"Ashiayan", 70000),
                new Emp(103,"Duaa",100000));
        List<Integer> Salary=
        list.stream().filter(e->e.salary>50000).map(e->e.id).toList();
        System.out.println(Salary);
    }
}
