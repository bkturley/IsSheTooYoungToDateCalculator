
package issheoldenoughtodatecalculator;

public class IsSheTooYoungToDateCalculator {

    boolean isSheTooYoung(int herAge, int myAge, boolean haveDaughter, int daughterAge) {
        
        if(herAge >= myAge){
            return false;
        }
        
        if(haveDaughter && daughterAge <= 25){
            boolean sheIsMyDaughtersAgeOrYounger = (myAge - herAge) >= (myAge - daughterAge);
            if (sheIsMyDaughtersAgeOrYounger)
                return true;
        }
         
        return herAge <= (myAge / 2 + 7);

    }
    
}
