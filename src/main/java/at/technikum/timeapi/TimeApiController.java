package at.technikum.timeapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TimeApiController {
    @GetMapping("today")
    public LocalDate date (){
        LocalDate d = LocalDate.now();
        return d;
    }
    @GetMapping("now")
    public String now(){
        LocalTime now = LocalTime.now();
        return now.toString();
    }

}
