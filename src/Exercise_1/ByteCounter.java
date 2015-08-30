/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author bo
 */
public class ByteCounter implements Runnable {
    
    private int sum = 0;
    private String url;
    
    @Override
    public void run() {
        
        byte[] bytes = getBytesFromUrl(url);
        
//        for (int i = 0; i < bytes.length; i++) {
            
            sum += bytes.length;
        
        
    } // End of run

    public int getImgSize() {
        return sum;
    }
    
    public void setUrl(String url) {
        
        this.url = url;
    }
    
    private byte[] getBytesFromUrl(String url) {
        ByteArrayOutputStream bis = new ByteArrayOutputStream();

        try {
            InputStream is = new URL(url).openStream();
            byte[] bytebuff = new byte[4096];
            int read;
            while ((read = is.read(bytebuff)) > 0) {
                bis.write(bytebuff, 0, read);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return bis.toByteArray();
    }

    

} // End of class
