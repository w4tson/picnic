package com.picnic;

import javafx.fxml.FXMLLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.picnic.config.AppConfig;
import com.picnic.controller.MainController;

import java.io.IOException;
import java.io.InputStream;

public class SpringFxmlLoader {

    private static final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    public Object load(String url) {
        try (InputStream fxmlStream = SpringFxmlLoader.class
                .getResourceAsStream(url)) {
            System.err.println(SpringFxmlLoader.class
                    .getResourceAsStream(url));
            FXMLLoader loader = new FXMLLoader();

            MainController controller = context.getBean(MainController.class);
            loader.setController(controller);

//TODO: could code something up to wire views -> controllers by convention
//            loader.setControllerFactory(new Callback<Class<?>, Object>() {
//                @Override
//                public Object call(Class<?> clazz) {
//                    return applicationContext.getBean(clazz);
//                }
//            });
            
            return loader.load(fxmlStream);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}