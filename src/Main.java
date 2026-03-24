import java.util.Scanner;
//1
/*public class Main {
    public static void digital(int n){
        if (n < 10 ){
            System.out.println(n);
        }
        else{
            digital(n / 10);
            System.out.println(n % 10);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int san = sc.nextInt();
        digital(san);

    }

}*/

//2

/*public class Main {

    public static void elements(int[] arr, int i, Scanner sc) {
        if (i == arr.length) {
            return;
        }
        arr[i] = sc.nextInt();
        elements(arr, i + 1, sc);
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        elements(arr, 0, sc);

        int total = sum(arr, n);
        double avg = (double) total / n;

        System.out.println(avg);
    }
}*/



//3

/*public class Main {
    public static boolean prime(int n,int i){
        if (n <= 2) return (n == 2);

        if (n % i == 0) return false;

        if (i * i > n) return true;

        return prime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime(n,2)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}*/

//4
/*public class Main {
    public static int factor(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factor(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factor(n));
    }
}*/

//5

/*public class Main {

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}*/

//6

/*public class Main {

    public static int pow(int a, int n) {

        if (n == 0) {
            return 1;
        }
        else {
            return a * pow(a, n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(pow(a, n));
    }
}*/

//7


/*public class Main {

    public static void reverse(int n, Scanner sc) {

        if (n > 0) {

            int x = sc.nextInt();

            reverse(n - 1, sc);

            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        reverse(n, sc);
    }
}*/

//8

/*public class Main {

    public static boolean check(String s, int i) {

        if (i == s.length()) {
            return true;
        }

        if (!Character.isDigit(s.charAt(i))) {
            return false;
        }

        return check(s, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (check(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}*/

//9

/*public class Main {

    public static int count(String s, int i) {

        if (i == s.length()) {
            return 0;
        }

        return 1 + count(s, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(count(s, 0));
    }
}*/

//10
/*public class Main {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}*/
