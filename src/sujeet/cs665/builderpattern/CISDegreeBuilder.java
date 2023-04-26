/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CISDegree;

/**
 * @author iamsu
 *
 */
public class CISDegreeBuilder implements DegreeBuilder {
	
	private CISDegree degree;

    public CISDegreeBuilder() {
    	degree = new CISDegree();
    }

	@Override
	public void buildCoreCourses() {
		System.out.println("buildCoreCourses");

	}

	@Override
	public void buildElectiveCourses() {
		System.out.println("buildElectiveCourses");

	}

	@Override
	public void buildThesis() {
		System.out.println("buildThesis");

	}

	@Override
	public Degree getDegree() {
		return degree;
	}

}
