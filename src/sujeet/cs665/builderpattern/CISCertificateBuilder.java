/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Certificate;
import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CISCertificate;

/**
 * @author iamsu
 *
 */
public class CISCertificateBuilder implements CertificateBuilder {
	
	private CISCertificate certificate;

    public CISCertificateBuilder() {
    	certificate = new CISCertificate();
    }

	@Override
	public void buildCourses() {
		System.out.println("buildCourses");
	}

	@Override
	public Certificate getCertificate() {
		return certificate;
	}

}
