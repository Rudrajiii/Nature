public class multidimentional_array {
    public static void main(String[] args) {
        int nums[][] = new int[4][4];

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[] : nums){
            for(int j : n){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
