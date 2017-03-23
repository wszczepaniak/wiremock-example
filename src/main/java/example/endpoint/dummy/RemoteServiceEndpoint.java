package example.endpoint.dummy;

import example.dto.RemoteServiceResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller imitates remote service action.
 * <p>
 * Placed in this application for demo purposes only.
 */
@RestController
public class RemoteServiceEndpoint {

    @RequestMapping("/remote")
    public RemoteServiceResponseDto returnBasicResponse() {
        return RemoteServiceResponseDto.builder().message("not mocked remote service response").build();
    }
}
