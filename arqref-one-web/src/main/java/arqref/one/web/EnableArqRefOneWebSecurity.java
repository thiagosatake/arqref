package arqref.one.web;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import arqref.one.security.EnableArqRefOneSecurity;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan("arqref.one.web")
@EnableArqRefOneSecurity
public @interface EnableArqRefOneWebSecurity {

}
