package my.examples.txtReader;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class ReaderTxt {

    @Autowired
    private ConfigResolver configResolver;

    public List<String> readTxtFileList(String pathToFile) {
        List<String> lines = Lists.newArrayList();
        BufferedReader reader;
        StringBuilder stringBuilder = null;
        try {
            reader = new BufferedReader(new FileReader(pathToFile));
            String readLine;
            stringBuilder = new StringBuilder();
            while ((readLine = reader.readLine()) != null) {
                stringBuilder.append(readLine.trim());
                if (configResolver.isEndOfConfig(readLine.trim())) {
                    lines.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public String readTxtFileString(String pathToFile) {
        BufferedReader reader;
        StringBuilder stringBuilder = null;
        try {
            reader = new BufferedReader(new FileReader(pathToFile));
            String readLine;
            stringBuilder = new StringBuilder();
            while ((readLine = reader.readLine()) != null) {
                stringBuilder.append(readLine.trim());
                if (configResolver.isEndOfConfig(readLine)) {
                    stringBuilder.append("\n");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}
