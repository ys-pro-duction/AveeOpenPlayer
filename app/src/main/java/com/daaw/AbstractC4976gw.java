package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4976gw {
    public static String a(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strD = d(j);
        if (z) {
            strD = String.format(context.getString(ND0.q), strD);
        }
        return z2 ? String.format(context.getString(ND0.p), strD) : z3 ? String.format(context.getString(ND0.m), strD) : strD;
    }

    public static String b(long j) {
        return c(j, Locale.getDefault());
    }

    public static String c(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC2929Za1.b(locale).format(new Date(j)) : AbstractC2929Za1.f(locale).format(new Date(j));
    }

    public static String d(long j) {
        return i(j) ? b(j) : g(j);
    }

    public static String e(Context context, int i) {
        return AbstractC2929Za1.i().get(1) == i ? String.format(context.getString(ND0.n), Integer.valueOf(i)) : String.format(context.getString(ND0.o), Integer.valueOf(i));
    }

    public static String f(long j) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC2929Za1.n(Locale.getDefault()).format(new Date(j)) : DateUtils.formatDateTime(null, j, 8228);
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC2929Za1.m(locale).format(new Date(j)) : AbstractC2929Za1.f(locale).format(new Date(j));
    }

    public static boolean i(long j) {
        Calendar calendarI = AbstractC2929Za1.i();
        Calendar calendarK = AbstractC2929Za1.k();
        calendarK.setTimeInMillis(j);
        return calendarI.get(1) == calendarK.get(1);
    }
}
