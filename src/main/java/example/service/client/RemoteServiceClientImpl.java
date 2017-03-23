package example.service.client;

import example.dto.RemoteServiceResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RemoteServiceClientImpl implements RemoteServiceClient {

  @Value(value = "${remote.service.url}")
  private String remoteServiceUrl;

  private final RestTemplate restTemplate;

  @Autowired
  public RemoteServiceClientImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public String getMessageFromRemoteService(String input) {
    ResponseEntity<RemoteServiceResponseDto> response = restTemplate.getForEntity(remoteServiceUrl, RemoteServiceResponseDto.class);
    return response.getBody().getMessage();
  }
}
