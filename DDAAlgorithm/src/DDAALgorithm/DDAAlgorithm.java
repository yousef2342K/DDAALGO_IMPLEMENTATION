/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DDAALgorithm;

/**
 *
 * @author JoEKhalid
 */



public class DDAAlgorithm {
    private int x1,y1,x2,y2;

    public DDAAlgorithm(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void Drawline(){
        int dx = x2-x1;
        int dy = y2-y1;
        int steps = Math.max(Math.abs((dx)), Math.abs(dy));
        float Xincrement = (float)dx / steps;
        float Yincrement = (float)dy / steps;
        float x = x1;
        float y = y1;
        System.out.println("Points on the line using DDA algorithm : ");
        
        for(int i = 0; i<=steps;i++){
            System.out.println("("+ Math.round(x) + "," + Math.round(y) + ")" );
            x+=Xincrement;
            y+=Yincrement;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        DDAAlgorithm line1 = new DDAAlgorithm(5,6,13,10);
        line1.Drawline();
    }
    
}
