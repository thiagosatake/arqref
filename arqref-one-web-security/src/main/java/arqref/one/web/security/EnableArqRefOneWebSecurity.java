package arqref.one.web.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import arqref.web.one.security.EnableArqRefOneSecurity;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan("arqref.one.web.security")
@EnableArqRefOneSecurity
public @interface EnableArqRefOneWebSecurity {

}
