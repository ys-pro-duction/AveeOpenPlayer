package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Qg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2015Qg1 {
    public static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");
    public static final Pattern b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static Matcher a(C2584Vs0 c2584Vs0) {
        String strK;
        while (true) {
            String strK2 = c2584Vs0.k();
            if (strK2 == null) {
                return null;
            }
            if (a.matcher(strK2).matches()) {
                do {
                    strK = c2584Vs0.k();
                    if (strK != null) {
                    }
                } while (!strK.isEmpty());
            } else {
                Matcher matcher = C1681Ng1.b.matcher(strK2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrX = AbstractC6280lb1.X(str, "\\.");
        long j = 0;
        for (String str2 : AbstractC6280lb1.W(strArrX[0], Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrX.length == 2) {
            j2 += Long.parseLong(strArrX[1]);
        }
        return j2 * 1000;
    }

    public static void d(C2584Vs0 c2584Vs0) throws C7107oZ0 {
        String strK = c2584Vs0.k();
        if (strK == null || !b.matcher(strK).matches()) {
            throw new C7107oZ0("Expected WEBVTT. Got " + strK);
        }
    }
}
