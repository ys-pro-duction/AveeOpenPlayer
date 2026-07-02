package com.daaw;

/* JADX INFO: renamed from: com.daaw.kJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5918kJ0 {
    public static Object a(int i, Object obj, InterfaceC3707cR interfaceC3707cR, InterfaceC6764nJ0 interfaceC6764nJ0) {
        Object objApply;
        if (i < 1) {
            return interfaceC3707cR.apply(obj);
        }
        do {
            objApply = interfaceC3707cR.apply(obj);
            obj = interfaceC6764nJ0.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return objApply;
    }
}
