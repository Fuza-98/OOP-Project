/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amanahbookingsystem;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LocalResident extends Resident{
    private String homeState;
    private int emergencyContact;
    
    public LocalResident (String residentID, String name, String faculty, int yearOfStudy,
                          String block, String room,
                          String homeState, int emergencyContact){
        
        super(residentID,name, faculty, yearOfStudy, block, room);
        this.homeState = homeState;
        this.emergencyContact = emergencyContact;
    }
    
    
   /*
   public void setHome(){
       Scanner input = new Scanner(System.in);
       String home;
       System.out.print("Enter home state: ");
       home = input.nextLine();
       homeState = home;
   }
   
   public void setContact(){
       Scanner input = new Scanner(System.in);
       int phone;
       System.out.print("Enter emergency contact: ");
       phone = input.nextInt();
       emergencyContact = phone;
   }
   
   @Override
   public void addResident(){
       super.addResident();
       setHome();
       setContact();
   }
   
   @Override
   public void displayDetails(){
       super.displayDetails();
       System.out.println("Home state: " + homeState);
       System.out.println("Emergency contact: " + emergencyContact);
   }
    */
    
    
}
