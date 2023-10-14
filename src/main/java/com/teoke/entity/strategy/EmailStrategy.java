package com.teoke.entity.strategy;

import com.github.javafaker.Faker;
import uk.co.jemos.podam.api.PodamUtils;
import uk.co.jemos.podam.common.AttributeStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmailStrategy implements AttributeStrategy<String> {
    @Override
    public String getValue(Class<?> attrType, List<Annotation> annotations) throws PodamMockeryException {
        StringBuilder sb = new StringBuilder();
        sb.append(PodamUtils.getNiceString(3)).append(".").append(PodamUtils.getNiceString(4));
        sb.append("@");
        sb.append(PodamUtils.getNiceString(4)).append(".").append(
                Arrays.asList("com","io","cco","bit","aka ","cmd").get(new Random().nextInt(6)));
        return sb.toString();
    }
}
