package lesson02;

import ru.javawebinar.webapp.model.Link;

/**
 * Package: lesson02
 * Creator: lordrumin
 * Has Created: 19.02.2018
 **/
public class Main {
    public static void main(String[] args){
       int i = 5;

        Link l1 = new Link("javawebinar","javawebinar.ru");
        Link l2 = l1;
        Link l3 = new Link(l1);

        System.out.println(l1.getClass());
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }

}
