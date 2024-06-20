package com.peoject.emp.EmpController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peoject.emp.EmpRepo.EmpEntity;
import com.peoject.emp.EmpService.EmpService;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("employee")
    public String addEmployee(@RequestBody EmpEntity employee) {
        empService.createEmployee(employee);

        return "Employee Added Successfully";
    }

    @GetMapping("employee")
    public List<EmpEntity> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @PutMapping("employee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmpEntity employee) {
        return empService.updateEmployee(id, employee);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        if (empService.deleteEmployee(id)) {
            return "Employee Deleted";
        }
        return "Employee Not found";
    }

    @GetMapping("employee/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable int id) {
        Optional<EmpEntity> employee = empService.getEntityById(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        }
        return ResponseEntity.status(404).body("Employee Not Found");
    }
}
