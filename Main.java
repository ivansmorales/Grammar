/**
 * Integrative practice Part 2
 * Computational mathematics
 * @authors: Anne Constanze Schreiber          A01650066
 *           Jorge Ivan Morales González       A01652650
 * This program computes a grammar and sees if it accepts the string, using tree derivations.
 */

import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

class Main {
    
    static ArrayList<String> nonTerminalSymbols;
    static ArrayList<String> terminalSymbols;
    static String startingSymbol;
    static ArrayList<ArrayList<ArrayList<String>>> productionsGrammar;

    public static void main(String [] args) throws Exception{
        readFile();
    }

    public static void readFile() throws Exception {
        JFileChooser chooser = new JFileChooser();
        int filename = chooser.showOpenDialog(null);
        if (filename == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            Scanner scan = new Scanner (new FileReader(f));
        }
    }

    public static ArrayList<String> nonTerminalSymbols(String archivo){
        String estados = "";
        try {
          Scanner s = new Scanner(new File(archivo));
          estados = s.nextLine();
          states = new ArrayList<String>();
          String[] splitStr = estados.split(",");
          for (int i = 0 ; i < splitStr.length ; i++) {
            states.add(splitStr[i]);
          }
          s.close();
        } catch (FileNotFoundException e) {
          System.out.println("File not found.");
        }
        return states;
      } 

}