package kz.almassov.lesson.soapwscxflesson.service;


import kz.almassov.lesson.soapwscxflesson.generated.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class EmployeeEndpoint implements EmployeeServicePortType {

    @Autowired
    BackendService backendService;

    public EmployeeEndpoint (BackendService backendService){
        this.backendService = backendService;
    }

    @Override
    public EmployeeResponse getEmployeesByName(EmployeeByNameRequest parameters) {
        EmployeeResponse employeesResponse = new EmployeeResponse();
        try{
            employeesResponse.getEmployee().addAll(backendService.getEmployeesByName(parameters.getFirstname(), parameters.getLastname()));
        }
        catch (Exception e){
            log.error("Error while setting values for employee object", e);
        }
        return employeesResponse;
    }

    @Override
    public EmployeeResponse getEmployeeById(EmployeeByIdRequest request) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        try{
            employeeResponse.getEmployee().add(backendService.getEmployeeById(request.getId()));
        }
        catch (Exception e){
            log.error("Error while setting values for employee object", e);
        }
        return employeeResponse;
    }
}
