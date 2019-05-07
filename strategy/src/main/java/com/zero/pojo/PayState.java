package com.zero.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayState {
    //支付后的状态码
    private int code;
    //支付后的消息提示
    private String msg;
    //代表谁支付的
    private String  uid ;
    //支付的数据大小
    private Object data;
}
