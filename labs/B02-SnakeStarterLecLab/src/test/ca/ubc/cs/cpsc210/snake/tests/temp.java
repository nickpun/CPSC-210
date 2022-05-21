package ca.ubc.cs.cpsc210.snake.tests;

import java.util.ArrayList;

public class temp {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=10;i<=14;i++) {
            list.add(i);
        }

        for(Integer i: list){
            if(i % 2 == 0)
            System.out.println(i);
        }

        int i = 0;
        while(true){
            Integer num = list.get(i);
            if(num % 2 == 0)
                System.out.println(num);
            if(i == list.size()-1)
                break;
            i++;
        }
    }
}
