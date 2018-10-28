package decorator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import structural.decorator.Car;
import structural.decorator.CarDecorator;
import structural.decorator.SportsCar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class SportsCarTest {
    SportsCar sc = null;
    @Mock
    Car c = new Car();

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();


    @Before
    public void setUp() {
        sc = Mockito.spy(new SportsCar(c));
    }

    @Test
    public void SportsCarTurnOn() {
        Mockito.doReturn("Vroom, it goes fast").when((CarDecorator)sc).turnOn();
        assertEquals("Vroom, it goes fast", sc.turnOn());
        verify(sc).turnOn();
    }
}
