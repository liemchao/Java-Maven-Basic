package com.fu.matutil.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */                                                              //trong bài này gõ trực tiếp luôn không cần class chấm
                                                                 //chỉ dùng vs static
import static org.junit.Assert.*;
import org.junit.Test;
import com.fu.math.unti.main.main;
import static com.fu.math.unti.main.main.getFactorial;
import java.sql.SQLException;

/**
 *
 * @author ThanhLiemPro
 */
public class MathTest {
    @Test
    
   public  void MathTest() {
         int n = 5 ;
        long expected=120;
        long actual =main.getFactorial(n);
     assertEquals(expected,actual);
      // mình test tiếp các trường hợp khác đúng đầu vào, đúng đầu vào 
      // khỏi cần bàn ,chơi luôn trong lệnh
        assertEquals(720,main.getFactorial(6));
        assertEquals(24,main.getFactorial(4));
        assertEquals(6,main.getFactorial(3));
        assertEquals(1,main.getFactorial(1));
        assertEquals(1,main.getFactorial(0));
        // khi test các biến test vào các tham số cà chớn, âm , hoặc lớn hơn >20
        //Theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ
        //và ta CẦN TEST XEM, NGOẠI LỆ CÓ ĐƯỢC NEM RA KHO NẾU TA CÀ CHỚN
        //TỨC LÀ THẤY XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO_>HÀM ĐÚNG
        //THẤY NGOẠI LỆ MÀ MÌNH CÀ CHỚN THÌ HÀM ĐÃ CHẠY ĐÚNG.
       
}
   @Test(expected = IllegalArgumentException.class)// có dđúng là khi chạy hàm này thì ném ra ngoại lệ tên là Illea.....
   // nếu nó ném đúng ra thì chạy ra tên, code đúng rồi 
    public void MathTestWrong(){
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
        //ngoại lệ không phải là value để so sánh, không dùng assreetEquals()
        //ta phải dùng chiêu khác.Junt 4 khác Junit 5 ở chỗ bắt ngoại lệ
        //Kì 5 đi dự thình môn SWT301 của tui:DI,Lamda Expresssion liên quan Dependency Injection/ SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
            
        }
}
