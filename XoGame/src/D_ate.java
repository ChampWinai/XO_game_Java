
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Champ
 */
public class D_ate {
    Date d =new Date();
    SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MMM/dd");
    
    String dd = sdf.format(d);
}
