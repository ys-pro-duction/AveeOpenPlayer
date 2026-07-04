package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6647mt {
    public static final void a(InterfaceC4684ft interfaceC4684ft, Throwable th) {
        Iterator it = AbstractC6368lt.a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC6089kt) it.next()).f1(interfaceC4684ft, th);
            } catch (Throwable th2) {
                AbstractC6368lt.b(AbstractC6926nt.b(th, th2));
            }
        }
        try {
            AbstractC7596qI.a(th, new KB(interfaceC4684ft));
        } catch (Throwable unused) {
        }
        AbstractC6368lt.b(th);
    }
}
