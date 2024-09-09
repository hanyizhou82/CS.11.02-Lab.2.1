/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Hanyi Zhou
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int varAddTwo = add(4, 5);
        System.out.println(varAddTwo);

        int varAddFour = add(4, 5, 6, 7);
        System.out.println(varAddFour);

        String varMorningGreeting = morningGreeting("Anne Hathaway");
        System.out.println(varMorningGreeting);

        String varAfternoonGreeting = afternoonGreeting("Anne Hathaway");
        System.out.println(varAfternoonGreeting);

        String varTriple = triple("hello");
        System.out.println(varTriple);

        double varHalf = half(108);
        System.out.println(varHalf);

        double varRoundPositive = roundPositiveValueToNearestInteger(10.8);
        System.out.println(varRoundPositive);

        double varRoundNegative = roundNegativeValueToNearestInteger(-10.8);
        System.out.println(varRoundNegative);
    }


    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String phrase) {
        return phrase + phrase + phrase;
    }

    // 6. half
    public static double half(double number) {
        return number / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double posVal) {
        return (double) Math.round(posVal);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double negVal) {
        return (int) (negVal - 0.5);
    }
}
