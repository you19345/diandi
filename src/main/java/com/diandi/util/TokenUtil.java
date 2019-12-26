package com.diandi.util;

import com.alibaba.fastjson.JSON;
import com.diandi.dto.TokenDto;
import com.diandi.exception.UserException;

/**
 * @program: EatJoke
 * @description:
 * @author: You毒
 * @create: 2019-12-25 19:38
 */
public class TokenUtil {
    //生成令牌

    /**
     * 生成令牌
     * @param uid
     * @param phone
     * @return
     */
    public static String createToken(int uid,String phone){
        TokenDto dto=new TokenDto();
        dto.setPhone(phone);
        dto.setUid(uid);
        return JwtUtil.createJWT(JSON.toJSONString(dto));
    }


    //解析令牌

    /**
     * 解析令牌
     * @param token
     * @return
     * @throws UserException
     */
    public static TokenDto parseToken(String token) throws UserException{
        String str=JwtUtil.parseJWT(token);
        if(str!=null && str.length()>0) {
            try{
                return JSON.parseObject(str, TokenDto.class);
            }catch (Exception e){
                throw new UserException("令牌不合法");
            }
        }else {
            throw new UserException("令牌为空");
        }
    }
}
