package com.Task1.MinusArray;

public class ArraySubtraction {

    public String[] getSubtractedArray(String[] array1, String[] array2)
    {
        int n = array1.length-array2.length;
        String[] resultArray = new String[n];

        for(int i=0; i < array2.length; i++)
        {
            for(int j=0; j < array1.length; j++)
            {
                if (array1[j].equals(array2[i]))
                {

                }
            }
        }

        return resultArray;
    }

}
