package state;

import behavioral.state.Off;
import behavioral.state.On;
import behavioral.state.RemoteControl;
import behavioral.state.TV;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import javax.annotation.PostConstruct;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StateTest {

    private RemoteControl state = null;


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Spy
    private Off initialState = spy(new Off());

    @Spy
    private TV tv = spy(new TV(initialState));

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void OnPressSwichReturnsOffWhenExecuted() {
        On on = new On();
        on.pressSwitch(tv);
        assertEquals("I am On. I am turning Off", outContent.toString().trim());
        assertThat(tv.getState(), is(instanceOf(Off.class)));
        verify(tv).setState(tv.getState());
    }
    @Test
    public void OffPressSwichReturnsOnWhenExecuted() {
        Off off = new Off();
        off.pressSwitch(tv);
        assertEquals("I am Off. I am turning On", outContent.toString().trim());
        assertThat(tv.getState(), is(instanceOf(On.class)));
        verify(tv).setState(tv.getState());
    }
}
