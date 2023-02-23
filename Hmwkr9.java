import java.util.Arrays;
import java.util.Stack;

public class Hmwkr9 {
    /*1. ვთქვათ, რომ ელემენტი “მარტოა” მაშინ, თუ ამ ელემენტის წინა
და მომდევნო ელემენტები განსხვავებულია მისგან. დააბრუნეთ
ისეთი მასივი, სადაც ყოველი გადმოცემული რიცხვი (რომელიც
მარტოა) ჩანაცვლდება მისი მეზობელი რიცხვებიდან
მაქსიმალურით. მაგალითად: notAlone([1, 2, 3]) -> [1, 3, 3];
notAlone([1, 2, 3, 2, 5, 2]) -> [1, 3, 3, 5, 5, 2];
notAlone([3, 4]) -> [3, 4];
2. დაწერეთ zeroMax(int[] nums) ფუნქცია, რომელშიც ყველა 0-იანი
შეიცვლება მასივში ყველაზე დიდი კენტი მნიშვნელობით, რაც ამ
0-იანის მარჯვნივ დგას. მაგალითად:
zeroMax([0, 5, 0, 5]) -> [5, 5, 3, 3];
zeroMax([0, 4, 0, 3]) -> [3, 4, 3, 3]; zeroMax([0, 1, 0]) -> [1, 1, 0];
3. შემოგვდის სტრინგი. დაწერეთ პროგრამა, რომელიც
გამოიკვლევს ფრჩხილები “{“, “}”, “(“, “)”, “[“, “]” სწორადაა თუ არა
გახსნილ-დახურული. მაგალითად:
String str = “[()]{}{[()]} -> Balanced
String str = “[(])” -> Not Balanced
4. დაწერეთ Rectangle-ს კლასი, რომელსაც ექნება height და width
პარამეტრები. დაწერეთ ამ კლასის შემდეგი
ფუნქციები:
- setDim, რომელიც იღებს ამ 2 პარამეტრს და ჩვენი კლასის
პარამეტრებს უსეტავს გადაცემულ მნიშვნელობებს.
- getArea, რომელიც გვიბრუნებს ოთხკუთხედის ფართობს
- getPerimeter, რომელიც გვიბრუნებს ოთხკუთხედის პერიმეტრს
გარდა ამ ფუნქციებისა, ჩვენი ორი პარამეტრის გეთერ/ სეტერებიც
აუცილებელია, და ასევე, RectanlgeTest კლასი, რომლის main
ფუნქციიდანაც შექმნით ამ კლასის ობიექტს
და გატესტავთ დაწერილი ფუნქციების სისწორეს.*/
    public static void main(String[] args) {
        int[] myNums = {0, 3, 1, 0, 2, 0, 5, 0, 9, 0, 7, 10};
        System.out.print("\nBefore " + Arrays.toString(myNums) + "\nAfter " + Arrays.toString(zeroMax(myNums)));
        String strS = "([{)}]";
        String str2 = "{[()]}[()]{()}";
        String strP = "[({})][}](";
        System.out.println("\npirveli stringi: " + isBalanced(strS));
        System.out.println("\nmeore stringi: " + isBalanced(str2));
        System.out.println("\nmesame stringi: " + isBalanced(strP));
        Rectangle rec = new Rectangle();
        rec.setDim(25.5, 10.5);
        System.out.println("პირველი მართკუთხედის დეტალები");
        rec.recData();
        System.out.println("ფართობი: " + rec.getArea());
        System.out.println("პერიმეტრი: " + rec.getPerimeter());
        Rectangle recZ = new Rectangle();
        recZ.setHeight(17.2);
        recZ.setWidth(7.5);
        System.out.println("\nმეორე მართკუთხედის დეტალები ");
        recZ.recData();
        System.out.println("ფართობი: " + recZ.getArea());
        System.out.println("პერიმეტრი: " + recZ.getPerimeter());



    }

    /*2. დაწერეთ zeroMax(int[] nums) ფუნქცია, რომელშიც ყველა 0-იანი
    შეიცვლება მასივში ყველაზე დიდი კენტი მნიშვნელობით, რაც ამ
    0-იანის მარჯვნივ დგას. მაგალითად:
    zeroMax([0, 5, 0, 5]) -> [5, 5, 3, 3];
    zeroMax([0, 4, 0, 3]) -> [3, 4, 3, 3]; zeroMax([0, 1, 0]) -> [1, 1, 0];*/
    private static int[] zeroMax(int[] nums) {
        int max = 0; //iqmneba inti sadac inaxeba mocemuli kenti ricxvebi
        for (int j = 0; j < nums.length - 1; j++) { //daiwyebs 0 indexidan da gadauyveba sigrdzes -1 radgan bolo ricxvis shemdeg verafers sheadarebs
            if (nums[j] == 0) { //mowmdeba masivshi J elementi tu aris toli 0-is tu aris unda davumatot yvelaze didi marjvnidan
                for (int i = j + 1; i < nums.length - 1; i++) { //lups viwyebt 0+1 tu J = 0s , shemdegi elementidan, da mivyvebit sigrdzes -1 mde rom davumatot yvelaze didi
                    if (nums[i] > max && nums[i] % 2 == 1) //mowmdeba ^ i elementi tu aris kenti da meti int max = shi shenaxul elementze
                        max = nums[i]; //zeda max igebs nums [] i masivis value s romelsac miigeb IF shi
                    nums[j] = max; //nums J = 0i igebs Max shi shenaxul migebul values, tu max ar ganaxlda zeda loopshi radgan marjvniv kenti ar qonda isev 0 iqneba mnishvneloba
                                  // da nums J isev iqneba 0
                    max = 0; //max resetdeba 0ze radgan loopshi axlidan sheinaxos axali kenti romelsac sheadarebs
                }
            }
        }
        return nums; //abrunebs shecvlil masivs
    }

    /*შემოგვდის სტრინგი. დაწერეთ პროგრამა, რომელიც
    გამოიკვლევს ფრჩხილები “{“, “}”, “(“, “)”, “[“, “]” სწორადაა თუ არა
    გახსნილ-დახურული. მაგალითად:
    String str = “[()]{}{[()]} -> Balanced
    String str = “[(])” -> Not Balanced*/
    private static boolean isBalanced(String str) { //Boolean amowmebs true aris tu ara
        Stack<Character> stack = new Stack<>();
        for (char a : str.toCharArray()) { //For each it gadavuyvebi steks
            if (a == '(' || a == '[' || a == '{') { // tu aris eseni stekshi
                stack.push(a); // davpushav da sheviyvan stekshi
            } else if (a == ')' || a == ']' || a == '}') { //tu loops shexvdeba eseni
                if (stack.isEmpty()) { // sheamowmebs carieli aris tu ara steki
                    return false; // tu ki daabrunebs false radgan shesabamisi wyvili ar yavs rom dabalansebuli iyos
                }
                char top = stack.pop(); //steki iwyevs dapopvas bolodan da tan amomwmebs sheesabameba tu ara gamxsenli da damxuravi ertmanets
                if ((a == ')' && top != '(' || a == ']' && top != '[' || a == '}' && top != '{')) { // aq amowmebs, tu ar sheesabameba false abrunebs
                    return false;
                }
            }
        }
        return stack.isEmpty(); //mowmdeba carieli aris tu ara, tu carielia eseigi yvela ertmanets metchavs, tu ar aris carieli eseigi romeligac ar sheesabama
    }                          // gamxsnels, ar aris dabalansebuli da daabrunebs false's.

    //-----Davaleba 4----//
    Rectangle rec = new Rectangle(10.5, 5.5);

}


