package my.examples.txtReader;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ConfigResolver {


    public static String cleanConfigTag(String line){
        Pattern p = Pattern.compile("(<conf>)+(.+)+(<\\/conf>)");
        Matcher matcher = p.matcher(line);
        if (matcher.find()){
            line = matcher.group(2).trim();
        }
        return line;
    }

    public String getName(String line){
        Pattern p = Pattern.compile("^(.{0,})(<name>)(.+)(<\\/name>)+(.{0,})");
        Matcher matcher = p.matcher(line);
        if (matcher.find()){
            line = matcher.group(3).trim();
        }
        return line;
    }

    public String getValue(String line){
        Pattern p = Pattern.compile("^(.{0,})(<value>)(.+)(<\\/value>)+(.{0,})");
        Matcher matcher = p.matcher(line);
        if (matcher.find()){
            line = matcher.group(3).trim();
        }
        return line;
    }

    public boolean isEndOfConfig(String line){
        Pattern p = Pattern.compile("^(.{0,})(<\\/conf>)");
        Matcher matcher = p.matcher(line);
        return matcher.find();
    }
}
