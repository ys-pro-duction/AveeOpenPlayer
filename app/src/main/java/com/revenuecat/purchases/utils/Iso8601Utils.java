package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.Constants;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = DesugarTimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static Date parse(String str) {
        int i;
        int i2;
        int iPow;
        int i3;
        int i4;
        TimeZone timeZone;
        char cCharAt;
        try {
            int i5 = parseInt(str, 0, 4);
            int i6 = checkOffset(str, 4, '-') ? 5 : 4;
            int i7 = i6 + 2;
            int i8 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i9 = i7 + 2;
            int i10 = parseInt(str, i7, i9);
            boolean zCheckOffset = checkOffset(str, i9, 'T');
            if (!zCheckOffset && str.length() <= i9) {
                return new GregorianCalendar(i5, i8 - 1, i10).getTime();
            }
            if (zCheckOffset) {
                int i11 = i7 + 5;
                int i12 = parseInt(str, i7 + 3, i11);
                if (checkOffset(str, i11, ':')) {
                    i11 = i7 + 6;
                }
                int i13 = i11 + 2;
                i4 = parseInt(str, i11, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i11 + 3;
                }
                if (str.length() <= i13 || (cCharAt = str.charAt(i13)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i = i5;
                    i2 = i12;
                    i9 = i13;
                    iPow = 0;
                    i3 = 0;
                } else {
                    int i14 = i13 + 2;
                    i3 = parseInt(str, i13, i14);
                    if (i3 > 59 && i3 < 63) {
                        i3 = 59;
                    }
                    if (checkOffset(str, i14, '.')) {
                        int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
                        i = i5;
                        iPow = (int) (Math.pow(10.0d, 3 - (r5 - r9)) * ((double) parseInt(str, i13 + 3, Math.min(iIndexOfNonDigit, i13 + 6))));
                        i2 = i12;
                        i9 = iIndexOfNonDigit;
                    } else {
                        i = i5;
                        i2 = i12;
                        i9 = i14;
                        iPow = 0;
                    }
                }
            } else {
                i = i5;
                i2 = 0;
                iPow = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i9) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i9);
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    String str2 = GMT_ID + strSubstring;
                    TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str2);
                    String id = timeZone2.getID();
                    if (!id.equals(str2) && !id.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i);
            gregorianCalendar.set(2, i8 - 1);
            gregorianCalendar.set(5, i10);
            gregorianCalendar.set(11, i2);
            gregorianCalendar.set(12, i4);
            gregorianCalendar.set(13, i3);
            gregorianCalendar.set(14, iPow);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new SerializationException("Not an RFC 3339 date: " + str, e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new SerializationException("Not an RFC 3339 date: " + str, e);
        }
    }

    private static int parseInt(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
