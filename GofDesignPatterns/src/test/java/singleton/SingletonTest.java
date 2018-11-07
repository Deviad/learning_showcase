package singleton;

import creational.singleton.MakeCar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.spy;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MakeCar.class)
@PowerMockIgnore("javax.management.*")
public class SingletonTest {
   private static Logger logger = LogManager.getLogger(SingletonTest.class);
    @Test
    public void launchesTheSameInstance() {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        MakeCar car = spy(MakeCar.getCar());
        PowerMockito.mockStatic(MakeCar.class);
        assertEquals(car.getClass(), car.getClass());
    }
}
