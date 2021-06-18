package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        for(char[] row: gameBoard){
            for (char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
