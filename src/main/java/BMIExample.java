import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIExample {

    public void returnBMI(){
        float cannang;
        float chieucao;
        float bmi;
        System.out.println("Nhập vào cân nặng:");
        Scanner sn= new Scanner(System.in);
        cannang=sn.nextFloat();
        System.out.println("Nhập vào chiều cao:");
        chieucao=sn.nextFloat();
        bmi= (cannang)/(chieucao*chieucao);
        System.out.println("In ra chỉ số BMI="+bmi);
        try{
            //Phân loại chỉ số BMI
            if (bmi<18.5){
                System.out.println("Bạn là người gầy");
            }else if (bmi<= 24.9){
                System.out.println("Bạn là người bình thường");
            }else if (bmi<= 29.9){
                System.out.println("Bạn bị béo phì độ I");
            }else if (bmi<= 34.9){
                System.out.println("Bạn bị béo phì độ II");
            }else {
                System.out.println("Bạn bị béo phì độ III");
            }

        }catch (InputMismatchException ex){
            System.out.println("CHiều cao, cân nặng nhập vào chưa hợp lệ");
        }
    }

}




