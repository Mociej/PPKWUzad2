package ppkwuzad2.ppkwuzad2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class StringApiController {

    @GetMapping("analysestring/{inputstring}")
    public String stringAnalyse(@PathVariable String inputstring){
        return inputstring;
    }
}
