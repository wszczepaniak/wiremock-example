package example.service.local;

import example.service.client.RemoteServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalServiceImpl implements LocalService {

    private final RemoteServiceClient remoteServiceClient;

    private static final String RESPONSE_TEMPLATE = "Input : %s, Message : %s";

    @Autowired
    public LocalServiceImpl(RemoteServiceClient remoteServiceClient) {
        this.remoteServiceClient = remoteServiceClient;
    }

    @Override
    public String processInputString(String input) {
        return String.format(RESPONSE_TEMPLATE, input, remoteServiceClient.getMessageFromRemoteService(input));
    }

}
