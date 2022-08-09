package hometasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((Math.random() + 10) * 5);
        }
        //вывод чисел в квадарате
        list.stream().map((x) -> x * x).forEach(System.out::println);

        System.out.println("\nСумма всех чисел в квадрате - ");

        double sum = list.stream().map(x -> x * x).reduce(Double::sum).get();
        System.out.println(sum);
    }

}
