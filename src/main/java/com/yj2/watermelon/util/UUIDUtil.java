package com.yj2.watermelon.util;

import java.util.Random;

/**
 * @ClassName UUIDUtil
 * @Description
 * @Author JYJ
 * @Date 2019/6/24 15:18
 **/

public class UUIDUtil {
    private static Random strGen = new Random();;
    private static char[] numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();;

    /**
     * 随机字符串
     * @param length
     * @return
     */
    public static final String randomString(int length) {
        if (length < 1) {
            return null;
        }
        char[] randBuffer = new char[length];
        for (int i = 0; i < randBuffer.length; i++) {
            randBuffer[i] = numbersAndLetters[strGen.nextInt(61)];
        }
        return new String(randBuffer);
    }

}
