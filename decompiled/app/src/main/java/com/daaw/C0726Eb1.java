package com.daaw;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Eb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0726Eb1 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C0726Eb1 d;
    public final InterfaceC6045km a;

    public C0726Eb1(InterfaceC6045km interfaceC6045km) {
        this.a = interfaceC6045km;
    }

    public static C0726Eb1 c() {
        return d(C5551j01.b());
    }

    public static C0726Eb1 d(InterfaceC6045km interfaceC6045km) {
        if (d == null) {
            d = new C0726Eb1(interfaceC6045km);
        }
        return d;
    }

    public static boolean g(String str) {
        return c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC1836Ot0 abstractC1836Ot0) {
        return TextUtils.isEmpty(abstractC1836Ot0.b()) || abstractC1836Ot0.h() + abstractC1836Ot0.c() < b() + b;
    }
}
