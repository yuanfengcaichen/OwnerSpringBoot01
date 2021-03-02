package club.codeqi.Component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

//@Configuration
public class DispatcherInitializer {

    @Bean
    public DispatcherServlet DispatcherServlet(){
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        return dispatcherServlet;
    }

    @Bean
    public DispatcherServletRegiester DispatcherServletRegiester(DispatcherServlet dispatcherServlet){
        return new DispatcherServletRegiester(dispatcherServlet);
    }
}
