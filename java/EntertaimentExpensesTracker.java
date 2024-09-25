import java.util.Scanner;
public class EntertaimentExpensesTracker {
  public static double calculateTotalExpenses(double[]expenses){
    double total=0;
    for(double expense:expenses){
      total+=expense;
    }
    return total;
  }
  public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[] daysofWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","saturday","sunday"};
        double[] dailyExpenses=new double[7];
        for(int i=0;i<7;i++){
          System.out.print("Enter the entertaiment expenses for "+daysofWeek+(i+1));
          dailyExpenses[i]=sc.nextDouble();

        }
        double totalExpenses=calculateTotalExpenses(dailyExpenses);
        System.out.println("Total expenses for the week: $"+totalExpenses);

  }
}
