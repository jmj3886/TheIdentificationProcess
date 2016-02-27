package IdentificationProcess;

import java.io.*;
import java.util.Scanner;
class FileRead 
{
 
    
 public static void main()
  {
  try{
  
  FileReader reader = new FileReader("C:\\Anthro\\CaseLog.txt");
  Scanner in = new Scanner(reader);    
      
  FileInputStream fstream = new FileInputStream("C:\\Anthro\\CaseLog.txt");
  
  DataInputStream in2 = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in2));
  
if(Log.readTest == 0){
          int Entries = Integer.parseInt(br.readLine());
          Log.entries = Entries;
          for(int i = 0; i < Log.entries; i++){
              String Case = br.readLine();  
              String Age = br.readLine();  
              String Race = br.readLine();  
              String Sex = br.readLine();  
              String Stature = br.readLine();
              Log.Case.add(Case);
              Log.Age.add(Age);
              Log.Race.add(Race);
              Log.Sex.add(Sex);
              Log.Stature.add(Stature);  
          }
}
  
  
  
  in.close();
  in2.close();
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  }
  }
}