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
public class InstanceCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spy JamesBond = new Spy(007);
        Spy JohnnyEnglish = new Spy(001);
        Spy LewisPalmer = new Spy(003);
        LewisPalmer.die();
        JohnnyEnglish.die();
    }
    
}
