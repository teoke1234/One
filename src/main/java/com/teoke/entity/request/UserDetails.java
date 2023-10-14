package com.teoke.entity.request;

import com.teoke.entity.strategy.FirstNameStrategy;
import com.teoke.entity.strategy.JobStrategy;
import lombok.Data;
import uk.co.jemos.podam.common.PodamStrategyValue;

@Data
public class UserDetails {
    @PodamStrategyValue(FirstNameStrategy.class)
    private String name;
    @PodamStrategyValue(JobStrategy.class)
    private String job;

}
