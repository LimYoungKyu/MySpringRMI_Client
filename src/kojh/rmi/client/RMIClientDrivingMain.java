package kojh.rmi.client;


//import kojh.rmi.interfaces.HelloService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// http://stackoverflow.com/questions/812415/why-is-springs-applicationcontext-getbean-considered-bad

public class RMIClientDrivingMain
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");		
		
		RmiClient rmiClient = new RmiClient();		
		rmiClient.invokeRmi("Tom");		
		rmiClient.invokeRmi("Jane");		
		
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");		 
		HelloService helloService = (HelloService) context.getBean("helloService"); 
		
		String rslt = "";
		System.out.println("invoking RMI with name ["+ "Tom" +"]");
		rslt = helloService.sayHello("Tom");
		System.out.println("    Result: ["+ rslt +"]");
		
		System.out.println("invoking RMI with name ["+ "Jane" +"]");
		rslt = helloService.sayHello("Jane");		
		System.out.println("    Result: ["+ rslt +"]");
		*/
	}
}
