package com.company.solid;

import java.security.InvalidParameterException;



    class Calculator {

        private double num1;
        private double num2;

        public Calculator(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
        }

        public double getNum1() {
            return num1;
        }

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public double getNum2() {
            return num2;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }

        public void calculate(CalculatorOperator operator){
            if (operator == null){
                throw new InvalidParameterException("");
            }
            operator.perform(num1, num2);
        }
    }


    interface CalculatorOperator {
        void perform(double num1, double num2);
    }

    class Addition implements  CalculatorOperator {

        private double result;

        @Override
        public void perform(double num1, double num2) {
            result = num1 + num2;
            System.out.println("Addition : " + result);
        }
    }

    class Division implements CalculatorOperator{

        private double result;


        @Override
        public void perform(double num1, double num2) {
            result = (float) num1 / num2;
            System.out.println("Division : " + result);
        }
    }

    class Subtraction implements CalculatorOperator{

        private double result;

        @Override
        public void perform(double num1, double num2) {
            result = num1 - num2;
            System.out.println("Subtraction : " + result);
        }
    }

    class Multiplication implements CalculatorOperator{

        private double result;

        @Override
        public void perform(double num1, double num2) {
            result = num1 * num2;
            System.out.println("Multiplication : " + result);
        }

    }





public class OpenClosePrinciple {
    public static void main(String[] args) {
        // write your code here :

        Calculator calculator = new Calculator(2, 3);
        calculator.calculate(new Division());

    }

}
