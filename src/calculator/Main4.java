package calculator;

public class Main4 {

    public static void main(String[] args) {

   // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.

        int x = 98;
         LogicalOp op = new LogicalOp();

        op.checkNumber(x);

 //  2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
        int y=56;
        op.checkNo(y);

 //  3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea

        int a = 15;
        int b = 18;
        op.count(a,b);
 //  4.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

        int c = 4;
        int d = 8;
        System.out.println("after");
        op.counting(c,d);

 //  5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

        int number = 100;
        op.numberEven(number);

 //  6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

        int number2 = 100;
        op.oddNumber(number2);

//   7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
         int number3 = 100;
        op.printSum(number3);

//    8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media.
          int to = 100;
         op.sumAndAverage(80,100);

//     9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        int n = 7;
         op.pattern(n);

 //   Java While Loop

  // 1.
      int number21 = 95;
      op.checkNumber2(number21);
//   2.
       int h = -80;
      op.checkNo2(h);
//   3.
       int ax = 8;
       int bx = 14;
       op.count2(ax, bx);
//   4.
      int cv = 5;
      int dv = 1;
      op.counting2(dv, cv);
//    5.
        int no3 = 100;
        op.numberEven2(no3);
//    6.
        int no4 = 100;
        op.oddNumber2(no4);
//    7.
        int from = 111;
        int to2 = 8899;
        System.out.println(op.getSum(from, to2));
//    8.
        System.out.println(op.getAverageFrom7Numbers(1, 100));
//    9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
        op.diplayingFibonacciSeries(20);
    }
}
