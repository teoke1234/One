package com.teoke.tags.testtype;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.annotation.*;

@Tag("mobile")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
//@MethodSource("com.teoke.ulties.DataProviderUtils#getData")
@Test
public @interface MobileTest {
}
