class Main {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int result = add(10, 20); 
        System.out.println(result);
    }
}


class Main {

    public static int largest(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int result = largest(10, 25);
        System.out.println("Largest = " + result);
    }
}


class Main {

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean result = isEven(10);
        System.out.println(result);
    }
}


class Main {

    public static int power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {

        int answer = power(2, 5);

        System.out.println("Answer = " + answer);
    }
}


import java.util.Scanner;

class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.println("Sum = " + result);
    }
}



import java.util.Scanner;

class Main {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}