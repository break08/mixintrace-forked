package link.infra.mixintrace.misc;

import java.io.File;

public class LogWriter {
    public static void newCrashLog(String file_name, String path)
    {
        try {
            File file1 = new File(path + "\\" + file_name + ".txt");
            file1.createNewFile();
        }

        catch (Exception ex1) {
            System.out.print("Failed to create crash log");
        }
    }
}