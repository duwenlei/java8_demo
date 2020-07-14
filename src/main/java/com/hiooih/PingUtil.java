package com.hiooih;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author duwenlei
 **/
public class PingUtil {


    public boolean ping(String host) {
        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec("ping " + host);
            InputStream in = process.getInputStream();
            InputStreamReader reader = new InputStreamReader(in, "GBK");
            BufferedReader bufferedReader = new BufferedReader(reader);

            StringBuffer sb = new StringBuffer();
            String temp = null;

            while ((temp = bufferedReader.readLine()) != null) {
                sb.append(temp);
                sb.append("/n");
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static void main(String[] args) {
        PingUtil pingUtil = new PingUtil();
        pingUtil.ping("baidu.com");
    }
}
