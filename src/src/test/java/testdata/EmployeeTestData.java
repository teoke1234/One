package testdata;

import com.teoke.entity.EmployeeDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class EmployeeTestData {

    private static final PodamFactory FACTORY = new PodamFactoryImpl();
    private EmployeeTestData(){}

    public static EmployeeDetails getRamdomEmployeeDetails(){
        return FACTORY.manufacturePojo(EmployeeDetails.class);
    }

}
