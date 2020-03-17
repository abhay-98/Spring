package beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class data{
        @Bean
        public StudentDao StudentDao() {
            return new StudentDao();
                }
    }
