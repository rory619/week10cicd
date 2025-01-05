package ie.atu.week10cicd;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping
    public String makePayment(Person person)
    {

        return "You called Microservice 2 - Got person: " + person.getName();
    }
}