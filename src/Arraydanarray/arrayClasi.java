package Arraydanarray;

public class arrayClasi {

    public int cutEdedlerinSayi(int[] intArray){
        int cutEdedlerinSayi = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                cutEdedlerinSayi++;
            }
        }
        return cutEdedlerinSayi;
    }

    public int[] cutArrayQaytar(int[] intArray) {

        int[] cutArray = new int[cutEdedlerinSayi(intArray)];
        int cutArrayIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                cutArray[cutArrayIndex] = intArray[i];
                cutArrayIndex++;
            }
        }
        return cutArray;
    }
    public void netice(int[] cavab){
        for (int i = 0; i < cavab.length; i++) {
            System.out.println(cavab[i]);
        }
    }


}
