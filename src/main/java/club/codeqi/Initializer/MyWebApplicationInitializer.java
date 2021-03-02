package club.codeqi.Initializer;

import club.codeqi.Config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //注册spring的配置类（替代传统项目中xml的configuration）
        ac.register(AppConfig.class);
        //ac.refresh();
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");
        // Create and register the DispatcherServlet
        //基于java代码的方式初始化DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
        MySpringServletContainerInitializer ms= new MySpringServletContainerInitializer();
        ms.onStartup(null,servletContext);
    }
}
