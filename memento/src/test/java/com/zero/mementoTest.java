package com.zero;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class mementoTest {
    @Test
    public void testMemento() {
        //创建管理者
        Caretaker caretaker=new Caretaker();


        Role role=new Role(100,100);
        role.battle();
        RoleStateMemento memento = role.save();
        System.out.println("第一次战斗后角色的状态"+role);
        //保存第一次战斗后的状态
        caretaker.add(memento);
        role.battle();
        System.out.println("第二次战斗后角色的状态"+role);
        //开始恢复
        RoleStateMemento re = caretaker.getByIndex(0);
        role.recover(re);
        System.out.println("恢复后的状态"+role);


    }
}

