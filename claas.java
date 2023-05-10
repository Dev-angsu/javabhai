class calculator {
    public int add(int a1, int b1) {
        float sum = a1 + b1;
        return (int) sum;
    }
}

public class claas {
    public static void main(String[] args) {

        int a1 = 9;
        int b1 = 15;
        calculator calc = new calculator();
        float result = calc.add(a1, b1);
        System.out.println(result);
    }
}