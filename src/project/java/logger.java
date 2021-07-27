package project.java;

import java.io.*;

public class logger implements loggerInterface {
    BufferedWriter out;
    static File log = null;

    public logger() {
        do {
            int a = (int) System.currentTimeMillis();
            log = new File("logFile" + a % 10000 + ".dat");
        } while (log.exists());


        try {
            log.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startLogger() {
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(log, true)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endLogger() {
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logMessage(String message) {

        try {
            out.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
