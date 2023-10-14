package com.teoke.entity;

import com.teoke.entity.strategy.*;
import lombok.Data;
import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStrategyValue;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class EmployeeDetails {

    @PodamStrategyValue(FirstNameStrategy.class)
    private String firstname;
    @PodamStrategyValue(LastNameStrategy.class)
    private String middlename;
    @PodamStrategyValue(LastNameStrategy.class)
    private String lastname;
    @PodamStringValue(strValue = "images/browserstack.jpeg")
    private String profilePicturePath;
    @PodamStrategyValue(EmailStrategy.class)
    private String email;
    @PodamStrategyValue(AddressStrategy.class)
    private String address;
    @PodamIntValue(minValue = 1,maxValue = 150)
    private int age;
    @PodamIntValue(minValue = 20,maxValue = 1000000)
    private int salary;
    @PodamStrategyValue(DepartmentStrategy.class)
    private String department;

}
