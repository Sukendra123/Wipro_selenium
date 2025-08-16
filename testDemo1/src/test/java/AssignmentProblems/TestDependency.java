package AssignmentProblems;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
	static String trackingNumber = null;
  
	//@Ignore
	@Test
	public void CreateShipment() throws Exception
	{
		//System.out.println(5/0);
		System.out.println("CreateShipment");
		trackingNumber = "ABC12YH";
	}
	
	@Test( dependsOnMethods = {"CreateShipment"},ignoreMissingDependencies = true)
	public void TrackShipment() throws Exception
	{
		if(trackingNumber !=null)
			System.out.println("TrackShipment");
		else
			throw new Exception("invalid tracking number");
	}
	
	@Test( priority=3,dependsOnMethods = {"CreateShipment","TrackShipment"},ignoreMissingDependencies = true)
	public void CancelShipment() throws Exception
	{
		if(trackingNumber !=null)
			System.out.println("CancelShipment");
		else
			throw new Exception("invalid tracking number");
	}
}
