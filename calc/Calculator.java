package calc;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        int result = 0;
        try{
            result = x/y;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }
//        if (y == 0){
//            System.out.println("На ноль делить нельзя");
//        }else {
//            result = x/y;
//        }
//       return result;
return result;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;


}
