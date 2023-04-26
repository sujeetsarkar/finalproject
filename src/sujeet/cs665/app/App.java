/**
 * 
 */
package sujeet.cs665.app;

import sujeet.cs665.builderpattern.CISCertificateBuilder;
import sujeet.cs665.builderpattern.CISDegreeBuilder;
import sujeet.cs665.builderpattern.CSCertificateBuilder;
import sujeet.cs665.builderpattern.CSDegreeBuilder;
import sujeet.cs665.builderpattern.CertificateBuilder;
import sujeet.cs665.builderpattern.DADegreeBuilder;
import sujeet.cs665.builderpattern.DegreeBuilder;
import sujeet.cs665.demo.Certificate;
import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CISFactory;
import sujeet.cs665.factorypattern.CSFactory;
import sujeet.cs665.factorypattern.DAFactory;
import sujeet.cs665.factorypattern.ProgramFactory;

/**
 * @author iamsu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Factory Pattern
		// Create a CS certificate using the abstract factory pattern
		ProgramFactory csFactory = new CSFactory();
		Certificate csCertificate = csFactory.createCertificate();
		//Degree
		Degree csDegree = csFactory.createDegree();

		// Create a CIS certificate using the abstract factory pattern
		ProgramFactory cisFactory = new CISFactory();
		Certificate cisCertificate = cisFactory.createCertificate();
		//Degree
		Degree cisDegree = cisFactory.createDegree();

		// Create a DA certificate using the abstract factory pattern
		ProgramFactory daFactory = new DAFactory();
		//Degree
		Degree daDegree = daFactory.createDegree();
		
		System.out.println("-------------------------------");
		
		//Builder Pattern
		// Create a CS Degree using the builder pattern
		DegreeBuilder csBuilder = new CSDegreeBuilder();
		csBuilder.buildCoreCourses();
		csBuilder.buildElectiveCourses();
		csBuilder.buildThesis();
		daDegree = csBuilder.getDegree();
		System.out.println("-------------------------------");

		// Create a CIS Degree using the builder pattern
		DegreeBuilder cisBuilder = new CISDegreeBuilder();
		cisBuilder.buildCoreCourses();
		cisBuilder.buildElectiveCourses();
		cisBuilder.buildThesis();
		cisDegree = cisBuilder.getDegree();
		System.out.println("-------------------------------");

		// Create a DA Degree using the builder pattern
		DegreeBuilder daBuilder = new DADegreeBuilder();
		daBuilder.buildCoreCourses();
		daBuilder.buildElectiveCourses();
		daBuilder.buildThesis();
		daDegree = daBuilder.getDegree();
		System.out.println("-------------------------------");
		
		// Create a CS Certificate using the builder pattern
		CertificateBuilder csCertificate1 = new CSCertificateBuilder();
		csCertificate1.buildCourses();
		csCertificate = csCertificate1.getCertificate();

		System.out.println("-------------------------------");
		// Create a CIS Certificate using the builder pattern
		CertificateBuilder cisCertificate1 = new CISCertificateBuilder();
		cisCertificate1.buildCourses();
		cisCertificate = cisCertificate1.getCertificate();

	}

}
