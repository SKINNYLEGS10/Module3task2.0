package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    ArrayList<Integer> LAX = new ArrayList<Integer>();
    LAX.add(300);
    LAX.add(215);
    LAX.add(539);
    LAX.add(132);
    LAX.add(1,698);
    LAX.add(3, 75);
    LAX.add(4, 15);
        for(int iLoop = 0; iLoop < LAX.size(); iLoop++)
            System.out.println(LAX.get(iLoop));

    }
}
