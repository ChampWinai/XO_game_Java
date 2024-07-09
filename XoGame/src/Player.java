
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Player {
    public String startGame ="X";
    public int xCount = 0 ; //เก็บค่าที่โชว์
    public  int oCount = 0 ;
    public int rCount = 0 ;
    
    
    public int getxCount()
         {
        return xCount;
         }
    
     public int Xwin() 
    {
            return xCount++;
        }
     
     public int getoCount()
     {
         return oCount;
     }
     
     public int Owin()
     {
         return oCount++;
     }
     
     public int roundPlay()
     {
             return rCount++;
     }
     
     public int getRoundPlay()
     {
         return rCount;
     }
}
        




