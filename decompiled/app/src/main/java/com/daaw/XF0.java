package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class XF0 extends SF0 implements InterfaceC6693n30 {
    public final Object a;

    public XF0(Object obj) {
        G10.g(obj, "recordComponent");
        this.a = obj;
    }

    @Override // com.daaw.SF0
    public Member S() throws IllegalAccessException, InvocationTargetException {
        Method methodC = C6409m20.a.c(this.a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // com.daaw.InterfaceC6693n30
    public boolean a() {
        return false;
    }

    @Override // com.daaw.InterfaceC6693n30
    public InterfaceC10047z30 getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = C6409m20.a.d(this.a);
        if (clsD != null) {
            return new MF0(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
