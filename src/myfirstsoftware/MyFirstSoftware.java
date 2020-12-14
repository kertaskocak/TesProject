/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstsoftware;

/**
 *
 * @author ASUS
 */
public class MyFirstSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginView login = new LoginView(); //memanggil frame loginview
        login.setLocationRelativeTo(null); //set lokasi di tengah
        login.setVisible(true); //menampilkan loginview
    }
    
}
