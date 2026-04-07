import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        // №1
//        String a = "Hello";
//        String b = "Hello";
//        System.out.println(a == b);

//        String a = new String("Hello");
//        String b = new String("Hello");
//        System.out.println(a == b);

//        String a = new String("Hello");
//        String b = new String("Hello");
//        System.out.println(a.equals(b));

        // №2
//        Integer a = 100;
//        Integer b = 100;
//        System.out.println(a == b);

//        Integer a = 128;
//        Integer b = 100;
//        System.out.println(a == b);

        // №3
//        String text = "Sayfer";
//        System.out.println(text.charAt(2));

//        String text = "Sayfer";
//        System.out.println(text.charAt(text.length() - 1));

        // №4
//        int[] numbers = {142, 25, 37, 43, 512, 654, 70, 84, 91, 133};
//        int min = numbers[0];
//        int max = numbers[0];
//
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] < min){
//                min = numbers[i];
//            } else if(numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);

//        int[] numbers = {142, 25, 37, 43, 512, 654, 70, 84, 91, 133};
//        for (int n : numbers){
//            if (n %2 == 0){
//                System.out.println(n);
//            }
//        }

//        String text = "Hello_World";
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(char c : text.toCharArray()){
//            if(map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            } else{
//                map.put(c, 1);
//            }
//        }
//        System.out.println(map);

        // №5
        String text = "Madam";
        text = text.toLowerCase();
        String revers =  "";
        for (int i = text.length() - 1; i >= 0; i--) {
            revers += text.charAt(i);
        }
        System.out.println(revers);
        System.out.println(text.equals(revers));
    }
}
