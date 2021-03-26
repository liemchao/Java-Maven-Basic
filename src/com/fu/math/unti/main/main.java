/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.math.unti.main;

/**
 *
 * @author ThanhLiemPro
 */

    public class main {
 
//   public  static long  getFactorial(int n){
//            if( n<0 || n>20)
//                      throw new IllegalArgumentException("Invalid argurment "+"n must be between 0..20");
//            if(n==0||n==1)
//                           return 1;
//            long result = 1;
//            for(int i=2; i<=n; i++){
//                
//                result*=i;
//             
//         }
//                    
//        return result;
//   }
        // Viết code xong là phải test code
        //Viết code là phải dùng hàm main để chạy 
        //Test từng Hàm từng class trước khi ráp chúng chung với các class khác
        //Test ngay khi hàm ,xong class 
        //được gọi là mức đơn vị , mức Unit Test teest mức đơn vị
        // Làm sao để test có nhiều cách
        // 1 Cách 1: sout (gọi hàm ()) để in ra kết quả xử lí của hàm.
        //2. Cách 2 JoptionPane  để popup lên kết quả xử lý của hàm (J desktop)
        //3.Cách 3 ghi log file, trang web(JW)
        //3. cách này phải dùng mắt để xem kết quả và tự kết luận đúng sai
        // Đúng: tức là hàm chạy ra 1 giá trị-ACTUAL VALUE
        //                                                            và ta cảm thấy ACTUAL VAUE khớp, bằng với giá trị ta mong đợi
        // ta tính trước bằng tay,gọi là EXPECTED VALUE
        //ví dụ 5! thì ta hi vọng expected hàm trả về 120
        //nhưng khốn nạn thay hàm trả về đúng 120-actual
        // hàm chạy đúng cho 5!
        //*sai: tui test 6!, expected=720,khốn nan thay, chạy ra actual=20,
        public  static long  getFactorial(int n){
            if( n<0 || n>20)
                      throw new IllegalArgumentException("Invalid argurment "+"n must be between 0..20");
            if(n==0||n==1)
                           return 1;
            
          
          return n*getFactorial(n-1);
   }
    }
     
