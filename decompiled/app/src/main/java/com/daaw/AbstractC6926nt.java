package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6926nt {
    public static final void a(InterfaceC4684ft interfaceC4684ft, Throwable th) {
        try {
            InterfaceC6089kt interfaceC6089kt = (InterfaceC6089kt) interfaceC4684ft.a(InterfaceC6089kt.f);
            if (interfaceC6089kt != null) {
                interfaceC6089kt.f1(interfaceC4684ft, th);
            } else {
                AbstractC6647mt.a(interfaceC4684ft, th);
            }
        } catch (Throwable th2) {
            AbstractC6647mt.a(interfaceC4684ft, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC7596qI.a(runtimeException, th);
        return runtimeException;
    }
}
