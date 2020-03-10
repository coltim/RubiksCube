package hu.unideb.inf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cube cube = new Cube();
        Rotations rotations = new Rotations();
        char inputElement[] = new char[54];


        for (int i = 0; i <= 8; i++){
            inputElement[i] = 'b';
        }
        for (int i = 9; i <= 17; i++){
            inputElement[i] = 'o';
        }
        for (int i = 18; i <= 26; i++){
            inputElement[i] = 'g';
        }
        for (int i = 27; i <=35; i++){
            inputElement[i] = 'r';
        }
        for (int i = 36; i <= 44; i++){
            inputElement[i] = 'w';
        }
        for (int i = 45; i <= 53; i++){
            inputElement[i] = 'y';
        }



      /*  Scanner in = new Scanner(System.in);
        String input = "";
        System.out.println("add meg a kek oldalt");
        for (int i = 0; i <= 8; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a narancs oldalt");
        for (int i = 9; i <= 17; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a zold oldalt");
        for (int i = 18; i <= 26; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a piros oldalt");
        for (int i = 27; i <=35; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }
        System.out.println("add meg a feher oldalt");
        for (int i = 36; i <= 44; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);

        }System.out.println("add meg a citrom oldalt");
        for (int i = 45; i <= 53; i++){
            input = in.next();
            inputElement[i] = input.charAt(0);
        }*/


        cube.set(inputElement);
        System.out.println(cube.isSolved(cube) + " ");
        cube.print();
        rotations.Dreverse(cube);
        rotations.B(cube);
        rotations.U(cube);
        rotations.R(cube);
        /*rotations.Dreverse(cube);
        rotations.B(cube);
        rotations.U(cube);
        rotations.R(cube);
        rotations.Freverse(cube);
        rotations.Lreverse(cube);*/

        System.out.println(cube.isSolved(cube) + " ");
        cube.print();

        rotations.Rreverse(cube);
        rotations.Ureverse(cube);
        rotations.Breverse(cube);
        rotations.D(cube);




        System.out.println(cube.isSolved(cube) + " ");
        cube.print();


    }
}
