package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.oN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7059oN0 implements InterfaceC0409Bc1 {
    public static final C7059oN0 a = new C7059oN0();

    @Override // com.daaw.InterfaceC0409Bc1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6780nN0 a(AbstractC6977o40 abstractC6977o40, float f) {
        boolean z = abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY;
        if (z) {
            abstractC6977o40.c();
        }
        float F = (float) abstractC6977o40.F();
        float F2 = (float) abstractC6977o40.F();
        while (abstractC6977o40.o()) {
            abstractC6977o40.q0();
        }
        if (z) {
            abstractC6977o40.j();
        }
        return new C6780nN0((F / 100.0f) * f, (F2 / 100.0f) * f);
    }
}
