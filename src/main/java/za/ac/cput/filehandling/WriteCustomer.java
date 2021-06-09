/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.filehandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Ndumi Gaga
 */
public class WriteCustomer {
    ObjectInputStream input;
       Customer customer;
    public static void main (String args[]){
  
       ArrayList<String> customersList = new ArrayList<String>();
      Collections.sort(customersList);
   
   
     public void openFile() {
        try{
            input = new ObjectInputStream( new FileInputStream( "stakeholder.ser" ) ); 
            System.out.println("file open"); 
            
            
        }
        catch (IOException ioe){
            System.out.println("error opening ser file: " );
            System.exit(1);
        }
    }
    
    
    public void closeFile(){
        try{
        input.close( ); 
        }
        catch (IOException ioe){            
            System.out.println("error closing ser file" );
            System.exit(1);
        }        
   }
    
    
    public void ReadFile() throws IOException, ClassNotFoundException{
        
        try{
       while(true) {
       customer = (Customer)input.readObject();
           System.out.println(customer);
       }
        }
        catch(EOFException eof){
            System.out.println("reached end");
        }
    }
    
   
}