/*
 * BrightInsight CONFIDENTIAL

 * Copyright (c) 2019-2021 BrightInsight, All Rights Reserved.
 * NOTICE: These materials, together with all information, code, and other content contained herein (all of the
 * foregoing, collectively, this “Content”) is, and remains the property of BrightInsight, Inc. (“BrightInsight”), and
 * BrightInsight reserves all rights in and related to this Content. This Content is confidential and proprietary to
 * BrightInsight and may be covered by U.S. and/or foreign registered intellectual property or proprietary rights and/or
 * laws, including without limitation trade secret and copyright laws. Dissemination or reproduction of or access to
 * this Content, in whole or in part, is strictly forbidden unless prior written permission is obtained from
 * BrightInsight. The copyright notice above does not evidence any actual or intended publication or disclosure of this
 * Content, and this Content may be a trade secret of BrightInsight.

 * ANY USE, REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC PERFORMANCE, OR PUBLIC DISPLAY OF THIS CONTENT OR THROUGH
 * USE OF ANY SOFTWARE THAT IS PART OF THIS CONTENT (REGARDLESS OF WHETHER IN SOURCE OR OBJECT CODE), IN WHOLE OR IN
 * PART, IS STRICTLY PROHIBITED OTHER THAN AS EXPRESSLY AUTHORIZED BY BRIGHTINSIGHT IN WRITING, AND MAY BE IN VIOLATION
 * OF APPLICABLE LAWS AND INTERNATIONAL TREATIES. THE RECEIPT OR POSSESSION OF THIS CONTENT AND/OR RELATED INFORMATION
 * DOES NOT CONVEY OR IMPLY ANY RIGHT TO REPRODUCE, DISCLOSE, DISTRIBUTE OR OTHERWISE USE IT, OR TO MANUFACTURE, USE, OR
 * SELL ANYTHING THAT IT MAY DESCRIBE, IN WHOLE OR IN PART.
 */
package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        if (Objects.isNull(array) || array.length<4) {
            return List.of();
        }
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        
        createCombination(arrayList, array, targetSum);
        
        
        return arrayList;
      }

    private static Integer[] createCombination(ArrayList<Integer[]> arrayList, int[] array, int targetSum) {
        int i = 0;
        int j = 3;
        
        int iterations = array.length-4;
        for (int k = 0; k < iterations; k++) {
            
            
            
        }
        
        
        
        Integer[] arrayOfFour = new Integer[4];//Stream.of(array).
        Integer reduce = Arrays.stream(array).reduce(0, Integer::sum);
//        if (reduce==targetSum) {
//            arrayList.add(arrayOfFour);
//        }
        
        
        
//        for (int i = 0; i < arrayOfFour.length; i++) {
//            arrayOfFour[0] = array[i];
//            for (int j = 1; j < arrayOfFour.length-1; j++) {
//                arrayOfFour[1] = array[j];
//                for (int k = 2; k < arrayOfFour.length-2; k++) {
//                    arrayOfFour[2] = array[k];
//                    for (int l = 3; l < arrayOfFour.length-3; l++) {
//                        arrayOfFour[3] = array[l];
//                    }
//                }
//            }
//        }
        
        return arrayOfFour;
    }
    
    public void switchPositions(int[] array, int i, int j) {
        int temporal = array[i];
        array[i] = array[j];
        array[j] = temporal;
    }

}
