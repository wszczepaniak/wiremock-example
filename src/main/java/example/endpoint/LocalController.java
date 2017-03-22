package example.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.service.local.LocalService;

@RestController
public class LocalController {

  @Autowired
  private LocalService localService;

  @RequestMapping("/local")
  public String greeting() {
    return localService.getDataFromLocalService("request from local endpoint");
  }
}
