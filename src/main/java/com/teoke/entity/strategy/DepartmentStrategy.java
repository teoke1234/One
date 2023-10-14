package com.teoke.entity.strategy;

import com.github.javafaker.Faker;
import uk.co.jemos.podam.common.AttributeStrategy;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DepartmentStrategy implements AttributeStrategy<String> {
    @Override
    public String getValue(Class<?> aClass, List<Annotation> list) {
        List<String> department = Arrays.asList("HR", "IT", "Marketing", "Finance", "Accounting ", "R&D");
        int randomIndex = new Random().nextInt(department.size());
        return department.get(randomIndex);
    }
}
