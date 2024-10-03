interface op {
    int perform(int x, int y);
}

public class LambdaDemo {
    public static void main(String[] args) {
        op add = (a,b)-> a+b;
        op sub = (a,b)-> a-b;
        op mul = (a,b)-> a*b;
        op mod = (a,b)-> a%b;

        System.out.println("Sum = " + add.perform(10,20));
        System.out.println("Difference = " + sub.perform(45,25));
        System.out.println("Product = " + mul.perform(9,5));
        System.out.println("Modulus = " + mod.perform(72,10));

    }

}
