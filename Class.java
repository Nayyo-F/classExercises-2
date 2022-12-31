public class Class {
    public static int isSquare(int n) {

        int rtnval = 0;
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                rtnval = 1;
                break;
            }
        }
        return rtnval;
    }

    public static int isLegalNumber(int []a, int bases)
    {
        int isLegalNumber=1;
        for (int i=0; i<a.length; i++)
        {
            if (a[i]>=bases)
                isLegalNumber=0;
        }
        return isLegalNumber;
    }



    public static void main(String[] args) {
      int z= isLegalNumber( new int[] {3,2,1}, 4);
      System.out.println(z);


    }

}
