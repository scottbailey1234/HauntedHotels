/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.exceptions;

/**
 *
 * @author Acer
 */
public class ChallengeControlException extends Exception {

    public ChallengeControlException() {
    }

    public ChallengeControlException(String message) {
        super(message);
    }

    public ChallengeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChallengeControlException(Throwable cause) {
        super(cause);
    }

    public ChallengeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
