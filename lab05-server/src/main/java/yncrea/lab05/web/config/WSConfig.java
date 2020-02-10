package yncrea.lab05.web.config;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

@ImportResource(classpath:META-INF/cxf/cxf.xml)
public class WSConfig {

    @Autowired
    private Bus bus;

    
}
