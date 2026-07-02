package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2777Xo1 extends AbstractC6898nn1 {
    public C2777Xo1(final C2461Un1 c2461Un1, int i, long j, long j2) {
        long j3;
        InterfaceC6052kn1 interfaceC6052kn1 = new InterfaceC6052kn1() { // from class: com.daaw.Uo1
            @Override // com.daaw.InterfaceC6052kn1
            public final long a(long j4) {
                return c2461Un1.b(j4);
            }
        };
        C2673Wo1 c2673Wo1 = new C2673Wo1(c2461Un1, i, null);
        long jA = c2461Un1.a();
        long j4 = c2461Un1.j;
        int i2 = c2461Un1.d;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) c2461Un1.c)) / 2) + 1;
        } else {
            int i3 = c2461Un1.a;
            long j5 = 4096;
            if (i3 == c2461Un1.b && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * ((long) c2461Un1.g)) * ((long) c2461Un1.h)) / 8);
        }
        super(interfaceC6052kn1, c2673Wo1, jA, 0L, j4, j, j2, j3, Math.max(6, c2461Un1.c));
    }
}
