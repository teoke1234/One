package com.teoke.testdata;

import com.teoke.entity.LoginDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class LoginTestData {
    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    private LoginTestData() {
    }

    public static LoginDetails getEmloyeeDetails() {
        return FACTORY.manufacturePojo(LoginDetails.class);
    }

}
