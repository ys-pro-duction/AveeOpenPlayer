package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.s80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8112s80 {
    public static final C8112s80 a = new C8112s80();

    public final InterfaceC5590j80 a() {
        return C5119hT.a;
    }

    public final String b(J50 j50) {
        G10.g(j50, "kClass");
        String name = X40.b(j50).getName();
        G10.f(name, "getName(...)");
        return name;
    }

    public final String c(Exception exc) {
        G10.g(exc, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append("\n\t");
        StackTraceElement[] stackTrace = exc.getStackTrace();
        G10.f(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            G10.f(className, "getClassName(...)");
            if (BY0.z(className, "sun.reflect", false, 2, null)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(AbstractC2455Um.n0(arrayList, "\n\t", null, null, 0, null, null, 62, null));
        return sb.toString();
    }

    public final Map d() {
        return new ConcurrentHashMap();
    }

    public final Set e() {
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        G10.f(setNewSetFromMap, "newSetFromMap(...)");
        return setNewSetFromMap;
    }

    public final Object f(Object obj, LQ lq) {
        Object objInvoke;
        G10.g(obj, "lock");
        G10.g(lq, "block");
        synchronized (obj) {
            objInvoke = lq.invoke();
        }
        return objInvoke;
    }
}
