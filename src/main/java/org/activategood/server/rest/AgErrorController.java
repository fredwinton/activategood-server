package org.activategood.server.rest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frwill on 7/30/2016.
 */
@RestController
public class AgErrorController implements ErrorController {
    private static final String PATH = "/error";

    @RequestMapping(value=PATH)
    public String error() {
        return "Error handling.";
    }



    @Override
    public String getErrorPath() {
        return PATH;
    }
}
