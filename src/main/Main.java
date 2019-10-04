package main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException { // 1 - 10 arası dahil sayı tahmini
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> guessList = new ArrayList<>();

        int guess, point = 0;

        for(int i=0; i<=9; i++)
            list.add(rnd.nextInt(10));

        for(int i=0; i<=9; i++){
            System.out.printf("Guess %d.: ", i+1);
            guess = rnd.nextInt(10);
            guessList.add(guess);

            TimeUnit.SECONDS.sleep(1);

            System.out.println(guessList.get(i));

            if(guess == list.get(i))
                point++;
        }

        TimeUnit.SECONDS.sleep(1);

        System.out.println("AI guesses and real numbers");

        for(int i=0; i<=9; i++)
            System.out.print(guessList.get(i) + " ");

        System.out.println();

        for(int i=0; i<=9; i++)
            System.out.print(list.get(i) + " ");

        System.out.println();
        System.out.printf("AI point is %d. Congrats.", point);
    }
}