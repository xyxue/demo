package DTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by wy_xue on 2018/12/10.
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {


    private String title;

    private String description;


}
