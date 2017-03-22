package example.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RemoteResponseDto {
  private final String message;

  @JsonCreator
  public RemoteResponseDto(@JsonProperty(value = "message") String message) {
    this.message = message;
  }

}
