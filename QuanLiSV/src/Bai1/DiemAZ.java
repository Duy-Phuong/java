/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Comparator;

/**
 *
 * @author admin1
 */
public class DiemAZ implements Comparator<HocSinh>{

    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if (o1.getScore() < o2.getScore()) {
            return -1;
        }else if(o1.getScore() > o2.getScore()){
            return 1;
        }else{
            return 0;
        }
        
    }
    
}
