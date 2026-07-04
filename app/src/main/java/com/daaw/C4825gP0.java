package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4825gP0 {
    public final List a;
    public final Z41[] b;

    public C4825gP0(List list) {
        this.a = list;
        this.b = new Z41[list.size()];
    }

    public void a(long j, C2584Vs0 c2584Vs0) {
        AbstractC2339Tj.a(j, c2584Vs0, this.b);
    }

    public void b(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            Z41 z41A = interfaceC9838yJ.a(dVar.c(), 3);
            Format format = (Format) this.a.get(i);
            String str = format.G;
            AbstractC7115ob.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = format.B;
            if (strB == null) {
                strB = dVar.b();
            }
            z41A.d(Format.u(strB, str, null, -1, format.Y, format.Z, format.a0, null));
            this.b[i] = z41A;
        }
    }
}
