import java.util.Scanner;

public class Main {
    // №1
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        String name = scanner.next();
//        double height = scanner.nextDouble();
//        boolean isStudent = scanner.nextBoolean();
//        System.out.println("Name: " + name +
//                ", Age: " + age +
//                ", Height: " + height +
//                ", isStudent: " + isStudent);
//    }

    // №2
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//        int test = scanner.nextInt();
//        if (test < number){
//            System.out.println("Negative number");
//        }if (test > number){
//            System.out.println("Positive number");
//        }if (test == number) {
//            System.out.println("Equal number");
//        }
//    }

    // №3
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        switch (day){
//            case 1: {
//                System.out.println("Monday");
//                break;
//            }
//            case 2: {
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thursday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("Saturday");
//                break;
//            }
//            case 7: {
//                System.out.println("Sunday");
//                break;
//            }
//        }
//    }

    // №4
//    public static void main(String[] args){
    // 1
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("# ");
//            }
//            System.out.println();
//        }
    // 2
//        int size = 5;
//        for(int i = 0; i <= size; i++){
//            for(int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = size; i >= 0; i--){
//            for(int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    // 3
//        int size = 5;
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size - i; j++) System.out.print(" ");
//            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
//            System.out.println();
//        }
//
//        for (int i = size - 1; i >= 1; i--) {
//            for (int j = 1; j <= size - i; j++) System.out.print(" ");
//            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
//            System.out.println();
//        }
//}

    // №5
//    public static void main(String[] args){
        // #1
//        int size = 5;
//        int i = 0;
//        while (i < size) {
//            int j = 0;
//            while (j < size) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // #2
//        int rows = 5;
//        int i = 1;

//        while (i <= rows) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // #3
//        int height = 5;
//        int i = 1;
//
//        while (i <= height) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        int k = height;
//        while (k >= 1) {
//            int j = 1;
//            while (j <= k) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            k--;
//        }

        // #4
//        int size = 5;
//        int i = 1;
//
//        while (i <= size) {
//            int j = 1;
//            while (j <= size - i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 1;
//            while (k <= 2 * i - 1) {
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
//
//        i = size - 1;
//        while (i >= 1) {
//            int j = 1;
//            while (j <= size - i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 1;
//            while (k <= 2 * i - 1) {
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            i--;
//        }
//    }

    // №6
//    public static void main(String[] args) {
//        sayHello(21);
//    }
//    public static void sayHello(int age) {
//        System.out.println(age);
//    }

    // №7
//    public static void main(String[] args) {
//        int numb = 100;
//        for (int i = 1; i <= numb; i++) {
//            if(i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }

    // №8
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
