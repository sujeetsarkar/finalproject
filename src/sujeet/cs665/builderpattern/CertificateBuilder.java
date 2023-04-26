/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Certificate;
import sujeet.cs665.demo.Degree;

/**
 * @author iamsu
 *
 */
public interface CertificateBuilder {
	void buildCourses();
	Certificate getCertificate();
}
