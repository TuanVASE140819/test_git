/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanva.mathutil.test;

import com.tuanva.mathutil.MathUnitlity;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TuanVA
 */
public class MathUtilityTest {
    // dat ten theo chuan dan test phan me, QA/QC
    @Test //bien ham nay thanh main().shift 6
    public void testFactorialGiivenRghtArgumentReturnGoodResult(){
        int n=5;
        long expected =120;
        long actual = MathUnitlity.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals((720), MathUnitlity.getFactorial(6));//6! CÓ BẰNG 720?
        assertEquals((24), MathUnitlity.getFactorial(4));
        assertEquals((6), MathUnitlity.getFactorial(3));
        assertEquals((2), MathUnitlity.getFactorial(2));
//        assertEquals((1), MathUnitlity.getFactorial(1));
//        assertEquals((1), MathUnitlity.getFactorial(0));
        //màu đỏ đúng theo 2 nghĩa :
        //hàm tính đúng kì vọng sai.
        //hàm tính sai.kì vọng đúng.
        //mõi lời gọi hàm ở trên được gọi là 1 Test case:
        //mỗi tình huongs test hàm , với 1 đầu vào, và nhận đầu ra
        //
    }
    
    //test ngoại lệ thì test thế nào??
    //vì khi ngoại lệ xảy ra,app dùng liền, màu đỏ , vì có điều
    //không ổn đã diễn ra
    //thêm nữa ngoại lệ không phải là một value đển so sánh m không biết nó
    //là số mấy
    //ngoại lệ chỉ có thể ước lượng nó,chạm nó khi nó xảy ra
    //test ngoại lệ nên được đọc diễ giải như sau:
    //tui đưa vào cấc tính huống dữ liệu cà chớn , ví dụ -5
    //ví dụ 22,40
    //tui muốn xem ngoại lệ có xảy ra trong tình huống này hay ko nếu cso  xảy ra
    // thì mừng lắm luông, vì app  chạy
    //đúng như thiết kê
    // tức là nếu GetFactorial(-5) mà nên ra ngoai lệ
    //illegalArgumentException, có nghĩa là hàm đúng 
    //có nghũa là màu xanh( đừng bối rối khi có Exceotion mà lại xanh)
    //xanh  vì thiết kế nói rằng tình huống -5 phải có ngoại hệ
    //và nếu ngoại lệ xuất hiện, thì đúng hàm
    
@Test(expected =IllegalArgumentException.class)
public void testFactorialGivenWrongArgmentThowsException(){
   //MathUnitlity.getFactorial(-5);//chạy hàm ,chưa test
   //MathUnitlity.getFactorial(21);//biết thừa hàm nén ra EX
   MathUnitlity.getFactorial(-1);// ta phải  chụp lại cái EX
   MathUnitlity.getFactorial(4);// nếu có thật, hàm đúng, Xanh
}

    
}   
// Việc tét dùng màu sắc. dùng thư viện test có quy ước
// nếu tất cả các các cặp ex và ac khớp nhau (equals)
// thì ci như hàm chạy đúng  mọi tình huống ta đã test --> xanh
//ko khớp nhau-- ít nhất một màu đõ coi như hàm không tồn tại-->đỏ chung
// điều này đảm bảo rằng , phần hàm đã test tất cả các tinhg huống
//nói cacash khác , những gì ta chủ động liệt kê.
//thì ta phải thấy đúng
