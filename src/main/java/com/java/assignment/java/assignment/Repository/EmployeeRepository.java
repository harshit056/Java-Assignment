package com.java.assignment.java.assignment.Repository;

import com.java.assignment.java.assignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    public List<Employee> findByEmployeeId(String id);
    public List<Employee> findByDepartmentsDepartmentId(String id);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE employee e SET e.employee_name= :name WHERE e.employee_id= :empId",nativeQuery = true   )
     void updateEmployeeNameByEmployeeId(@Param("name") String name,@Param("empId") String id);


}
