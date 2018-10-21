package arnia.springboot;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.core.env.AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME;
import static org.springframework.core.env.AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME;

@RunWith(Suite.class)
@Suite.SuiteClasses({PersonRepositoryTest.class})
@SpringBootTest

public class SpringbootApplicationTests {
//	@BeforeClass
//	public static void setupTest() {
//		System.setProperty(DEFAULT_PROFILES_PROPERTY_NAME, "test");
//		System.setProperty(ACTIVE_PROFILES_PROPERTY_NAME, "test");
//	}
	@Test
	public void contextLoads() {
	}

}
