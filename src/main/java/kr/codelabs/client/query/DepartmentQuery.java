package kr.codelabs.client.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import kr.codelabs.client.model.Department;
import kr.codelabs.client.service.DepartmentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentQuery implements GraphQLQueryResolver {

    private DepartmentService departmentService;

    public DepartmentQuery(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<Department> getDepartments() {
        return departmentService.getAllDepartments();
    }
}
