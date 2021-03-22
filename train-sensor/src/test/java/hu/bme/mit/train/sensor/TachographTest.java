package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class TachographTest {

    Tachograph tacho;

    @Before
    public void before() {
        Date date = new Date(0);
        tacho.add(date,1,3);
    }

    @Test
    public void TestCase() {
        Table<Date,Integer,Integer> table=tacho.getTable();
        Assert.assertFalse(table.isEmpty());
    }
}