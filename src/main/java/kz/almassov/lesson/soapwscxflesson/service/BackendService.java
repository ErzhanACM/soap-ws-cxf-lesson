package kz.almassov.lesson.soapwscxflesson.service;

import kz.almassov.lesson.soapwscxflesson.generated.*;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class BackendService {

    List<EmployeeType> getEmployeesByName(String firstName, String lastName) throws Exception{
        AddressType daukaAddress = new AddressType();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        daukaAddress.setFromDate(now);
        daukaAddress.setAddress("г. Караганда, Кривогуза, 23");

        EmployeeType employee1 = new EmployeeType();
        employee1.setId(1);
        employee1.setFirstname("Daulet");
        employee1.setLastname("Kabdygaliev");
        employee1.setGender("M");
        employee1.setBirthdate(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("1999-07-08"));
        employee1.getAddressInfo().add(daukaAddress);

        EmployeeType employee2 = new EmployeeType();
        employee2.setId(2);
        employee2.setFirstname(firstName);
        employee2.setLastname(lastName);

        return Arrays.asList(employee1, employee2);
    }

    EmployeeType getEmployeeById(long id) throws Exception{
        EmployeeType employee = new EmployeeType();
        employee.setId((int) id);
        employee.setFirstname("Erzhan");
        employee.setLastname("Almassov");
        employee.setBirthdate(DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("1996-10-04"));

        AddressType address = new AddressType();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        address.setFromDate(now);
        address.setAddress("г. Темиртау, 8 м-н, 81");

        employee.getAddressInfo().add(address);
        return employee;
    }
}
