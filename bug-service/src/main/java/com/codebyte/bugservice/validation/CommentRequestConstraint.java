package com.codebyte.bugservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CommentRequestValidator.class)
public @interface CommentRequestConstraint {

    String message() default "Request body does not contain all mandatory fields";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
