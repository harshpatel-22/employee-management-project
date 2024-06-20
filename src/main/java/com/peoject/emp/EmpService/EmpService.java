package com.peoject.emp.EmpService;

import java.util.*;

import com.peoject.emp.EmpRepo.EmpEntity;

public interface EmpService {

    void createEmployee(EmpEntity employee);
    
    List<EmpEntity> getAllEmployees();

    String updateEmployee(int id, EmpEntity employee);
    
    boolean deleteEmployee(int id);
    
    Optional<EmpEntity> getEntityById(int id);
}
