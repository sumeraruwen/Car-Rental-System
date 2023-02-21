package lk.ijse.spring.config;

import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.impl.CustomerServiceImpl;
import lk.ijse.spring.service.impl.DriverServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackageClasses = {DriverServiceImpl.class, CustomerServiceImpl.class})
public class WebRootConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
