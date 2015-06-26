/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fizz_Buzz;

import java.util.ArrayList;

/**
 *
 * @author Giny
 */
public class FizzBuzzGenerator {
    private static final ArrayList<Integer> integerList = generateList();
    
    public static void main(String[] args){
                
        integerList.stream().forEach((integer) -> {
            if(integer % 3 == 0){
                System.out.println("Fizz ");
            }else if(integer % 5 == 0){
                System.out.println("Buzz ");
            }else{
                System.out.println(integer);
            }
        });
    }
    
    private static ArrayList generateList(){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= 100; i++){
            list.add(i);
        }
        return list;
    }
}
