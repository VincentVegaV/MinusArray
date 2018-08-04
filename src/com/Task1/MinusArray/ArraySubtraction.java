package com.Task1.MinusArray;

public class ArraySubtraction
{

    public String[] getSubtractedArray(String[] array1, String[] array2)
    {
        int len1 = array1.length;
        int len2 = array2.length;
        int n = len1 - len2;
        int q = 0;
        String[] buffArray = new String[n];


        for(int i=0; i<=len1-1; i++)
        {
            if(!array1[i].equals(array2[0]) || !array1[i].equals(array2[1]) || !array1[i].equals(array2[2]))
            {
                buffArray[q] = array1[i];
                q++;
            }
        }


        return buffArray;
    }


    static Boolean checkTypeArray(Object array) {
        boolean type;
        type = array instanceof String[];

        return type;
    }



//метод проверки на пустой массив


}