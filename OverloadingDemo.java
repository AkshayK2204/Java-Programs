
    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }
//        public double add(int a, int b) {
//            return a + b;                                 //This will not work because parameters must be different, return type alone is not enough
//        }
    }

    public class OverloadingDemo {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            System.out.println("Addition of two integers: " + calculator.add(25, 210));
            System.out.println("Addition of three integers: " + calculator.add(12, 45, 23));
            System.out.println("Addition of two doubles: " + calculator.add(5.5d, 10.5d));
        }
    }

