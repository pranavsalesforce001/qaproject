package nopcommerce.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

        static Properties prop;
        static FileInputStream input;
        static String fileName = "TestDataConfig.properties";
        static String fileLocation = "src\\test\\Helper\\";
        public String getProperty(String key){
            prop = new Properties();
            try {
                input = new FileInputStream(fileLocation + fileName);
                prop.load(input);
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop.getProperty(key);
        }
}
