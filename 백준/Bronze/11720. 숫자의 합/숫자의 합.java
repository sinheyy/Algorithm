import java.util.Scanner;

//클래스 Main
public class Main {

   //main 함수
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      int n, sum=0;
      String num;

      Scanner sc = new Scanner(System.in);   //Scanner 객체 생성
      
      n = sc.nextInt();
      num = sc.next();
      
      for(int i=0;i<n;i++) {
    	  int tmp = num.charAt(i) - '0';
    	  sum=sum+tmp;
      }


      
      System.out.println(sum);
      
      
   }

}