package com.zero;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateTest {
    @Test

    public void testTemplate()  {
        AbsCreateApp app1=new MyApp();
        app1.execute();
        AbsCreateApp app2=new CompanyApp();
        app2.execute();
    }
}
