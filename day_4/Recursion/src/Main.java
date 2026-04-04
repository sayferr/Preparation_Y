public class Main {
    public static void main(String[] args) {

        // test №1
//        int numb = 10;
//        printNumbers(numb);

        // test №2
//        int result = factorial(5);
//        System.out.println(result);

        // test №3
//        int result = sum(132);
//        System.out.println(result);

        // test №4
//        int result = fibonacci(9);
//        System.out.println(result);

        // test №5
//        String original = "Hello";
//        String reversed = reverseString(original);
//        System.out.println(original);
//        System.out.println(reversed);

        // test №6
//        int[] numbers = {1, 20, 31, 4, 59, 6, 79, 28, 9, 10};
//        System.out.println(maxArray(numbers, 0));

        // test №7
        String text = "Word";
        System.out.println(isPalindrome(text));
    }
    // №1
//    public static void printNumbers(int n) {
//        if (n == 0) {
//            return;
//        }
//         printNumbers(n - 1);
//
//         System.out.println(n + " ");
//    }

    // №2
//    public static int factorial(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n * factorial(n-1);
//    }

    // №3
//    public static int sum(int n) {
//        if (n <= 1) {
//            return 1;
//        } else {
//            return n + sum(n - 1);
//        }
//    }

    // №4
//    public static int fibonacci(int n){
//        if (n <= 1){
//            return n;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

    // №5
//    public static String reverseString(String str) {
//        if (str.length() <= 1) {
//            return str;
//        }
//        return reverseString(str.substring(1)) + str.charAt(0);
//    }

    // №6
//    public static int maxArray(int[] arr, int n) {
//        if (n == arr.length - 1) {
//            return arr[n];
//        }
//        int max = maxArray(arr, n + 1);
//
//        return Math.max(arr[n], max);
//    }

    // №7
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}