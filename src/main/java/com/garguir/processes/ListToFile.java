package com.garguir.processes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class ListToFile {
    private static final Logger LOGGER = Logger.getLogger("ListToFile");
    private static final String PATH_RESOURCES = System.getProperty("user.dir")+"/src/main/resources/";
    private static final String FILE_EXTENSION = ".csv";
    private static final String LINE_BREAK = "\n";

    public void saveUrls(List<String> list, String apiName){
        StringBuilder stringBuilder = new StringBuilder();
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_RESOURCES+apiName+FILE_EXTENSION));

            for(String line : list) {
                stringBuilder.append(line);
                stringBuilder.append(LINE_BREAK);
            }
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
            LOGGER.info("File " + apiName + ".csv saved");
        }catch (IOException ioException){
            LOGGER.warning("Error: Fail writing the file " + apiName + ".csv " + ioException);
        }
    }
}
