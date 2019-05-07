package com.zero;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Role {
    private int HP;
    private int MP;
    public Role(int HP,int MP){
        this.HP=HP;
        this.MP=MP;
    }
    public void battle(){
        HP = HP - (int)(Math.random()*10);
        MP=MP-(int)(Math.random()*10);
    }
    //存储状态
    public RoleStateMemento save(){
        System.out.println("存储成功");
        return new RoleStateMemento(this);
    }

    //恢复状态
    public void recover(RoleStateMemento roleStateMemento){
        this.HP=roleStateMemento.getHP();
        this.MP=roleStateMemento.getMP();
        System.out.println("恢复成功");
    }


}
