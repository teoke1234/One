package com.teoke.testdata;

import com.teoke.entity.request.UserDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class UserTestData {

    private UserTestData() {
    }

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static UserDetails getUserDetails() {
        return FACTORY.manufacturePojo(UserDetails.class);
    }

}
