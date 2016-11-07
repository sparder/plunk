package com.sparder.plunk.serialization.json;

import com.sparder.plunk.serialization.Marshall;
import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.io.IOException;


/**
 * Created by wsun3 on 10/19/2016.
 */
public class JsonMarshall<T> implements Marshall {
    @Override
    public byte[] encode(Object obj) {
        if(obj == null) {
            throw new NullPointerException("");
        }
        try {
            String jsonString = JSON.toJSONString(obj);
            return jsonString.getBytes("UTF-8");
        }catch (UnsupportedEncodingException e) {
            return null;
        }
        catch (IOException e) {
            //throw plunk exception
            return null;
        }
    }



    @Override
    public Object decode(byte[] bytes) {
        if(bytes == null) {
            throw new NullPointerException("");
        }
        try {
            String jsonString = new String(bytes, "UTF-8");
            Class<T> obj = null;
            obj = JSON.parseObject(jsonString, new Class<?>[] {obj});
            return obj;
        }catch (UnsupportedEncodingException e) {
            return null;
        } catch (IOException e) {
            //throw plunk exception
            return null;
        }
    }
}
