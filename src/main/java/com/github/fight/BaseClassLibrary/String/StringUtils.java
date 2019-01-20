package com.github.fight.BaseClassLibrary.String;

public class StringUtils {
    /**
     * 判断一个字符串是否不为空
     *
     * @param str
     * @return true 不为空
     * false 为空
     */
    public static boolean hasLength(String str) {
        // 不为空： 1.不能是null；2.不为空的内容
        return str != null && !"".equals(str.trim());
    }

    /**
     * 判断一个字符串是否为空
     *
     * @param str
     * @return true 为空
     * false 不为空
     */
    public static boolean isBlank(String str) {
        return !StringUtils.hasLength(str);
    }
}
