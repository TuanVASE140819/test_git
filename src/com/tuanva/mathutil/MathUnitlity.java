/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanva.mathutil;

/**
 *
 * @author TuanVA
 */
public class MathUnitlity {
    // ta se tao cac ham trong class nay  fake y chang class math cua JDK
    // cac ham se xai chung o nhieu no, lam tien ich dung chung
    // pham cai gi dung chung tho ta suy nghi den static
    public  static final double  PI = 3.1415;// Y chang Math.PI
                                             // lat hoi MathUtility.PI
    //ham tinh n!= 1.2.3.4.5.6..n
    //quy uoc 0!=1!=2!
    // ko co giai thua am
    // vi giai thua tang cuc nhanh ve gia tri: 21 g kieu lonh
    //ta khong chue n dau vao cac ham tu: 0..20
    //kieu long 10^18, 18 con so 0 toi da:
    
    public  static long getFactorial(int n){
        if (n<0 || n>20) 
            throw new IllegalArgumentException("Invalid argument."
                                              + " n must be between 0.. 20");
            if (n==0 || n==1) 
                return 0; //0! =1! =1 tin luon cho nhanh
            //den doan nay sure n tu 2..20
            long result =0;
            for (int i = 2; i <=n; i++) {
            result =result*i;
        }
        return result; 
    }
    
}
