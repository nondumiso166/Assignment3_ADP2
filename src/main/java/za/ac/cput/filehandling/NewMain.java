/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.filehandling;

import java.io.IOException;

/**
 *
 * @author Ndumi Gaga
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WriteCustomer cus = new WriteCustomer();
        cus.openFile();
        cus.ReadFile();
        
            }
    
}
