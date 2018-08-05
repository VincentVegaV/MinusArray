package com.Task1.MinusArray;

import java.util.ArrayList;

public class ArraySubtraction
{

    public String[] getSubtractedArray(String[] array1, String[] array2)
    {
        int len1 = array1.length;
        int len2 = array2.length;
        int resL = 0;
        int n = len1-len2;
        String[] res = new String[n];
        boolean isFound = false;

        for(int i=0; i<=len1-1; i++)
        {
            isFound = false;
            for(int j=0; j<=len2-1; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    isFound = true;
                }
            }
            if (!isFound)
            {
                res[resL] = array1[i];
                resL++;
            }
        }
        return res;
    }


    public ArrayList<String> getSubstractedCollection()
    {

        return res;
    }

}