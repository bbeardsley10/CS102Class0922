

public class mainClass {

    public static void main(String[] args) {
        
        char[] myCharacterArray = {'a','%','$','C','g',' ','d','B'};
            
        for(int i = 0; i < myCharacterArray.length; i++)
        {
            int numericValueOfChar = (int) myCharacterArray[i];

            if(numericValueOfChar >= 97 && numericValueOfChar <= 122)
            {
                int upperCaseNumericValueOfChar = numericValueOfChar - 32;
                char upperCase = (char)upperCaseNumericValueOfChar;
                System.out.println(upperCase);

            } else {
                System.out.println(myCharacterArray[i]);
            }
        }

    }
}