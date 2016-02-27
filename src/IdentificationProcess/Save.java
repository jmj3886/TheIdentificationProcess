package IdentificationProcess;

import java.io.*;

class Save {
    
      
        public static void writeToFile(String text) {
                try {
                     
                        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Anthro\\CaseLog.txt"), true));
                        bw.write(text);
                        bw.newLine();
                        bw.close();
                } catch (Exception e) {
                }
        }

           public static void rewriteToFile(String text) {
                try {
                     
                          Writer output = null;
                        File file = new File("C:\\Anthro\\CaseLog.txt");
                        output = new BufferedWriter(new FileWriter(file));
                        output.write(text);
                        output.close();    
                    
                } catch (Exception e) {
                }
        }
                              
        public static void Save() throws Exception { 
        if(Log.saveTest == 0){
            Log.entries++;
            rewriteToFile("");
            writeToFile(Integer.toString(Log.entries));
            for(int i = 0; i < Log.entries - 1; i++){
                writeToFile(Log.Case.get(i));
                writeToFile(Log.Age.get(i));
                writeToFile(Log.Race.get(i));
                writeToFile(Log.Sex.get(i));
                writeToFile(Log.Stature.get(i));
            }
            writeToFile(Anthro3.Case.getText());
            writeToFile(Anthro3.Age.getText());
            writeToFile(Anthro3.Race.getText());
            writeToFile(Anthro3.Sex.getText());
            writeToFile(Anthro3.Stature.getText());
            Log.saveTest = 1;
        }
        }
}