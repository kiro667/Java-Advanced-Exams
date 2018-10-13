package Shockwave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Shockwave {//1zada4a

    public static void main(String[] args) throws IOException {

    BufferedReader reader =
     new BufferedReader(new InputStreamReader(System.in));

      String[] cordinates = reader.readLine().split(" ");

     int n = Integer.parseInt(cordinates[0]);
     int m = Integer.parseInt(cordinates[1]);


     int[][] matrix = new int[n][m];

        while(true){
            String line = reader.readLine();
            if("Here We Go".equalsIgnoreCase(line)){
                break;
            }

            int[] commandArgs = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt).toArray();


              int x1 = commandArgs[0];
              int y1 = commandArgs[1];
              int x2 = commandArgs[2];
              int y2 = commandArgs[3];


            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {

               //     try {//tova e akon se podadat nevalidni parametri no
                    //v slu4aq se garantira 4e nqma da ima nevalidni
                        matrix[i][j]++;
                  //  }catch(Exception e){
                      //  System.out.println("Exception");
                   // }
                }
            }



        }

        for (int[] r : matrix) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();//sled kato minem prez
            // reda da minem na nov red
        }

    }
}
