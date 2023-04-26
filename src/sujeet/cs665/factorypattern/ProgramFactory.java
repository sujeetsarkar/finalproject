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
public interface ProgramFactory {
	Degree createDegree();
    Certificate createCertificate();
}
