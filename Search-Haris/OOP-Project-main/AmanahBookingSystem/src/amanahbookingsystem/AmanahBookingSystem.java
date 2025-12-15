/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amanahbookingsystem;

import java.util.Scanner;

public class AmanahBookingSystem {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Resident[] res = new Resident[10];
        int count = 0;
  
        
        int choice;
        do{
            System.out.println("=======Amanah Booking System========");
            System.out.println("Choose 1 for add");
            System.out.println("Choose 2 for search (x siap lagi)");
            System.out.println("Choose 3 for update (x siap lagi)");
            System.out.println("Choose 4 for delete (x siap lagi)");
            System.out.println("Choose 5 for view resident (x siap lagi)");
            System.out.println("Choose 6 for view room occupancy (x siap lagi)");
            System.out.println("-1(off)");
            System.out.print("Choose which action you want to take: ");
            
            choice = scan.nextInt();
            scan.nextLine();
            
            if (count == 0 && choice != 1 && choice!= -1){
                System.out.println("\n!!!!!!!!!No resident found. Please add resident first.\n");
                continue;
            }
            
            switch (choice){
                
            case 1:
                
                    if(count >= res.length){
                        System.out.println(" ");
                        System.out.println("\nThe resident list is currently full.");
                        System.out.println(" ");
                        break;
                    }
                    
                    //tak payah pakau for loop dah hahahaha
        
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
                           
                        //dah tak pakai res[i] sebab buang loop, guna count instead
                        if (type == 1){
                            System.out.print("Enter Home State : ");
                            String homeState = scan.nextLine();

                            System.out.print("Enter Emergency Contact : ");
                            int emergencyContact = scan.nextInt();
                            scan.nextLine();

                            res[count] = new LocalResident(residentID, name, faculty, 
                                    yearOfStudy, block, room, homeState, emergencyContact);

                        } else {
                            System.out.print("Enter Country : ");
                            String country = scan.nextLine();

                            System.out.print("Enter Passport Number : ");
                            String passport = scan.nextLine();

                            res[count] = new InternationalResident(residentID, name, faculty, 
                                    yearOfStudy, block, room, country, passport);
                        }

                    count++;
                    System.out.println(" ");
                    System.out.println("Successfully add a resident !!! ");
                    System.out.println(" ");
                    
                    break;
            case 2:
                    System.out.println("==Search Resident==");
                    System.out.print("Enter ResidentID or Name : ");
                    String keyword = scan.nextLine();
                    Resident.search(res, count,keyword);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
                    
            
            }
       } while(choice != -1);
        
    }
}
    

