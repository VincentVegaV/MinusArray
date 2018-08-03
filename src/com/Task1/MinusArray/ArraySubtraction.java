package com.Task1.MinusArray;

public class ArraySubtraction
{

    public String[] getSubtractedArray(String[] array1, String[] array2)
    {
        int l = array1.length;
        int j;
        for(j = 0; j < l; j++){ // Поиск удаляемого элемента

                if(array1[j].equals("Galina")){
                    break;
                }
            }


        for(int k = j; k < l-1; k++){
            // Сдвиг последующих элементов
            array1[k] = array1[k+1];
        }
        l--;

        return array1;
    }


    static Boolean checkTypeArray(Object array) {
        boolean type;
        type = array instanceof String[];

        return type;
    }



//метод проверки на пустой массив


}