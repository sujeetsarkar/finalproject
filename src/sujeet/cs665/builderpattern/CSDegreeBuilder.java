/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CSDegree;

/**
 * @author iamsu
 *
 */
public class CSDegreeBuilder implements DegreeBuilder {
	
	private CSDegree degree;

    public CSDegreeBuilder() {
    	degree = new CSDegree();
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
