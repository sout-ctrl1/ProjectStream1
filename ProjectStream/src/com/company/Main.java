package com.company;

public class Main {
    public static void main(String[] args) {
        MyFunc<?> myFunc = new MyFunc() {
            @Override
            public int testFunc(int number1, int number2) {
                return number1 + number2;
            }
        };

        System.out.print("9 + 3 = ");
        testFunc(myFunc, 9, 3);

        MyFunc<?> myFuncMultiplication = ((number1, number2) -> number1 * number2);
        System.out.print("9 * 3 = ");
        testFunc(myFuncMultiplication, 9, 3);

        MyFunc<Boolean> myFuncDevidedBy = MyFunc::DevidedBy;
        System.out.print("9 / 3 = ");
        testFunc(myFuncDevidedBy, 9, 3);
    }

    public static <T> void testFunc(MyFunc<T> myFunc, int number1, int number2) {
        System.out.println(myFunc.testFunc(number1, number2));
    }
}

