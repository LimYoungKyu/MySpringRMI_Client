package kojh.rmi.client;

import kojh.rmi.interfaces.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RmiClient
{	
	// static 이어야만 동작함??
	//@Autowired //NOK
	private static HelloService helloServiceOfClient;
		
	// Autowired 사용으로 생략
	@Autowired //OK
	public void setHelloServiceOfClient(HelloService helloService)
	{
		System.out.println("RmiClient::setHelloService 호출");
				
		helloServiceOfClient = helloService;		
	}
	
	public void invokeRmi(String name)
	{
		System.out.println("invoking RMI with name ["+ name +"]");
		if( null == helloServiceOfClient )
		{
			System.out.println("helloServiceOfClient is Null"); //null??			
		}
		
		String rslt = helloServiceOfClient.sayHello(name); 
		
		System.out.println("----> Result: ["+ rslt +"]");
	}

}
