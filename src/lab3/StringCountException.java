/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author ltrinastic
 */
public class StringCountException extends IllegalArgumentException {

    private static final String MSG = "Input can't be longer than 10";
    
    //this constructor takes no message--we'd never want to create an exception without taking a message 
    public StringCountException() {
        super(MSG);//now we will get a message
    }

    //this constructor takes a single message
    public StringCountException(String s) {
        super(MSG);//ignore the s, so people can't create their own message
    }
    
    //takes a message and a cause--would use when you want to know specific cause and display message
    public StringCountException(String message, Throwable cause) {
        super(MSG, cause);
    }

    //just takes a cause
    public StringCountException(Throwable cause) {
        super(cause);
    }
    
    
    

}
