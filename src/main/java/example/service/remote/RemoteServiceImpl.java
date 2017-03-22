package example.service.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import example.dto.RemoteResponseDto;

/**
 * Created by Wiktor Szczepaniak on 20.03.2017.
 */
@Service
public class RemoteServiceImpl implements RemoteService {

  private final RestTemplate restTemplate;

  @Value("${remote.service.url}")
  private String remoteServiceUrl;

  @Autowired
  public RemoteServiceImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public String getRemoteData(String input) {
    ResponseEntity<RemoteResponseDto> response = restTemplate.getForEntity(remoteServiceUrl, RemoteResponseDto.class);
    return input + " " + response.getBody().getMessage();
  }
}
