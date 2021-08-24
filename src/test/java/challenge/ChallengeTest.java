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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ChallengeTest {
    
    @Test
    public void testCase1() {
        int[] list = {7, 6, 4, -1, 1, 2};
        var outList = Main.fourNumberSum(list, 16);
        assertEquals(2, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(16, reduce);
        }
    }
    
    @Test
    public void testCase2() {
        int[] list = {7, 6, 4, -1, 1, 2};
        var outList = Main.fourNumberSum(list, 10);
        assertEquals(1, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(10, reduce);
        }
    }
    
    @Test
    public void testCase3() {
        int[] list = {5, -5, -2, 2, 3, -3};
        var outList = Main.fourNumberSum(list, 0);
        assertEquals(3, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(0, reduce);
        }
    }
    
    @Test
    public void testCase4() {
        int[] list = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var outList = Main.fourNumberSum(list, 4);
        assertEquals(4, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(4, reduce);
        }
    }
    
    @Test
    public void testCase5() {
        int[] list = {-1, 22, 18, 4, 7, 11, 2, -5, -3};
        var outList = Main.fourNumberSum(list, 30);
        assertEquals(7, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(30, reduce);
        }
    }
    
    @Test
    public void testCase6() {
        int[] list = {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};
        var outList = Main.fourNumberSum(list, 20);
        assertEquals(6, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(20, reduce);
        }
    }
    
    @Test
    public void testCase7() {
        int[] list = {1, 2, 3, 4, 5};
        var outList = Main.fourNumberSum(list, 100);
        assertEquals(6, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(100, reduce);
        }
    }
    
    @Test
    public void testCase8() {
        int[] list = {1, 2, 3, 4, 5, -5, 6, -6};
        var outList = Main.fourNumberSum(list, 5);
        assertEquals(6, outList.size());
        for (Integer[] integers : outList) {
            Integer reduce = Stream.of(integers).reduce(0, Integer::sum);
            assertEquals(5, reduce);
        }
    }
    
}
