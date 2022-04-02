public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //Единственная ошибка это то что программа не может разделить на 0;
        //int c = calc.divide.apply(a, b);
        //Решить проблему можно через оператор if и запретить операцию при значении 0

        if (b > 0) {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("Делить на 0 нельзя");
        }


        int d = calc.abs.apply(-5);
        int e = calc.pow.apply(8);


        calc.println.accept(d);
        calc.println.accept(e);


    }
}
