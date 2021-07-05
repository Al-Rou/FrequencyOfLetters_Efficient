import java.util.Scanner;

public class FrequencyOfLetters_Efficient {

        public static void main(String[] args)
        {
            //Prompt the user to enter their sentence
            System.out.println("Enter your sentence: ");
            Scanner in = new Scanner(System.in);
            //Take the entered sentence
            String input = in.nextLine();
            //This is for searching
            char auxiliary = 'a';
            //This is the final result array which stores each letter with its occurrence
            //The array is defined int, since each char is in fact an integer!
            int[][] letter = new int[26][2];
            int arrayCounter = 0;
            //This is simply a counter
            int frequency = 0;
            //This shows the highest frequency of a letter inside the entered sentence
            //int maxFrequency = 0;
            //The outer loop goes for all letters in English
            for(int i = 0; i < 26; i++)
            {
                //The inner loop searches along the whole entered sentence
                for(int j = 0; j < input.length(); j++)
                {
                    //No matter if the letter inside the sentence is capital or small
                    if((auxiliary+i == input.charAt(j)) || (auxiliary+i-32 == input.charAt(j)))
                    {
                        frequency++;
                    }
                }
                //The counted number and its associated letter are saved in the two-dimension array
                letter[arrayCounter][0] = (auxiliary+i);
                letter[arrayCounter][1] = frequency;
                arrayCounter++;
                frequency = 0;
            }
            //The result is printed out in 26 rows
            for(int i = 0; i < arrayCounter; i++)
            {
                System.out.println(letter[i][0] + " -> " + letter[i][1] + " times");
            }
        }
}
