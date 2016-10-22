package optimumsolution;

/**
 *
 * @author Dcnebit
 */
public class OptimumSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //10 peso bill
        //5 peso bill
        //1 peso bill
        //25 cents coins
        double target = 572.75;
        double money[] = {10, 5, 1, 0.25};
        double moneyProduce = 0;
        int counter = 0, moneyQ[] = new int[4];
        
        while (moneyProduce < target) {
            if (moneyProduce + money[counter] <= target) {
                moneyQ[counter] += 1;
                 moneyProduce+= money[counter];
            }else counter++;
        }
        System.out.println("10 peso bill: " +moneyQ[0] +"\n 5 peso bill: " +moneyQ[1] +"\n 1 peso bill: " +moneyQ[2] +"\n 25 cents bill: " +moneyQ[3]);
    }
    
}
