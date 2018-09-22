package at.hochbichler.camel.controller;

import at.hochbichler.camel.service.CurrentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentTimeController {

    @Autowired
    CurrentTimeService currentTimeService;

    @RequestMapping(value = "/currentDateTime")
    public String getCurrentDateTime() {
        return currentTimeService.getCurrentDateTime();
    }
}
