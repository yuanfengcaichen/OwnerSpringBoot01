package club.codeqi.Component;

import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletRegiester {
    private DispatcherServlet dispatcherServlet;

    public DispatcherServletRegiester(DispatcherServlet dispatcherServlet) {
        this.dispatcherServlet = dispatcherServlet;
    }
}
