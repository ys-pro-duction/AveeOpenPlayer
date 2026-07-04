package com.daaw;

/* JADX INFO: renamed from: com.daaw.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6712n7 {
    public static final C6433m7 a(C6433m7 c6433m7, Object obj, AbstractC8664u7 abstractC8664u7, long j, long j2, boolean z) {
        G10.g(c6433m7, "<this>");
        return new C6433m7(c6433m7.o(), obj, abstractC8664u7, j, j2, z);
    }

    public static /* synthetic */ C6433m7 b(C6433m7 c6433m7, Object obj, AbstractC8664u7 abstractC8664u7, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c6433m7.getValue();
        }
        if ((i & 2) != 0) {
            abstractC8664u7 = AbstractC8950v7.a(c6433m7.p());
        }
        if ((i & 4) != 0) {
            j = c6433m7.m();
        }
        if ((i & 8) != 0) {
            j2 = c6433m7.e();
        }
        if ((i & 16) != 0) {
            z = c6433m7.q();
        }
        boolean z2 = z;
        long j3 = j2;
        return a(c6433m7, obj, abstractC8664u7, j, j3, z2);
    }

    public static final AbstractC8664u7 c(InterfaceC3626c71 interfaceC3626c71, Object obj) {
        G10.g(interfaceC3626c71, "<this>");
        return AbstractC8950v7.c((AbstractC8664u7) interfaceC3626c71.a().invoke(obj));
    }
}
