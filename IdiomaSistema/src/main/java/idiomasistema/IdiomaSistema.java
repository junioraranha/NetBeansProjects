/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Junior
 */
public class IdiomaSistema {

    public static void main(String[] args) {
     
        Locale idioma = Locale.getDefault();
        
        System.out.println("O idioma do seu SO é: " + idioma.getDisplayLanguage());
        
    }
}
