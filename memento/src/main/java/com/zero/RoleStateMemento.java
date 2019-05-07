package com.zero;

import lombok.Data;

@Data
public class RoleStateMemento {
    private int HP;
    private int MP;
    public RoleStateMemento(Role role){
        this.HP=role.getHP();
        this.MP=role.getMP();
    }
}
