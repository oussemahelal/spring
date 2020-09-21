package groupe.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerHello 
{
@RequestMapping("/")
public String hello() 
{
return "Hello Word";
}
}
