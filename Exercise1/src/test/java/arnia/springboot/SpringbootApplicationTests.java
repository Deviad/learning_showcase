package arnia.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@SpringBootTest
@SuiteClasses({HelloControllerTest.class})
public class SpringbootApplicationTests {
}