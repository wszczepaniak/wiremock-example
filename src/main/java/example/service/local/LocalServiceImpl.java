package example.service.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.service.remote.RemoteService;

/**
 * Created by Wiktor Szczepaniak on 20.03.2017.
 */
@Service
public class LocalServiceImpl implements LocalService {

  @Autowired
  private RemoteService remoteService;

  @Override
  public String getDataFromLocalService(String input) {
    return remoteService.getRemoteData(input);
  }
}
