/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessinggame;

import java.util.Scanner;
/**
 *
 * @author huzaifa
 */
public class GuessingGame {

    public static void main(String[] args) {
        int a = (int)(Math.random()*100+1);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100 : ");
        int n = sc.nextInt();
        int b=1;
        
        while(n!=a){
            b++;
            if(n<a)
                System.out.println(n + " is Smaller.");
            else
                System.out.println(n+ " is Greater");
                System.out.println("Enter another Number : ");
                n = sc.nextInt();
        }
        if(b==1){
            System.out.println("Congratulations!!\nYou have gain: * * * * *");
        }
        else if(b==2){
            System.out.println("Congratulations!!\nYou have gain: * * *");
        }
        else if(b==3){
            System.out.println("Congratulations!!\nYou have gain: *");
        }
        else {
            System.out.println("You win the Game.");
        }
     
    }
}
