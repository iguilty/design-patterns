package com.zero;

import com.zero.state.State;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Context {
    private State state;
    public void handle(){
        state.handle();
    }
}
