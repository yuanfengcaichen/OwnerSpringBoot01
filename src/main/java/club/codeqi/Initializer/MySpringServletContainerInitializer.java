package club.codeqi.Initializer;

import club.codeqi.Config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

//@HandlesTypes({MyWebApplicationInitializer.class})
public class MySpringServletContainerInitializer implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型：");
//        for (Class<?> claz : set) {
//            System.out.println(claz);
//        }
//        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//        //注册spring的配置类（替代传统项目中xml的configuration）
//        ac.register(AppConfig.class);
//        ac.refresh();
//
//        // Create and register the DispatcherServlet
//        //基于java代码的方式初始化DispatcherServlet
//        DispatcherServlet servlet = new DispatcherServlet(ac);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/app/*");
    }
}
