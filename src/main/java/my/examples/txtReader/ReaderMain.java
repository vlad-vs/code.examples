package my.examples.txtReader;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReaderMain {

    @Autowired
    private ReaderTxt readerTxt;

    @Autowired
    private ConfigResolver configResolver;

//    private static final String PATH_TO_CONFIG = "/home/vladvs/configMyProgect/config.txt";
//    private static final String PATH_TO_CONFIG = "src/main/resources/configs/myOrmConfig/myConfig.txt";
    private static final String PATH_TO_CONFIG = "src/main/resources/configs/myOrmConfig/myConfig.xml";

//<conf>
//	<name>name1</name>
//	<value>value1</value>
//</conf>

//<conf>
//	<name>name2</name>
//	<value>value2</value>
//</conf>

    public void run() {
        final List<Config> configs = getConfigs();
        System.out.println(configs);
    }

    private List<Config> getConfigs() {
        final List<Config> configs = Lists.newArrayList();

        final List<String> configList = readerTxt.readTxtFileList(PATH_TO_CONFIG);

        configList.forEach(s -> {
            final String name = configResolver.getName(s);
            final String value = configResolver.getValue(s);
            configs.add(new Config(name,value));
        });
        return configs;
    }
}
