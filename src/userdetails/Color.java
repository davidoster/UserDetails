/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdetails;
import java.util.ArrayList;

/**
 *
 * @author George.Pasparakis
 */
public class Color {
    private final ArrayList<String> colors;
    private int favouriteColour;
    
    public Color() {
        this.colors = new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("ORANGE");
        colors.add("INDIGO");
        colors.add("VIOLET");
        colors.add("YELLOW");
    } 
    
    public String getFavouriteColor() {
        return(colors.get(favouriteColour));
    }
    
    public void setFavouriteColor(int color) {
        favouriteColour = color - 1;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void showColors() {
//         System.out.println("The colors of the list are :" + colors);
         for(int i = 0; i < colors.size(); i++) {
             System.out.println((i + 1) + ". " + colors.get(i));
         }
     }

    @Override
    public String toString() {
        return "Color{" + "favouriteColour=" + getFavouriteColor() + '}';
    }
    
    
}
