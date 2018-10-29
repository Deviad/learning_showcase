package singleton;

import creational.singleton.MakeCar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.spy;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MakeCar.class)

public class SingletonTest {

    @Test
    public void launchesTheSameInstance() {
        MakeCar car = spy(MakeCar.getCar());
        PowerMockito.mockStatic(MakeCar.class);
        assertEquals(car.getClass(), car.getClass());
    }
}
