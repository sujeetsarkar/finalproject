/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Certificate;
import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CSCertificate;
import sujeet.cs665.factorypattern.CSDegree;

/**
 * @author iamsu
 *
 */
public class CSCertificateBuilder implements CertificateBuilder {
	
	private CSCertificate degree;

    public CSCertificateBuilder() {
    	degree = new CSCertificate();
    }

	@Override
	public void buildCourses() {
		System.out.println("buildCourses");

	}

	@Override
	public Certificate getCertificate() {
		return degree;
	}

}
