/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * This will Read a file and make objects of all the base Items that are in the file
 * @author steel elysium
 */ 
public class ReadFile {
    public static ArrayList<Item> ReadJson(String fName){
        ArrayList<Item> allResipies = new ArrayList<>();
        String stringRaw = "";
        ObjectMapper map = new ObjectMapper();
        try{
            File rawData = new File(fName);
            Scanner reader = new Scanner(rawData);
            while(reader.hasNextLine()){
                stringRaw += reader.nextLine();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An Error has Occured");
            e.printStackTrace();
        }
        
        return allResipies;
    } 
    
}
