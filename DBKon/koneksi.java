/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBKon;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class koneksi {
    public Connection con;
    public koneksi(){
        String id, pass, driver, url;
        id="root";
        pass="";
        driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/game_tubes?Timezone=true&serverTimezone=UTC";
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url, id, pass);
            if(con==null){
                System.out.println("Koneksi Gagal");
            }else{
                System.out.println("Koneksi BERHASIL");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String []args){
    koneksi k = new koneksi();
    }
}
