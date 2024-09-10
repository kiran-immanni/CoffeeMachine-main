package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class OutOfWaterException extends Exception {

    public OutOfWaterException() {
    }

    @Override
    public String getMessage() {
        return "Out of water, there isn't enough water, you have to fill it";
    }
    
    
}
