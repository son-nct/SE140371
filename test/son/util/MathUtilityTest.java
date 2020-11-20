/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.util;

//lấy tất cả các hàm từ SE140371
import java.sql.SQLException;
import static son.util.SE140371_MathUtility.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    //class này là class xài bộ thư viện JUnit dùng để test code
    //theo dạng xanh- đỏ, thay vid nhìn bằng mắt như bên main() sout()
    //2 file.jar đã đc add vào project này, và ta thoải mái xài các hàm của nó
    //trong các hàm của thư viện này có n hàm đặc biệt đều có
    //tên xuất phát là assertX(expected và actual đưa vào)
    //nếu nó thấy expected ko có bằng actual, nó thấy màu đỏ
    //                           bằng                     xanh
    //quy tắc xanh đỏ: nếu tất cẩ xanh --> Kết luận xanh
    //                 nếu có ít nhất 1 đỏ, éo quan tâm còn lại
    //                 -> kết luận đỉ
    //Đảm bảo hàm chạy đúng vs mọi case, trường hợp
    @Test // là biến hàm ngay sau đây thành public static void main()
    //muốn chạy thì nhấn shift + f6
    //quy tắc đặt tên hàm của nghê test (Tester, QC)
    //assert: đo cho t xem có bằng nhau ko
    public void getFactorial_RunsWell_IfValidArgument() {

      //  assertEquals(720, SE140371_MathUtility.getFactorial(6));
        
        //sau khi import 
        //chỉ cần gọi hàm ra luôn ko cần phải gọi tên class.tenham()
        //import static son.util.SE140371_MathUtility.*;
        //chỉ cần 1 hàm báo đỏ => hàm ko ổn định
        assertEquals(720, getFactorial(6));
        assertEquals(120,getFactorial(5));
        
    }

    //phải expected = illegalArgumentException
    @Test(expected = IllegalArgumentException.class) //sau dấu bằng sử dụng cú pháp lamđa
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        //ngoại lạ ko phải là value để assert
        //chỉ có thẻ chụp nó lại
        //nó vẫn hiển thị màu xanh
        //nếu dùng lệnh khác expected = SQLException sẽ hiện màu đỏ vì expected sai
        getFactorial(-5);
    }

    public MathUtilityTest() {
    }

    //sau khi làm xong thì nhấn dist và build
    //nhưng hiên tại kết quả hàm màu đỏ hay xanh đều đc clean and build
    //bây giờ sẽ set lại chỉ khi nào màu xanh thì mới đc clean and build
}
