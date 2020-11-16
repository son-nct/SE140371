/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.util;

/**
 *
 * @author son
 */
public class SE140371_MathUtility {

    //fake class Math giống như thật
    //Math.sqrt().abs() .pow() .sin() .PI
    public static final double PI=3.1415; //xài MathUitility.PI
    
    //tính n!=1.2.3.4...n
    //quy ước trả về long 
    //21l tràn long rồi, âm giai thừa không tính được, vô nghĩa
    //bày này mình chỉ tính gt trong khoảng từ 0..20
    //nếu đưa n cà chớn < 0 > 20 thì thông báo , 
    //0!= 1!= =1
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            //illegalArgument hàm bắt lỗi ko đc nhập số âm
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if( n==0 || n==1) {
            return 1;
        }
        //CPU mà chạy đến lệnh này tức là 2 đã = từ 2 -> 20 ko xài else trừ điểm
        long result=1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            
        }
        return result;
        
    }
    //tu tin ham chay đúng như thiết kế
    //éo tin , phải test để kiểm chứng
    // có nhiều cách để test
    //kiểu gì cũng phải là: mình tính trước kết quả hàm cần trả về Expected value 
    //                      mình gọi hàm nó chạy ra máy, ACTUAL VALUE
    //so sánh coi EXPECTED VALUE == ACTUAL VALUE hay ko
    //                              CÓ BẰNG, HÀM CHẠY ĐÚNG CHO TÌNH HUỐNG X
    //                                   KO BẰNG, HÀM CHẠY SAI CHO TÌNH HUỐNG X
    /*vÍ DỤ :
    tao nghĩ rằng 4! phải là 120 (expected)
    giờ tao gọi hàm getFactotial(5 đưa vào), coi ra kết quả mấy(Actual)
    nếu actual giả sử là 120 luôn, may quá hàm đúng cho 5!, vì khớp kì vọng
    case ( tình huống) n=5 hàm đúng
                       n=6 hàm trả về 720 thì là hàm đúng
    làm ác case mà mình nghĩ là người dùng sẽ xài hàm như thế
    //tao gọi là các test cases
    //một hàm có nhiều test cases ứng với nhiều tình huống xài hàm đảm bào hàm đúng cho các cases thì mới release
    //bắt đầu thử nghiệm*/
   
    public static void main(String[] args) {
        //kĩ thuật test căn bản các test case để kết luần hàm đúng or sai
        long expected =120;
        long actual = SE140371_MathUtility.getFactorial(5);
        if(actual == expected){
            System.out.println("right");
        }else {
            System.out.println("wrong ");
        }
        System.out.println("6! ? expected: 720; actual: "+SE140371_MathUtility.getFactorial(6));
        System.out.println("0! ? expected: 1; actual: "+SE140371_MathUtility.getFactorial(0));
        //test thử khi nhập số âm vào thì có xuất hiện thông báo ko
        SE140371_MathUtility.getFactorial(-5);
        
        //nhược điêm của kĩ thuật nỳ:
        //cần phải dùng mắt để so sánh từng trường hợp xài hamfL so expected và actual
        //nếu test nhiều tình huống, mắt đủ mệt mỏi vì phải dò từng output
        
        //Cách nâng cao
        //gom các đám test cases này lại, chạy i lượt như ở trên
        //máy so giùm ta luôn expected và actual
        //sau đó
        //NẾu tất cả các test cases mà đều đúng thấy ra 1 màu xanh - đèn xanh - code ổn
        //nếu tất cả các cases đều đúng, ngoại trừ có 1,2 vài thằng nào đó
        //EXpected khác actual, thấy ra 1 màu đỏ, hàm ý, hàm sai rồi, hàm đúng gần hết, mà sai 1 vài, ko tin cậy
        //đôi chỉ có ít nhất 1 cặp expected actual, ko bằng nhay , kết luận hàm sai
        
        
        //thay vì nhìn từng case, ta sẽ nhìn chỉ mày xanh hoặc đỏ là đủ rồi
        // ta cần thêm bộ thư viện để giúp ta việc này
        //Bộ thư viện nó làm 2 việc: so sánh giùm actual vs expected
        //tùy khớp -> thấy ra mày xanh
        // ko khớp -> ta thấy ra màu đỏ
        //nó tự quét hết các case mà mình đã thiết kế để nó kết luận, mắt nhìn duy nhất 1 màu là đủ
        //Bộ thự viện này chính là những file ..JAR..,DLL DC ADD thêm vào project
        //bộ thư viện này mang cái tên chung cho mọi ngôn ngữ lập trình- Unit Test
        //riêng cho Java: JUNIT,TestNG
        //C#: NUnit
        //PHP: PHPUnit
        //,,,   ,,,
        //đưa code lên server
        
        
      //  -------------------------------------------Lưu ý git----------------------
        //code trong file nào phải nhớ nó nằm ở đâu
        //cần lưu ý chỉ cần push thư mục src trong server
        
        /*trước khi muốn push gì lên phải thông báo cho git 
        trước bằng 1 tập tin notepad*/
        
        //chỉ làm câu này khi push một new project lên
        //vào link https://www.toptal.com/developers/gitignore để lấy code push những thứ cần lên git
        //sau khi copy code vào note pad lưu vào nơi chứa code , all file lưu tên file
        //tenfile.gitignore
        //nen để data ở ổ đĩa D
        //nếu để ổ đĩa d khi vào cmd nhâp d:
        //nhấn cd cách ra nhấn chuột phải paste đường dẫn
        //cd là change direction
        //sau đó nhập git init
    }
}
