package decorator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import structural.decorator.Car;
import structural.decorator.CarDecorator;
import structural.decorator.SportsCar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
@RunWith(BlockJUnit4ClassRunner.class)
public class DecoRatorTest {
    CarDecorator c = null;
    @Mock
    Car car;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        c = new CarDecorator(car);
    }

    @Test
    public void testTurnOn() {
        when(car.turnOn()).thenReturn("Vroom, ");
        assertEquals("Vroom, ", c.turnOn());
        verify(car).turnOn();
    }
}
