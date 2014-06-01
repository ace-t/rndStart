
package kr.pe.constr.webservice.consumer.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kr.pe.constr.webservice.consumer.stub package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _AcetResponse_QNAME = new QName("http://webservice.constr.pe.kr/", "acetResponse");
    private final static QName _Acet_QNAME = new QName("http://webservice.constr.pe.kr/", "acet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kr.pe.constr.webservice.consumer.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcetResponse }
     * 
     */
    public AcetResponse createAcetResponse() {
        return new AcetResponse();
    }

    /**
     * Create an instance of {@link Acet }
     * 
     */
    public Acet createAcet() {
        return new Acet();
    }

    /**
     * Create an instance of {@link UserVo }
     * 
     */
    public UserVo createUserVo() {
        return new UserVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.constr.pe.kr/", name = "acetResponse")
    public JAXBElement<AcetResponse> createAcetResponse(AcetResponse value) {
        return new JAXBElement<AcetResponse>(_AcetResponse_QNAME, AcetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Acet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.constr.pe.kr/", name = "acet")
    public JAXBElement<Acet> createAcet(Acet value) {
        return new JAXBElement<Acet>(_Acet_QNAME, Acet.class, null, value);
    }

}
