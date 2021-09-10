
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "You found root! Good!";
    }

    @RequestMapping("/loader")
    String loader(@RequestParam("mem") int memory) {
        byte[] array = new byte[memory * 1024 * 1024];
        //Thread.sleep(dur * 1000);

        return "Loaded server with ["+ memory +"MB] ";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}