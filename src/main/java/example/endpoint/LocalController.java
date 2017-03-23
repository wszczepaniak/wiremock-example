package example.endpoint;

import example.service.local.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {

    @Autowired
    private LocalService localService;

    @RequestMapping("/localService")
    public String greeting() {

        return localService.processInputString("request from client endpoint");
    }
}
