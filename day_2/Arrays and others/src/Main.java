import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // №1
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        // №2
//        int[] numb = {1,2,3,4,5,6,7,8,9,10};
//        int save = 0;
//
//        for (int i = 0; i < numb.length; i++) {
//            save += numb[i];
//        }
//            System.out.print(save + " ");

        // №3
//        int[] numb = {1,2,3,4,5,6,7,89,9,10};
//        int max = numb[0];
//        int min = numb[0];
//
//        for(int i = 0; i < numb.length; i++){
//            if(numb[i] > max){
//                max = numb[i];
//            }else if(numb[i] < min){
//                min = numb[i];
//            }
//        }
//            System.out.println(max + " " + min);
            // System.out.println(Arrays.stream(numb).max());

        // №4
//        String arr = "Test";
//        System.out.println(arr.length());

        // №5
//        String array = "Sayfer";
//        for(int i = 0; i < array.length(); i++){
//            for(int j = 0; j < array.length(); j++){
//                if(array.charAt(i) == array.charAt(j)){
//                    System.out.println(array.charAt(i) + " " + array.charAt(j));
//                }
//            }
//        }

        // №6
//        String text_1 = "Test";
//        String text_2 = "Test";
//        if(text_1.equals(text_2)){
//            System.out.println("Both are the same");
//        } else {
//            System.out.println("Both are not the same");
//        }

        // №7
//        String text = "Java is amazing";
//        int count = 0;
//
//        for(int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // №8
//        String text = "Hello";
//        for(int i = text.length() - 1; i >= 0; i--){
//            System.out.print(text.charAt(i));
//        }

        // №9
        String text = "Hi";
        text = text.toLowerCase();
        boolean isPalindrome = true;
        int length = text.length();

        for (int i = 0; i < length / 2 ; i++) {
            if(text.charAt(i) != text.charAt(length - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
