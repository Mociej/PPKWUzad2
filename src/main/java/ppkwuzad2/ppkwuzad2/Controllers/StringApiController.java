package ppkwuzad2.ppkwuzad2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringApiController {

    @GetMapping("analysestring/{inputstring}")
    public String stringAnalyse(@PathVariable String inputstring) {
        String result = "String length : " + inputstring.length() + "<br/>";
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < inputstring.length(); i++) {
            if (Character.isUpperCase(inputstring.charAt(i)))
                upperCase++;
            if (Character.isLowerCase(inputstring.charAt(i)))
                lowerCase++;
        }
        result += "upperCase  : " + upperCase + "<br/>";
        result += "lowerCase  : " + lowerCase + "<br/>";
        return result;
    }
}
