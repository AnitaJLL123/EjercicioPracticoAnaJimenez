package com.test.automation.util.constants;

import com.test.automation.util.EnvironmentConfig;

import java.io.File;

import static com.test.automation.util.constants.Constants.*;

public class Paths {
    private Paths() {
    }

    private static final EnvironmentConfig enviromentConfig = new EnvironmentConfig();

    private static final String USER_DIR_PATH = System.getProperty(USER_DIR);

    private static final String RESOURCES_PATH = USER_DIR_PATH + File.separator + SRC + File.separator + TEST + File.separator + RESOURCES + File.separator;
    private static final String FEATURE_PATH = RESOURCES_PATH + FEATURES + File.separator;
    private static final String DATA_PATH = RESOURCES_PATH + DATA + File.separator;
    private static final String PROPERTIES_PATH = RESOURCES_PATH + PROPERTIES + File.separator;


    public static String featuresPath() {
        if (!enviromentConfig.getVariable(ATTRIB_FEATURES_PATH).isEmpty())
            return enviromentConfig.getVariable(ATTRIB_FEATURES_PATH);
        return FEATURE_PATH;
    }

    public static String dataPath() {
        if (!enviromentConfig.getVariable(ATTRIB_DATA_PATH).isEmpty())
            return enviromentConfig.getVariable(ATTRIB_DATA_PATH);
        return DATA_PATH;
    }

    public static String propertiesPath() {
        if (!enviromentConfig.getVariable(ATTRIB_PROPERTIES_PATH).isEmpty())
            return enviromentConfig.getVariable(ATTRIB_PROPERTIES_PATH);
        return PROPERTIES_PATH;
    }

    public static String validatePath(String path) {
        String[] separators = {"/", "\\", "-"};
        for (String separator : separators) {
            if (path.contains(separator)) {
                path = path.replace(separator, File.separator);
                break;
            }
        }
        return path;
    }
}