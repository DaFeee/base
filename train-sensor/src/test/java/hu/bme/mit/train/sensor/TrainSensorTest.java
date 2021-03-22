package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;

import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl sensor;
    TrainController mockTC;
    TrainUser mockTU;

    @Before
    public void init() {
        mockTC = mock(TrainController.class);
        mockTU = mock(TrainUser.class);
        sensor = new TrainSensorImpl(mockTC, mockTU);
    }

    @Test
    public void TestOverride() {
        sensor.overrideSpeedLimit(10);
        Assert.assertEquals(10,sensor.getSpeedLimit());
    }

    @Test
    public void TestAlertMaxMargin(){
        sensor.overrideSpeedLimit(510);
        verify(mockTU, times(1)).setAlarmState(true);
        //Assert.assertEquals(true , mockTU.getAlarmState());
    }

    @Test
    public void TestAlertMinMargin(){
        sensor.overrideSpeedLimit(-1);
        verify(mockTU, times(1)).setAlarmState(true);
        //Assert.assertEquals(true , mockTU.getAlarmState());
    }

    @Test
    public void TestAlertBetweenMargin(){
        sensor.overrideSpeedLimit(100);
        verify(mockTU, times(1)).setAlarmState(false);
        //Assert.assertEquals(true , mockTU.getAlarmState());
    }

    @Test
    public void TestAlertRelativeMargin() {

        int value = (mockTC.getReferenceSpeed()/2) - 1;
        sensor.overrideSpeedLimit(value);
        verify(mockTU, times(1)).setAlarmState(true);
    }
}
