package com.zero;



import com.zero.Computer.Computer;
import com.zero.Computer.Desktop;
import com.zero.Computer.Laptop;
import com.zero.brand.impl.Dell;
import com.zero.brand.impl.Lenovo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BridgeTest {
    @Test
    public void bridgeTest(){
        Computer c1=new Desktop(new Dell());
        c1.sale();
        Computer C2=new Laptop(new Lenovo());
        C2.sale();
    }



}
