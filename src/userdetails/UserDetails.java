/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdetails;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author George.Pasparakis
 */
public class UserDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        userDetails();            
    }
    
    static void userDetails() {
        User user = askUserDetails();
        if(writeUserToFile(user, "usersdetails.txt", true)) { 
            System.out.println("All good!");
        }
        else {
            System.out.println("Write file error!");
        }
    }
    
    static User askUserDetails() {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.print("Please type your name: ");
        user.setName(sc.next());
        System.out.print("\nPlease type your lastname: ");
        user.setSurname(sc.next());
        System.out.print("\nPlease type your age: ");
        user.setAge(sc.nextFloat());
        System.out.println("Please select your favourite colour: ");
        user.getColor().showColors();
        int colorChoice = sc.nextInt();
        user.getColor().setFavouriteColor(colorChoice);
        
        System.out.println("User details : " + user);
        return(user);
    }
    
    static boolean writeUserToFile(User user, String fileName, boolean mode) {
        // boolean mode: false->create file, true->append file
        
        if(!mode) {
            try( 
                PrintWriter printWriter = new PrintWriter(fileName, "UTF-8")) {
                printWriter.println(user);
                printWriter.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
                return(false);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
                return(false);
            }
        }
        else {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(fileName, true); //Set true for append mode
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(user);
                printWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
                return(false);
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
                    return(false);
                }
            }
        }
        return(true);
    }
}
