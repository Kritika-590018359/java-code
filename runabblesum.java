import java.util.Scanner;

public class runabblesum {
   public runabblesum() {
   }

   public static void main(String[] var0) {
      Scanner var2 = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int var3 = var2.nextInt();
      int[] var1 = new int[var3];
      System.out.print("Enter the elements of the array: ");

      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4] = var2.nextInt();
      }

      ArraySumCalculator var6 = new ArraySumCalculator(var1);
      Thread var5 = new Thread(var6);
      var5.start();
   }
}

