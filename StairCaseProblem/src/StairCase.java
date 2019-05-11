
public class StairCase {
	
	static void printStaircase(int n) {
        for(int i=1;i<=	n;i++) {
            int temp =0;
            while(temp<n-i) {
                temp++;
                System.out.print(" ");
            }
            while(temp< n) {
                temp++;
                System.out.print("#");
            }
             System.out.println();
        }
	}

}
