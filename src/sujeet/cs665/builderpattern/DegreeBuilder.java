/**
 * 
 */
package sujeet.cs665.builderpattern;

import sujeet.cs665.demo.Degree;

/**
 * @author iamsu
 *
 */
public interface DegreeBuilder {
	void buildCoreCourses();
    void buildElectiveCourses();
    void buildThesis();
    Degree getDegree();
}
