package home1;

import java.math.BigInteger;
import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        task3();
        
    }

    static void task1() {
        System.out.println("Вычислить n- ое треугольного число(сумма чисел от 1 до n), n! (произведение чисе лот 1 до n) ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;
        BigInteger mult = BigInteger.ONE;
        for(int i =1; i<= num; i++){
            sum +=i;
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        System.out.println("n треугольного числа = " + sum);
        System.out.println("n! =" + mult);
    }
    
    static void task2(){
        System.out.println("Вывести все простые числа от 1 до 1000");
        for (int i = 2; i <=1000; i++){
            int count = 0;
            for (int j =1; j <=i; j++){
                if ( i%j==0){
                count +=1;
             }
        
            }
            if (count <= 2){
                System.out.print (i + " ");
            }
        }
    }

    static void task3(){
        {

            Scanner con = new Scanner(System.in);
            System.out.print("Введите первое число: ");        
            int a = con.nextInt();
            System.out.print("Введите действие ");        
            String ch = con.next();
            System.out.print("Введите второе число: ");        
            int b = con.nextInt();     
            int res = 0;
            switch (ch)        
            {
        
              case "+": res = a + b; break;   
        
              case "-": res = a - b; break;
        
              case "*": res = a * b; break;
        
              case "/": res = a / b; break;
        
            }  
            System.out.println(res);        
            con.close();
        
        }
    }
}

