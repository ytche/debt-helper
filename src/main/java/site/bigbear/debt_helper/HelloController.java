package site.bigbear.debt_helper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cheyantao
 * @date 2019-07-29
 */
@Controller
@RequestMapping("/api/v1/hello")
public class HelloController {

    @ResponseBody
    @GetMapping
    public String hello(){
        return "hello";
    }
}
