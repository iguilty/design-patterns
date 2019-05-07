package com.zero;

import com.zero.command.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class White {
    private Command command;

    /**
     * 设置具体的命令
     * @param command
     */


    /**
     * 执行命令
     */
    public void doCommand() {
        command.execute();
    }

}
