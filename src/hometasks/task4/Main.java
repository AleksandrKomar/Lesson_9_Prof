package hometasks.task4;

public class Main {

    public static void main(String[] args) {

        //sum
        Double result1 = Calculator.calculate(303d, 707d, (a, b) -> a + b);
        System.out.println(result1);

        //sub
        Double result2 = Calculator.calculate(250d, 55d, (a, b) -> a - b);
        System.out.println(result2);

        //mul
        Double result3 = Calculator.calculate(54d, 57d, (a, b) -> a * b);
        System.out.println(result3);

        //div
        Double result4 = Calculator.calculate(666d, 777d, (a, b) -> b <= 0 ? 0 : a / b);
        System.out.println(result4);

    }

}



