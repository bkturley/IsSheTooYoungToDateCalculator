
package issheoldenoughtodatecalculator;


public class Main {


    public static void main(String[] args) {
        int herAge = 17;
        int yourAge = 30;
        boolean haveDaughter = true;
        IsSheTooYoungToDateCalculator isSheTooYoungToDateCalculator = new IsSheTooYoungToDateCalculator();
        boolean isSheTooYoungToDate = isSheTooYoungToDateCalculator.isSheTooYoung(herAge, yourAge, haveDaughter,123);
        System.out.println("Her Age: " + herAge);
        System.out.println("Your Age: " + yourAge);
        String answer = isSheTooYoungToDate ? " is " : "is not" ;
        System.out.println("She" + answer + "too young to date.");
    }
    
}
