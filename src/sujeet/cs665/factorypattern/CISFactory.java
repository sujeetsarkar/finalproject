/**
 * 
 */
package sujeet.cs665.factorypattern;

import sujeet.cs665.demo.Certificate;
import sujeet.cs665.demo.Degree;

/**
 * @author iamsu
 *
 */
public class CISFactory implements ProgramFactory {

	@Override
	public Degree createDegree() {
		return new CISDegree();
	}

	@Override
	public Certificate createCertificate() {
		return new CISCertificate();
	}

}
