
package kz.almassov.lesson.soapwscxflesson.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.erzhanacm.employee_service package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Employee_QNAME = new QName("http://www.erzhanacm.kz/employee-service", "employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.erzhanacm.employee_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link EmployeeByIdRequest }
     * 
     */
    public EmployeeByIdRequest createEmployeeByIdRequest() {
        return new EmployeeByIdRequest();
    }

    /**
     * Create an instance of {@link EmployeeByNameRequest }
     * 
     */
    public EmployeeByNameRequest createEmployeeByNameRequest() {
        return new EmployeeByNameRequest();
    }

    /**
     * Create an instance of {@link EmployeeResponse }
     * 
     */
    public EmployeeResponse createEmployeeResponse() {
        return new EmployeeResponse();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.erzhanacm.kz/employee-service", name = "employee")
    public JAXBElement<EmployeeType> createEmployee(EmployeeType value) {
        return new JAXBElement<EmployeeType>(_Employee_QNAME, EmployeeType.class, null, value);
    }

}
