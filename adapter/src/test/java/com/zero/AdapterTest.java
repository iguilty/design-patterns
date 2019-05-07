package com.zero;



import com.zero.adapter.USBAdapterTF;

import com.zero.destination.TFCardA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterTest {
    @Test
    public void adpaterTest(){
        USBAdapterTF usbAdapterTF=new USBAdapterTF(new TFCardA());
        String read = usbAdapterTF.readUSB();
        System.out.println(read);
        usbAdapterTF.wirteUSB("这是数据");
    }
}
