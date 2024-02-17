
/**
 * Bank Account class that keeps track of the amount of money a player has in monopoly
 *
 * @Hudson Stimmler
 * @01/30/2022 
 */
import java.util.*;
public class BankAccount
{
    private int total;
    
    /**
     * Creates the BankAccount class 
     */
    public BankAccount()
    {
        total = 1500;
    }

    /**
     * Returns the total in the players Bank Account
     * @return Bank Account Total
     */
    public int balance()
    {
        return total;
    }
    /**
     * Adds money to the Bank Account
     * @param amount the amount that the player is receiving
     */
    public void deposit(int amount)
    {
        total += amount;
    }
    /**
     * Takes money from the Bank Account
     * @param amount1 the amount that the player is paying
     */
    public void withdrawl(int amount1)
    {
        total -= amount1;
    }
}
