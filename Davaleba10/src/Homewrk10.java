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
}
