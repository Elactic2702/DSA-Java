public class RichestCustomerWealth {
    
    public static int maximumWealth(int[][]accounts){

        int ans = 0;

        //here row is person and account is col
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }

            //now we have sum of accounts of person i.e. rowsum
            //check with all other rowsums of arr

            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][]accounts={
            {2,3,4,5},
            {4,5,6,7},
            {66,66,77,33}
        };

        System.out.println(maximumWealth(accounts));
    }
}
