package IListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listener.ListnerClass.class)
@Listeners(IListener.ListenerDemo.class)
public class ListnerClass {
	
	
	@Test
	  public void test1() {
		System.out.println(" this is my test1");

	  }
	   
		@Test
	   public void test2() {
		System.out.println(" this is my test2");
		Assert.assertTrue(false);
	  }
	   
		@Test
	   public void test3() {
		   System.out.println(" this is my test3");
		   throw new SkipException("this is skipped");
		  
	   }

	}


