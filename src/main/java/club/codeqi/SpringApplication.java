package club.codeqi;

import club.codeqi.Component.TomcatInitializer;
import club.codeqi.Config.AppConfig;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringApplication {
    public static void run(Class clzss,String[] args) {
        System.out.println("class: " +clzss.getName());
        System.out.println("args: "+args);
        /**
         * 1.实例化并启动Tomcat
         * 2.创建DispatcherServlet并将其放入Ioc容器中
         * 3.将创建好的DispatcherServlet对象放入Tomcat的ServletContext中
         */
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //注册spring的配置类（替代传统项目中xml的configuration）
        ac.register(AppConfig.class);
        //ac.refresh();
//        TomcatInitializer tomcatInitializer = new TomcatInitializer();
//        Tomcat tomcat = tomcatInitializer.Tomcat();
//        try {
//            tomcat.start();
//        } catch (LifecycleException e) {
//            e.printStackTrace();
//        }
//        System.out.println("-----------------");
    }
}
