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
public class UpperCaseMandatoryException extends IllegalArgumentException {
    
    private static final String MSG = "Input must be uppercase";
    
    //this constructor takes no message--we'd never want to create an exception without taking a message 
    public UpperCaseMandatoryException() {
        super(MSG);//now we will get a message
    }

    //this constructor takes a single message
    public UpperCaseMandatoryException(String s) {
        super(MSG);//ignore the s, so people can't create their own message
    }
    
    //takes a message and a cause--would use when you want to know specific cause and display message
    public UpperCaseMandatoryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    //just takes a cause
    public UpperCaseMandatoryException(Throwable cause) {
        super(cause);
    }
    
    
    
}
