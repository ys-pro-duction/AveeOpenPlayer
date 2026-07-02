package com.daaw;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Hu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1114Hu1 {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                AbstractC7770qu1.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            AbstractC7770qu1.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static C1214It1 b(C3845cu1 c3845cu1) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = c3845cu1.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : j;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j6 = jCurrentTimeMillis + (j3 * 1000);
            if (z) {
                j5 = j6;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j6;
            }
            j4 = j6;
        } else {
            j4 = (jA <= j || jA2 < jA) ? j : jCurrentTimeMillis + (jA2 - jA);
            j5 = j4;
        }
        C1214It1 c1214It1 = new C1214It1();
        c1214It1.a = c3845cu1.b;
        c1214It1.b = str5;
        c1214It1.f = j4;
        c1214It1.e = j5;
        c1214It1.c = jA;
        c1214It1.d = jA3;
        c1214It1.g = map;
        c1214It1.h = c3845cu1.d;
        return c1214It1;
    }

    public static String c(long j) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
