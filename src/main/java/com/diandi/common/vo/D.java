package com.diandi.common.vo;

import com.diandi.common.result.ResultCode;
import lombok.Data;

/**
 * @program: diandi
 * @description: 用于数据传输，状态验证
 * @author: You毒
 * @create: 2019-12-14 17:20
 **/
@Data
public class D {
    private int code; // 结果码
    private String msg; //提示
    private Object data; // 携带数据


    public static D setD(int code,String msg,Object data) {
        D d = new D();
        d.setCode(code);
        d.setData(data);
        d.setMsg(msg);
        return d;
    }

    public static D OK(Object data) {
        return setD(ResultCode.OK.getVal(),"OK",data);
    }

    public static D OK() {
        return setD(ResultCode.OK.getVal(),"OK",null);
    }

    public static D fail() {
        return setD(ResultCode.ERROR.getVal(),"Error",null);
    }

    public static D fail(String msg) {
        return setD(ResultCode.ERROR.getVal(),msg,null);
    }
    
}
