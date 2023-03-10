/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package resolucaotela;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author Junior
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        
        Toolkit res = Toolkit.getDefaultToolkit();
        Dimension res1 = res.getScreenSize();
        
        System.out.println("A resolução da tela é " + res1.width +" X "+ res1.height);
    }
}
