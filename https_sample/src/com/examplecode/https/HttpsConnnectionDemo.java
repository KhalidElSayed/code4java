package com.examplecode.https;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpsConnnectionDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException   {
		// ����URL����
        URL myURL = new URL("https://gaefetchserver.appspot.com/");
 
        // ����HttpsURLConnection���󣬲�������SSLSocketFactory����
        HttpsURLConnection httpsConn = (HttpsURLConnection) myURL.openConnection();
        
//        httpsConn.geth
 
        // ȡ�ø����ӵ����������Զ�ȡ��Ӧ����
        InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream());
 
        // ��ȡ����������Ӧ���ݲ���ʾ
        int respInt = insr.read();
        while (respInt != -1) {
            System.out.print((char) respInt);
            respInt = insr.read();
        }

	}

}
