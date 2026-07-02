package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.daaw.cG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3664cG0 {
    public static final Constructor a(InterfaceC8381t60 interfaceC8381t60) {
        InterfaceC2231Si interfaceC2231SiP;
        G10.g(interfaceC8381t60, "<this>");
        H50 h50B = AbstractC8511tb1.b(interfaceC8381t60);
        Member memberB = (h50B == null || (interfaceC2231SiP = h50B.P()) == null) ? null : interfaceC2231SiP.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(W60 w60) {
        G10.g(w60, "<this>");
        AbstractC5867k70 abstractC5867k70D = AbstractC8511tb1.d(w60);
        if (abstractC5867k70D != null) {
            return abstractC5867k70D.g0();
        }
        return null;
    }

    public static final Method c(W60 w60) {
        G10.g(w60, "<this>");
        return d(w60.f0());
    }

    public static final Method d(InterfaceC8381t60 interfaceC8381t60) {
        InterfaceC2231Si interfaceC2231SiP;
        G10.g(interfaceC8381t60, "<this>");
        H50 h50B = AbstractC8511tb1.b(interfaceC8381t60);
        Member memberB = (h50B == null || (interfaceC2231SiP = h50B.P()) == null) ? null : interfaceC2231SiP.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(C60 c60) {
        G10.g(c60, "<this>");
        return d(c60.g());
    }

    public static final Type f(InterfaceC7550q70 interfaceC7550q70) {
        G10.g(interfaceC7550q70, "<this>");
        Type typeK = ((C9230w70) interfaceC7550q70).k();
        return typeK == null ? AbstractC5319i91.f(interfaceC7550q70) : typeK;
    }
}
