package com.daaw;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.daaw.mz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6675mz2 extends F53 {
    public char c;
    public long d;
    public String e;
    public final C4140dy2 f;
    public final C4140dy2 g;
    public final C4140dy2 h;
    public final C4140dy2 i;
    public final C4140dy2 j;
    public final C4140dy2 k;
    public final C4140dy2 l;
    public final C4140dy2 m;
    public final C4140dy2 n;

    public C6675mz2(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new C4140dy2(this, 6, false, false);
        this.g = new C4140dy2(this, 6, true, false);
        this.h = new C4140dy2(this, 6, false, true);
        this.i = new C4140dy2(this, 5, false, false);
        this.j = new C4140dy2(this, 5, true, false);
        this.k = new C4140dy2(this, 5, false, true);
        this.l = new C4140dy2(this, 4, false, false);
        this.m = new C4140dy2(this, 3, false, false);
        this.n = new C4140dy2(this, 2, false, false);
    }

    public static String A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z, obj);
        String strB2 = B(z, obj2);
        String strB3 = B(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    public static String B(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C1131Hy2 ? ((C1131Hy2) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strC = C(C9327wU2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        C3802cl3.b();
        return ((Boolean) AbstractC1311Jr2.A0.a(null)).booleanValue() ? "" : str;
    }

    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new C1131Hy2(str);
    }

    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    if (this.a.Q() != null) {
                        this.e = this.a.Q();
                    } else {
                        this.e = this.a.z().t();
                    }
                }
                AbstractC7506py0.l(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void G(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(D(), i)) {
            Log.println(i, D(), A(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        AbstractC7506py0.l(str);
        KS2 ks2G = this.a.G();
        if (ks2G == null) {
            Log.println(6, D(), "Scheduler not set. Not logging error/warn");
        } else if (ks2G.j()) {
            ks2G.z(new RunnableC10021yx2(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @Override // com.daaw.F53
    public final boolean f() {
        return false;
    }

    public final C4140dy2 m() {
        return this.m;
    }

    public final C4140dy2 n() {
        return this.f;
    }

    public final C4140dy2 o() {
        return this.h;
    }

    public final C4140dy2 q() {
        return this.g;
    }

    public final C4140dy2 r() {
        return this.l;
    }

    public final C4140dy2 s() {
        return this.n;
    }

    public final C4140dy2 t() {
        return this.i;
    }

    public final C4140dy2 u() {
        return this.k;
    }

    public final C4140dy2 y() {
        return this.j;
    }
}
