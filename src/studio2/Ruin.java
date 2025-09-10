import java.util.Scanner;

import java.lang.Math;

public class Ruin {
public static void main (String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("What do you want the start amount to be?");
    int startAmount = in.nextInt();
    System.out.println("Win chance?:");
    double winChance = in.nextDouble();
    System.out.println("winLimit?:");
    int winLimit = in.nextInt();
    System.out.println("What is the number of simulations?");
    int totalSimulations = in.nextInt();
    in.close();


    for(int sim = 1; sim<totalSimulations; sim++){
        double wins = 0;
        for(int money = startAmount; money > 0;) {
            if (Math.random() >= winChance) {
                wins++;
                money++;
                if (money >= winLimit) {
                    System.out.println("You win!"+  " Ruin Rate: " + (sim - wins) / sim);
                    break;
                }
            } else {
                money--;
                if (money <= 0) {
                    System.out.println("You lose!" +  " Ruin Rate: " + (sim - wins) / sim);
                    break;
                }
            }

        }

    }



    
}

}
