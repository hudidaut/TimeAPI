package at.technikum.timeapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;


@RestController
public class TimeApiController {
    @RequestMapping("/today")
    public LocalDate date (){
        LocalDate d = LocalDate.now();
        return d;
    }
}
