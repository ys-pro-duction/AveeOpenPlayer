package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10225zi {
    public static final AbstractC7150oi a = AbstractC7429pi.a(C8823ui.B);
    public static final AbstractC7150oi b = AbstractC7429pi.a(C9109vi.B);
    public static final AbstractC7150oi c = AbstractC7429pi.a(C9388wi.B);
    public static final AbstractC7150oi d = AbstractC7429pi.a(C9667xi.B);
    public static final AbstractC7150oi e = AbstractC7429pi.a(C9946yi.B);

    public static final InterfaceC7550q70 a(Class cls) {
        G10.g(cls, "it");
        return AbstractC6150l60.b(m(cls), AbstractC1599Mm.k(), false, AbstractC1599Mm.k());
    }

    public static final ConcurrentHashMap b(Class cls) {
        G10.g(cls, "it");
        return new ConcurrentHashMap();
    }

    public static final InterfaceC7550q70 c(Class cls) {
        G10.g(cls, "it");
        return AbstractC6150l60.b(m(cls), AbstractC1599Mm.k(), true, AbstractC1599Mm.k());
    }

    public static final C4745g60 d(Class cls) {
        G10.g(cls, "it");
        return new C4745g60(cls);
    }

    public static final R60 e(Class cls) {
        G10.g(cls, "it");
        return new R60(cls);
    }

    public static final InterfaceC7550q70 k(Class cls, List list, boolean z) {
        G10.g(cls, "jClass");
        G10.g(list, "arguments");
        return list.isEmpty() ? z ? (InterfaceC7550q70) d.a(cls) : (InterfaceC7550q70) c.a(cls) : l(cls, list, z);
    }

    public static final InterfaceC7550q70 l(Class cls, List list, boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e.a(cls);
        C0576Cs0 c0576Cs0A = D61.a(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(c0576Cs0A);
        if (obj == null) {
            InterfaceC7550q70 interfaceC7550q70B = AbstractC6150l60.b(m(cls), list, z, AbstractC1599Mm.k());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c0576Cs0A, interfaceC7550q70B);
            obj = objPutIfAbsent == null ? interfaceC7550q70B : objPutIfAbsent;
        }
        G10.f(obj, "getOrPut(...)");
        return (InterfaceC7550q70) obj;
    }

    public static final C4745g60 m(Class cls) {
        G10.g(cls, "jClass");
        Object objA = a.a(cls);
        G10.e(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C4745g60) objA;
    }

    public static final InterfaceC6429m60 n(Class cls) {
        G10.g(cls, "jClass");
        return (InterfaceC6429m60) b.a(cls);
    }
}
