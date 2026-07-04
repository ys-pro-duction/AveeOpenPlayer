package com.daaw;

import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.daaw.xX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9615xX {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static String a(Date date) {
        return b(date, false, a);
    }

    public static String b(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        c(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        c(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        c(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        c(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            c(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            c(sb, iAbs, 2);
            sb.append(':');
            c(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static void c(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }
}
