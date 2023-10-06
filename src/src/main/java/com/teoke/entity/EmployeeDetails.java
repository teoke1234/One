package com.teoke.entity;

import com.teoke.entity.strategy.FirstNameStrategy;
import com.teoke.entity.strategy.LastNameStrategy;
import lombok.Data;
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

}
