/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amanahbookingsystem;

import java.util.Scanner;

public class AmanahBookingSystem {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Resident[] res = new Resident[2];
        System.out.println("\n Enter Resident Detail 1");

        
        for(int i = 0; i<res.length; i++){
            
            System.out.println("\n Enter Resident Detail " + res[i]);
            
            /*res[i] = new LocalResident();
            System.out.println("Enter details for Resident " + (i+1));
            res[i].addResident();
            System.out.println("");
            */
            
            /* Awal ii pilih dulu kau nak isi bahagian mana, senang satukan 
               instead of nak buat semua get set satu ii, coding not readeable
            */
            
            System.out.print("Resident Type ( 1-> Local // 2-> International ): ");
            int type = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter ID : ");
            String residentID = scan.nextLine();
            
            System.out.print("Enter Name : ");
            String name = scan.nextLine();
            
            System.out.print("Enter Faculty : ");
            String faculty = scan.nextLine();
            
            System.out.print("Enter Year of Study : ");
            int yearOfStudy = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter Appartment Block : ");
            String block = scan.nextLine();
            
            System.out.print("Enter Room Number : ");
            String room = scan.nextLine();
            
            if (type == 1){
                System.out.print("Enter Home State : ");
                String homeState = scan.nextLine();
                
                System.out.print("Enter Emergency Contact : ");
                int emergencyContact = scan.nextInt();
                scan.nextLine();
                
                res[i] = new LocalResident(residentID, name, faculty, 
                        yearOfStudy, block, room, homeState, emergencyContact);
                
            } else {
                System.out.print("Enter Country : ");
                String country = scan.nextLine();
            
                System.out.print("Enter Passport Number : ");
                String passport = scan.nextLine();
                
                res[i] = new InternationalResident(residentID, name, faculty, 
                        yearOfStudy, block, room, country, passport);
            }
            
        }
        
        int choice;
        do{
            System.out.println("You can choose from (1-5) to do this: ");
            System.out.println("Choose 1 for search");
            System.out.println("Choose 2 for update (x siap lagi)");
            System.out.println("Choose 3 for delete (x siap lagi)");
            System.out.println("Choose 4 for view resident (x siap lagi)");
            System.out.println("Choose 5 for view room occupancy (x siap lagi)");
            System.out.println("-1(off)");
            System.out.println("Choose which action you want to take: ");
            
            choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice){
                
            case 1:  
                    System.out.println("==Search Resident==");
                    System.out.print("Enter ResidentID or Name : ");
                    String keyword = scan.nextLine();
                    Resident.search(res, keyword);
                    break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
                    
            
            }
       } while(choice != -1);
        
    }
}
    

