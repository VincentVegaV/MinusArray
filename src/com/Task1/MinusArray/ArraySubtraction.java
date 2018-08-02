package com.Task1.MinusArray;

public class ArraySubtraction
{

    public String[] getSubtractedArray(String[] array1, String[] array2)
    {

        int n = array1.length - array2.length;
        String[] resultArray = new String[n];

        for (int i = 0; i <= array2.length - 1; i++)
        {
            for (int j = 0; j <= array1.length - 1; j++)
            {
                if (array1[j].equals(array2[i]))
                {

                }
            }
        }

        return resultArray;
    }


    static Boolean checkTypeArray(Object array) {
        boolean type;
        type = array instanceof String[];

        return type;
    }



//метод проверки на пустой массив


}