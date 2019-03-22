package my.examples.configReader;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigReader {

    @Autowired
    private ReaderTxt readerTxt;

    @Autowired
    private ConfigResolver configResolver;

//    private static final String PATH_TO_CONFIG = "/home/vladvs/configMyProgect/config.txt";
//    private static final String PATH_TO_CONFIG = "src/main/resources/configs/myOrmConfig/myConfig.txt";
    private static final String PATH_TO_CONFIG = "src/main/resources/configs/myOrmConfig/myConfig.xml";

    public void run() {
        final List<Config> configs = getConfigs();
        System.out.println(configs);
    }

    public List<Config> getConfigs() {
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
