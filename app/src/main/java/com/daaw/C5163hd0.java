package com.daaw;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5163hd0 {
    public static final C5163hd0 b = a(new Locale[0]);
    public final InterfaceC6847nd0 a;

    /* JADX INFO: renamed from: com.daaw.hd0$a */
    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = LW.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(LW.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: renamed from: com.daaw.hd0$b */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public C5163hd0(InterfaceC6847nd0 interfaceC6847nd0) {
        this.a = interfaceC6847nd0;
    }

    public static C5163hd0 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? j(b.a(localeArr)) : new C5163hd0(new C5442id0(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static C5163hd0 c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public static C5163hd0 e() {
        return b;
    }

    public static C5163hd0 j(LocaleList localeList) {
        return new C5163hd0(new C8241sd0(localeList));
    }

    public Locale d(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5163hd0) && this.a.equals(((C5163hd0) obj).a);
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public int g() {
        return this.a.size();
    }

    public String h() {
        return this.a.a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i() {
        return this.a.b();
    }

    public String toString() {
        return this.a.toString();
    }
}
