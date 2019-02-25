package basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroservicesBasicsSpringcloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBasicsSpringcloudConfigServerApplication.class, args);
	}

}
