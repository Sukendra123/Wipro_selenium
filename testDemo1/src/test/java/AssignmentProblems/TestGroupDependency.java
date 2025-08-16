package AssignmentProblems;

import org.testng.annotations.Test;

public class TestGroupDependency {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("smoke");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("smoke");
	}
	
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("smoke");
	}
	
	@Test(groups = "sanity")
	public void test4() {
		System.out.println("sanity");
		//System.out.println(5/0);
	}
	
	@Test(groups = "sanity")
	public void test5() {
		System.out.println("sanity");
	}
	
	@Test(groups = "regression")
	public void test6() {
		System.out.println("regression");
	}
	
	@Test(groups = "regression")
	public void test7() {
		System.out.println("regression");
	}
	
 	@Test(dependsOnGroups = { "smoke", "sanity", "regression"})
 	public void test0() {
 		System.out.println("main test");
 	}
}
