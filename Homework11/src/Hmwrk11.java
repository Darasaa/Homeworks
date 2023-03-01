/*
    1. შემოგვდის ქვეყანა და დავაბრუნოთ შესაბამისი ქვეყნის
    დედაქალაქი.
    თუ შემოგვივა ისეთი ქვეყანა, რომელიც ჩემს “ბაზაში” არ მაქვს,
    გამოვუტანოთ შესაბამისი შეტყობინება.
    კოდი დაწერეთ ისე, რომ პროგრამის ხელახლა გაშვება არ მოხდეს,
    როცა ქვეყნებს შევამოწმებ. მაგალითად ასე:
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    Enter Country: Georgia
    Capital Of Georgia is: Tbilisi
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    Enter Country: France
    Capital Of France is: Paris
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    2. შემოგვდის ლათინური პატარა ასო და დავაბრუნოთ შემოყვანილი
    ასოს შესაბამისი დიდი ასო. კოდი დაწერეთ ისე, რომ პროგრამის
    ხელახლა გაშვება არ მოხდეს, როცა ასოებს შეამოწმებ.
    მაგალითად:
    Enter # to stop;
    Enter letter: a
    a -> A
    Enter letter: l
    L -> L
    Enter letter: #
    3. შემოგვდის ინგლისური ანბანის ლათინური ასო და დავაბრუნოთ
    მერამდენეა მოცემული ასო ნუმერაციით
 */

import java.util.HashMap;
import java.util.Scanner;

public class Hmwrk11 {
    public static void main(String[] args) {
//        capitalsOfCountries();
//        bigAndSmall();
        getAlphabetIndex((indexOfCh()));
    }

    private static void capitalsOfCountries() {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Georgia", "Tbilisi");
        capitals.put("USA", "Washington DC");
        capitals.put("Sweden", "Stockholm");
        capitals.put("Norway", "Oslo");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("India", "New Delhi");
        capitals.put("Germany", "Berlin");
        System.out.println("შეიყვანეთ ქვეყანა: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String country = scanner.nextLine();

            if (country.equals("")) {
                break;
            }

            String capital = capitals.get(country);

            if (capitals != null) {
                System.out.println(country + " დედაქალაქი არის " + capital);
            } else {
                System.out.println(" დედაქალაქზე ინფორმაცია არ არის ");
            }

        }

    }

    private static void bigAndSmall(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("შემოიყვანეთ პატარა ასო ");
            String aso = scanner.nextLine();
            if (aso != aso.toLowerCase())
                System.out.println(" შემოყვანილი ასო არ არის პატარა ");
            else
                System.out.println("შემოყვანილი პატარა ასო დიდად იქნება -> "  + aso.toUpperCase());
            if (aso.equals("#"))
                break;
        }
    }

    private static char indexOfCh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ჩაწერე ინგლისური ანბანის 1 ასო");
        String input = scanner.nextLine();

        if(input.length() != -1){
            System.out.println(" შემოიყვანე არაუმეტეს 1 ასო ");
        }
        char c = input.charAt(1);
        int index = getAlphabetIndex(c);
        if (index == -1){
            System.out.println(c + " არ არის ინგლისურ ანბანში");
        } else {
            System.out.println(c + " ინგლისურ ანბანში არის " + index + " ადგილზე ");
        }
        return (char) index;

    }

    private static int getAlphabetIndex(Character c){
        c = Character.toLowerCase(c);
        if (c < 'a' || c > 'z'){
            return -1;
        }
        int index = c - 'a';
        return index;
    }
}
