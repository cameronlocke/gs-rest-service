package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    Logger LOG = LoggerFactory.getLogger(NotificationController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/rest/v1/profile/notification")
    public String notification(@RequestBody String body) {
        LOG.info(body);
//        System.out.println(body);
        return "{\"timestamp\":"+(new Date()).getTime()+",\"messageId\":null,\"correlationId\":null,\"status\":\"OK\",\"message\":null,\"request\":null,\"data\":null}";
    }

    @RequestMapping("/servername")
    public String keepAlive(@RequestParam(value="name", defaultValue="World") String name) throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }
}
