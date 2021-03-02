package club.codeqi.Component;

//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.connector.Connector;
//import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.Iterator;

//@Configuration
public class TomcatInitializer {
    private String protocol = "org.apache.coyote.http11.Http11NioProtocol";
//    @Bean
//    public Tomcat Tomcat(){
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8097);
////        Connector connector = new Connector(this.protocol);
////        tomcat.getService().addConnector(connector);
////        tomcat.setConnector(connector);
////        tomcat.getHost().setAutoDeploy(false);
//        try {
//            tomcat.start();
//        } catch (LifecycleException e) {
//            e.printStackTrace();
//        }
//        return tomcat;
//    }
}
