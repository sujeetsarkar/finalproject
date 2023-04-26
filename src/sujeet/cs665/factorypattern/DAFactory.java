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
public class DAFactory implements ProgramFactory {

	@Override
	public Degree createDegree() {
		return new DADegree();
	}

	@Override
	public Certificate createCertificate() {
		return null;
	}

}
