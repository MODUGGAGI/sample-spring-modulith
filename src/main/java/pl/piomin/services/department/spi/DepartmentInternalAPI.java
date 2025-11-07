package pl.piomin.services.department.spi;

import pl.piomin.services.department.DepartmentDTO;
import java.util.List;

public interface DepartmentInternalAPI {

    List<DepartmentDTO> getDepartmentsByOrganizationId(Long id);
    List<DepartmentDTO> getDepartmentsByOrganizationIdWithEmployees(Long id);
}
