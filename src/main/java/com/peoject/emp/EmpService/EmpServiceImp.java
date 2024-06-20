package com.peoject.emp.EmpService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peoject.emp.EmpRepo.EmpEntity;
import com.peoject.emp.EmpRepo.EmpRepo;

@Service
public class EmpServiceImp implements EmpService {
    
    @Autowired
    private EmpRepo empRepo;

    List<EmpEntity> employee = new ArrayList<>();


    @Override
    public void createEmployee(EmpEntity employee) {
        empRepo.save(employee);
    }

    @Override
    public List<EmpEntity> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public String updateEmployee(int id, EmpEntity employee) {
        EmpEntity emp = empRepo.findById(id).get();

        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setGender(employee.getGender());

        empRepo.save(emp);

        return "EmployeeData Updated Successfully";
    }

    @Override
    public boolean deleteEmployee(int id) {
        EmpEntity emp = empRepo.findById(id).get();
        empRepo.delete(emp);
        return true;
    }

    @Override
    public Optional<EmpEntity> getEntityById(int id) {
        return empRepo.findById(id);
    }
    
}
