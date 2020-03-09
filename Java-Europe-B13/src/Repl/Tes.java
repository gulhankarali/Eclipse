package Repl;

import java.util.List;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Tes {
	

    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));

        process(list,(Employee e)->{return e.getSalary()>=10000;});

        System.out.println(list);
        Period p = Period.of(0,0,0);
        System.out.println(p);
    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
            iterator.remove();
        }
     }
}