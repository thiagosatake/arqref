package arqref.one.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import arqref.one.security.ArqRefOneSercurityConfiguration;

@Configuration
@ComponentScan("arqref.one.web")
@Import(ArqRefOneSercurityConfiguration.class)
public class ArqRefOneWebConfiguration {

}
