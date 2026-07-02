package com.daaw;

import com.daaw.C6607ml;

/* JADX INFO: renamed from: com.daaw.z40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10052z40 {
    public static final C10052z40 a = new C10052z40();
    public static final AP b;
    public static final C6607ml c;
    public static final C6607ml d;
    public static final C6607ml e;

    static {
        AP ap = new AP("kotlin.jvm.JvmField");
        b = ap;
        C6607ml.a aVar = C6607ml.d;
        c = aVar.c(ap);
        d = aVar.c(new AP("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        e = C6607ml.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    public static final String b(String str) {
        G10.g(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + AbstractC9393wj.a(str);
    }

    public static final boolean c(String str) {
        G10.g(str, "name");
        return AY0.u(str, "get", false, 2, null) || AY0.u(str, "is", false, 2, null);
    }

    public static final boolean d(String str) {
        G10.g(str, "name");
        return AY0.u(str, "set", false, 2, null);
    }

    public static final String e(String str) {
        String strA;
        G10.g(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (f(str)) {
            strA = str.substring(2);
            G10.f(strA, "substring(...)");
        } else {
            strA = AbstractC9393wj.a(str);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean f(String str) {
        G10.g(str, "name");
        if (!AY0.u(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return G10.h(97, cCharAt) > 0 || G10.h(cCharAt, 122) > 0;
    }

    public final C6607ml a() {
        return e;
    }
}
