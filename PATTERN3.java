public class PATTERN3 {
    public static void main(String[] args){
        Pattern3(5);
    }
    static void Pattern3(int n){
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                System.out.print(j+1 +" ");
            }
            System.out.println(" ");
        }
    }
}
