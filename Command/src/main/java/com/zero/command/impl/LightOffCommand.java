package com.zero.command.impl;

import com.zero.Light;
import com.zero.command.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LightOffCommand implements Command {
    private Light light;

    /**
     * 创建关灯命令的时候，传入具体的灯对象，由灯对象操作自己
     * @param light
     */


    @Override
    /**
     * 具体的灯对象调用自己的关灯方法
     */
    public void execute() {
        light.lightOff();
    }

}
