/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanva.mathutil.main;

import com.tuanva.mathutil.MathUnitlity;

/**
 *
 * @author Tuanva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muon test 5! co bang 120 hay ko?
        int n=5;//5! co bang may
        long expected =120;//tui huy vong huy vong ban/ ham tin ra 120
        long actual=MathUnitlity.getFactorial(n) ;
        
        System.out.println("5! expected"+expected+"; actual "+actual);
        
        n=0;//0! co bang may
        expected =1;//tui huy vong huy vong ban/ ham tin ra 1
        actual=MathUnitlity.getFactorial(n) ;
        
        System.out.println("0! expected"+expected+"; actual "+actual);
        //xet truong hop khac: ) :0! =??
    }
    
}


//Trong quy trinh lam phan mem dan dev phai co trach nhiem  tes tung ham
//tung classs ma min viet ra truoc khi dong goi gui cho ben QA/QC Test
//Doc lap/ tung ham tung clas phai duoc test can than truoc khi chung 
//duoc dung de phoi hop voi class khac. test ngay muc ham, muc class
//vua hoan thien, chua them ban vef UI, thi muc do test som nay goi laf 
//unit test level. test tung don the. don vi code


//vay nen lam sao den test tung ham, tung class???
//co nhieu cach de test tung ham tung class;
//cach 1: dung sout( goi ham can test()) de in ra gia tri xu ly cua ham
//dung cho oop

//cach2: dungf JOptionPane cua mon Java Destop de pop-up mot cua so
//in ket qua xu ly cua ham de kiem tra  coi ham chay dung hay sai

//cach3: Dung Log FILE, trang Web in ra kett qua xy ly cua ham(mon JAVA WEB)

//du la cach nao thi ta can phai in ra gia tri ham da xy li
//goi la ACTUAL VALUE
//roi ta di so sanh cua gia tri tra ve cua ham co giong ta tin toan
//truoc do hay khong, cai ta hy vong ham se tra ve,- goi la EXPECTED VALUED
//neu ACTUAL VALUE== Expected value -- >ham chay ngon
//                   khac           --> ham sai
//nguyen tac de test= so sanh  ACTUAL VALUE---EXPECTED VALUED
//3 cach nay de cung 1 nguyen tac:
//goi ham de xem ham xu ly ra ket qua may
//sau do dung mat de so sanh actual va expected roi ta tu ket luan
//cach nay tiem an sai sot khi ta phiaxem xet  qua nhieu cap value
//vi du: ham GTHUA() phai test truonh hop n<0;=1;18;19
//20(Bien)
//21, 30 ,1 trieu

//moi n de test ta goi la tinh huong xai ham, 1 tinh huong test
//test case


//cach 4: ko them nin bang mat tung truong hop expected va actual
//nho may nhin giup: vi may giu suc biet cach so sanh
//may ques qua tat ca cac cap expected va  actual
//neu tat aca deu khop bao tao mau xanh -duong thonh code tot
// neu xuat hien it nhat 1 thang kho khop actual hay expected
//bao tao mua do, duong ket, do code ca truc trac tinh toan
//mun la dc dieu nay ta can thu vien phu tro
//java:jnuit,testNG
//c #  : nUnit, MS Test, xUnit
//php  : phpUnit
//.. moi ngon ngu deu co thu vien Xanh Do  giup hma nay canh bao tot hon
