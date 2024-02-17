
/**
 * Write a description of class Player here.
 *
 * @Hudson Stimmler
 * @01/30/2022 
 */
import java.util.*;
public class Player
{
    private BankAccount a;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        a = new BankAccount();
    }
    
    public int getBank()
    {
        int d = a.balance();
        return d;
    }
}
