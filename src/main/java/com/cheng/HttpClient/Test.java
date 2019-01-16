package com.cheng.HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;

//https://blog.csdn.net/a1610770854/article/details/52064625
/**
 * Created by cheng on 2018/4/24.
 */
public class Test {
    public static void main(String[] args) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://www.baidu.com");
        System.out.println("executing request..." + get.getRequestLine());
        CloseableHttpResponse response = null;
        try {
            response = client.execute(get);
            try {
                System.out.println("-------------------");
                //打印返回状态
                System.out.println(response.getStatusLine());

                //实体
                HttpEntity httpEntity = response.getEntity();

                if (httpEntity != null) {
                    InputStream inputStream = httpEntity.getContent();

                    try {
                        inputStream.read();
                    } catch (IOException ex) {
                        throw ex;
                    } finally {
                        inputStream.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                 client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
