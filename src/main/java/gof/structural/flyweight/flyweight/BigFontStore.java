/**
 * Copyright 2017 Keid
*/
package gof.structural.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * BigFontStore
 * 
 * @author Keid
 */
public class BigFontStore {

    private static Map<Character, String> store = new HashMap<>();

    private static final String BIG_NUM_0
    = "-----######-----\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NUM_1
    = "-------##-------\n"
    + "---######-------\n"
    + "-------##-------\n"
    + "-------##-------\n"
    + "-------##-------\n"
    + "-------##-------\n"
    + "---##########---\n";

    private static final String BIG_NUM_2
    = "-----######-----\n"
    + "---##------##---\n"
    + "-----------##---\n"
    + "-------####-----\n"
    + "-----##---------\n"
    + "---##-----------\n"
    + "---##########---\n";

    private static final String BIG_NUM_3
    = "-----######-----\n"
    + "---##------##---\n"
    + "-----------##---\n"
    + "-------####-----\n"
    + "-----------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NUM_4
    = "---------##-----\n"
    + "-------####-----\n"
    + "-----##--##-----\n"
    + "---##----##-----\n"
    + "---##########---\n"
    + "---------##-----\n"
    + "---------##-----\n";

    private static final String BIG_NUM_5
    = "---##########---\n"
    + "---##-----------\n"
    + "---##-----------\n"
    + "---########-----\n"
    + "-----------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NUM_6
    = "-----######-----\n"
    + "---##------##---\n"
    + "---##-----------\n"
    + "---########-----\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NUM_7
    = "---##########---\n"
    + "---##------##---\n"
    + "-----------##---\n"
    + "---------##-----\n"
    + "-------##-------\n"
    + "-------##-------\n"
    + "-------##-------\n";

    private static final String BIG_NUM_8
    = "-----######-----\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "-----######-----\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NUM_9
    = "-----######-----\n"
    + "---##------##---\n"
    + "---##------##---\n"
    + "-----######-----\n"
    + "-----------##---\n"
    + "---##------##---\n"
    + "-----######-----\n";

    private static final String BIG_NA
    = "--##---##-------\n"
    + "--#-#--#--------\n"
    + "--#--#-#--------\n"
    + "-##---##----##--\n"
    + "-----------#-#--\n"
    + "---------#####--\n"
    + "-------##----##-\n";

    static {
        store.put('0', BIG_NUM_0);
        store.put('1', BIG_NUM_1);
        store.put('2', BIG_NUM_2);
        store.put('3', BIG_NUM_3);
        store.put('4', BIG_NUM_4);
        store.put('5', BIG_NUM_5);
        store.put('6', BIG_NUM_6);
        store.put('7', BIG_NUM_7);
        store.put('8', BIG_NUM_8);
        store.put('9', BIG_NUM_9);
    }

    private BigFontStore() {
    }

    public static String getBigFont(char key) {
        return store.getOrDefault(key, BIG_NA);
    }

}
