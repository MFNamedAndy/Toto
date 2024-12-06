/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andreyyak
 */
public class Toto {

    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    private int myNumbers;
    private int RandomChisla;

    public int getMyNumbers() {
        return myNumbers;
    }

    public void setMyNumbers(int myNumbers) {
        if (myNumbers > 0) {
            this.myNumbers = myNumbers;
        }

    }

    public int getRandomChisla() {
        return RandomChisla;
    }

    public void setRandomChisla(int RandomChisla) {

        if (RandomChisla > 0) {
            this.RandomChisla = RandomChisla;
        }
    }

    public Toto(int myNumbers, int RandomChisla) {

        setMyNumbers(myNumbers);
        setRandomChisla(RandomChisla);

    }

    public Toto() {

        this(0, 0);

    }

    public Toto(Toto others) {

        this.myNumbers = others.myNumbers;
        this.RandomChisla = others.RandomChisla;

    }

    public String toString() {

        return String.format("myNumbers: %d, RandomChisla: %d", myNumbers, RandomChisla);
    }
}
