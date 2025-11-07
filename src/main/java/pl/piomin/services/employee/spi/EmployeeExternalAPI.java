package pl.piomin.services.employee.spi;

import pl.piomin.services.employee.EmployeeDTO;

public interface EmployeeExternalAPI {

    EmployeeDTO add(EmployeeDTO employee);
}
