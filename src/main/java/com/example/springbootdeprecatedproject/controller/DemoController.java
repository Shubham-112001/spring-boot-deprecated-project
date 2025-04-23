import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/deprecated")
    @ResponseBody
    public String deprecatedEndpoint() {
        // This method demonstrates the use of deprecated features
        return "This endpoint uses deprecated features.";
    }

    @GetMapping("/commons")
    @ResponseBody
    public String commonsExample() {
        // Example of using deprecated Apache Commons features
        String result = StringUtils.capitalize("example");
        StringUtils.replaceAll(result, ".", "_");
        return "Using deprecated Apache Commons: " + result;
    }
}