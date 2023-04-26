/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Degree;
import sujeet.cs665.factorypattern.CSDegree;
import sujeet.cs665.factorypattern.DADegree;

/**
 * @author iamsu
 *
 */
public class DADegreeBuilder implements DegreeBuilder {
	
	private DADegree degree;

    public DADegreeBuilder() {
    	degree = new DADegree();
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
