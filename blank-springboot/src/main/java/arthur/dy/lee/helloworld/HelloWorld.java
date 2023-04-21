package arthur.dy.lee.helloworld;//package arthur.dy.lee.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by arthur.dy.lee on 2018/4/1.
 */
@RestController
public class HelloWorld {

    @RequestMapping("/h")
    public String index2() {
        return "just hello word";
    }

}
