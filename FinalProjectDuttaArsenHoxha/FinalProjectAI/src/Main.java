import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter a number 1-4 or 0 to exit: ");
            String line = input.nextLine();
            int num = Integer.parseInt(line);
           // System.out.println("the input num,: " + num);
                if( num == 0) {
                    return;
                }

                 else if (num == 1) {
                    Grid.setGrid(num);
                }
                else if (num == 2) {
                    Grid.setGrid(num);
                }

                else if (num == 3) {
                    Grid.setGrid(num);
                }

                else if (num == 4) {
                    Grid.setGrid(num);
                }


                else  {
                    System.out.println("Not a valid number try again");
                }

            }






        }





    }



