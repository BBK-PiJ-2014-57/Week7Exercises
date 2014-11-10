/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instancecounter;

/**
 *
 * @author lewispalmer
 */
public class Spy {
    public static int spyCount = 0;
    private int SpyID;
    public Spy(int ID)
    {
        spyCount++;
        this.SpyID = ID;
        printSpy(ID);
    }
    
    private void printSpy(int ID, String action)
    {
        System.out.println("The " + action + "Spy's ID is:" + ID + ", there are " +
        spyCount + " spies");
    }
    
    private void printSpy(int ID)
    {
        printSpy(ID, "");
    }
    public void die()
    {
        spyCount--;
        printSpy(this.SpyID, "dead ");
    }
}
