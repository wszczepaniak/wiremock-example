package example.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.dto.RemoteResponseDto;

@RestController
public class RemoteController {

  @RequestMapping("/remote")
  public RemoteResponseDto greeting() {
    return RemoteResponseDto.builder().message("remote service implementation response").build();
  }
}
