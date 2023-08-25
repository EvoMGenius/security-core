package ru.themikhailz.annotation;

import org.springframework.context.annotation.Import;
import ru.themikhailz.config.LibConfig;
import ru.themikhailz.config.SecurityConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Import({SecurityConfig.class, LibConfig.class})
public @interface EnableJwtSecurity {
}
