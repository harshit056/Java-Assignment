package com.java.assignment.java.assignment.Repository;

import com.java.assignment.java.assignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department,String> {
    public List<Department> findByDepartmentId(String id);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE department d SET d.department_name= :name WHERE d.department_id= :deptId",nativeQuery = true   )
    void updateDepartmentNameByDepartmentId(@Param("name") String name,@Param("deptId") String id);
}
