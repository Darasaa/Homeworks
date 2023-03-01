import java.util.Arrays;

public class Homewrk10 {
    /*1. დაწერეთ ფუნქცია, რომელიც დააბრუნებს
    გადაცემული სიტყვა პალინდრომია თუ არა.
    პალინდრომი არის სიტყვა რომელიც მარჯვნიდან
    და მარცხნიდან ერთნაირად იკითხება,
    მაგალითად “aba”, “abba”

    2. დაწერეთ ფუნქცია, რომელიც დააბრუნებს
    გადაცემული ორი სიტყვა ანაგრამები არიან თუ
    არა. ორი სიტყვა ერთმანეთის ანაგრამაა, თუ ისინი
    შეიცავენ ერთი და იმავე რაოდენობის ასოებს. მაგა

    3. შემოგვდის რიცხვი n. დაბეჭდეთ მე-n ფიბონაჩის
    რიცხვი.
    ფიბონაჩის რიცხვებია: 0 1 2 3 5 8 13. . . ყოველი
    შემდეგი რიცხვი მიიღება წინა ორის ჯამით.
    მაგალითად: fib(3) -> 2
    fib(5) -> 5
    fib(6) -> 8
*/
    public static void main(String[] args) {
        String str1 = "abab";
        String str2 = "racecar";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (isPalindrome(str2)){
            System.out.println(str2 + " aris palindromi");
        } else {
            System.out.println("araris palindromi");
        }
        if (isPalindrome(str1)){
            System.out.println(str1 + " aris palindromi");
        } else {
            System.out.println(str1 + " ar aris palindromi");
        }
        char char1[] = {'a','b','c','d'};
        char char2[] = {'z','h','t'};
        if (isAnagrame(char1,char2)){
            System.out.println("Arian anagramebi");
        } else {
            System.out.println(Arrays.toString(char1) + "  da " + Arrays.toString(char2) + " Ar arian ertmanetis anagramebi");
        }


    }

    //---პალინდრომი---//
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //---ანაგრამი---//
    private static boolean isAnagrame(char[] char1, char[] char2){
        int a = char1.length;
        int b = char2.length;
        if (char1 != char2){
            return false;
        }
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int n = 0; n < a; n++){
            if (char1[n] != char2[n])
                return false;
        }
        return true;
    }

}
