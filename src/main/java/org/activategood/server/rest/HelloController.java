package org.activategood.server.rest;

import org.activategood.server.midtier.model.hello.HelloBusiness;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by frwill on 7/30/2016.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody HelloBusiness sayHello(@RequestParam(value="name", required = false, defaultValue = "ActivateGood member.") String name) {
        return new HelloBusiness(counter.incrementAndGet(), String.format(template, name));
    }
}
