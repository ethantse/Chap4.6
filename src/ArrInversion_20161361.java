public class ArrInversion_20161361 {
    public static void main(String[] args) {
        int[] Ar4_6 = {0,1,2,3,4,5,6,7,8,9};
        for(int i : Ar4_6)
            System.out.print(i + "\t");
        int[] arout =Inversion(Ar4_6);
        System.out.println();
        for(int p : arout)
            System.out.print(p + "\t");
    }
    public static int[] Inversion(int[] arin) {
        for(int o = 0;o < arin.length/2;o++) {
                int c = arin[o];
                arin[o] = arin[arin.length - 1 - o];
                arin[arin.length - 1 - o] = c;
        }
        return arin;
    }
}
