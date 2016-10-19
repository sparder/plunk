package com.sparder.plunk.serialization.hessian;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.sparder.plunk.serialization.Marshall;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by ruxing.bao on 2016/10/19.
 */
public class HessianMarshall implements Marshall{
    @Override
    public byte[] encode(Object obj) {
        if(obj == null) {
            throw new NullPointerException("");
        }
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream(  );
            HessianOutput ho = new HessianOutput(os);
            ho.writeObject(obj);
            return os.toByteArray();
        } catch (IOException e) {
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
            HessianInput hi = new HessianInput(new ByteArrayInputStream(bytes));
            Object obj = hi.readObject();
            hi.close();
            return obj;
        } catch (IOException e) {
            //throw plunk exception
            return null;
        }
    }
}
