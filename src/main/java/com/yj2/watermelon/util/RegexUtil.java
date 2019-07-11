package com.yj2.watermelon.util;

import org.springframework.util.StringUtils;

public final class RegexUtil {
    private RegexUtil() {

    }

    /**
     * 验证手机号码正确性
     *
     * @param phone
     * @return
     */
    public static boolean checkPhone(String phone) {
        if (StringUtils.isEmpty(phone)) {
            return false;
        }
        //中国移动
        String cm = "(^1(3[4-9]|4[7]|5[0-27-9]|7[8]|8[2-478])\\d{8}$)|(^1705\\d{7}$)";
        //中国联通
        String cu = "(^1(3[0-2]|4[5]|5[56]|7[6]|8[56])\\d{8}$)|(^1709\\d{7}$)";
        //中国电信
        String ct = "(^1(33|53|77|8[019])\\d{8}$)|(^1700\\d{7}$)";
        return phone.matches(cm) || phone.matches(cu) || phone.matches(ct);
    }

    /**
     * 手机号中间显示*
     *
     * @param phone
     * @return
     */
    public static String phone(String phone) {
        return phone .substring(0,3) + "****" + phone .substring(7, phone .length());
    }
}
