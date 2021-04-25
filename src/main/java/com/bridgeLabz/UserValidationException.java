package com.bridgeLabz;

public class UserValidationException extends Exception{
    public UserValidationException(){
        boolean results=true;
        try {
            if(results == true)
                System.out.println("Valid enter");
        } catch (Exception e) {
            System.out.println("Invalid enter");
            e.printStackTrace();
        }
    }
}
