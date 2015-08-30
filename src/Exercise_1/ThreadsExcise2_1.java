/*9
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_1;

/**
 
 * @author bo
 */
public class ThreadsExcise2_1 {

    private static final String url1 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png";
    private static final String url2 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png"; 
    private static final String url3 = "https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png";
            
            
    public static void main(String[] args) {
        
        ByteCounter bc = new ByteCounter();
        
        bc.setUrl(url2);
       
        
        
        bc.run();
        System.out.println(bc.getImgSize());
      
        
    }
    
}