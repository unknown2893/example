public class Main {
    public static void main(String[] args) {
        Fibon fib1 = new Fibon(7);
        System.out.println("Порядковый номер числа: " + fib1.number);
        System.out.println("Число Фибоначи: " + fib1.f);
    }
}

class Fibon {

    int number;
    int f;

    public Fibon(int n){
        this.number = n;
        this.f = setNumber(n);
    }

    public int setNumber (int number){
        int f1=0;   int f2=1; int fn=0;
            switch (number){
                case (0):
                    fn=f1;
                    break;
                case (1):
                    fn=f2;
                    break;
                default:
                    for (int i=1; i<number; i++){
                        fn=f1+f2;
                        f1=f2;
                        f2=fn;
                    } break;
            }
        return fn;
    }
}


class Calc1 {
    public static void calc1(String[] args) {
        byte a = 10;                    short b = 15;        int c = 20;
        long d = 25;                    long e = 30;
        int mnoj = a*b;                 int sum = b+c;
        double del = (double)c/d;       long raz = d-e;

        String str1 = "кек ";           String str2 = "лол ";

        System.out.println("умножение: " + a + " * " + b + " = " + mnoj);
        System.out.println("сумма: " + b + " + " + c + " = " + sum);
        System.out.println("деление: " + c + " / " + d + " = " + del);
        System.out.println("разность: " + d + " - " + e + " = " + raz);

        System.out.println(str1 + "омг " + str2);
        System.out.println(str1 + 10 + 10);
        System.out.println(10 + 10 + " " + str1);
        System.out.println(str1 + (10 + 10));
    }
}
// VCS git pull - принять все изменения с github.
// VCS git add - добавить под управление git. (Теперь git видит наши файлы).
// VCS commit - добавить комментарий к программе.
// VCS git push - отправить на github.

// Горячие клавиши:
// ctrl + k - открывает окно commit.
// ctrl + Shift + k - открывает окно push.