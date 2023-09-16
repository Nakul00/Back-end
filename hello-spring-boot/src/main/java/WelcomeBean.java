import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class WelcomeBean {
	
	private String message;
	
	public WelcomeBean(String message)
	{
		super();
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	@GetMapping("/welcome-with-parameter/name/{name}")
	public WelcomeBean welcomeWithParameter(@PathVariable String name)
	{
		return new WelcomeBean(String.format("Hello world, %s!",name));
	}

}
