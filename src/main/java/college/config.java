package college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "college")
@PropertySource("college.properties")
public class config{
@Bean
public bean one(){
    return new bean();
}
@Bean
public College College(){
    return new College();
}
}