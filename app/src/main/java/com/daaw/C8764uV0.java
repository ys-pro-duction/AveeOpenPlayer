package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.uV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8764uV0 implements InterfaceC8736uO0 {
    public R31 a;
    public Z41 b;
    public boolean c;

    @Override // com.daaw.InterfaceC8736uO0
    public void a(C2584Vs0 c2584Vs0) {
        if (!this.c) {
            if (this.a.e() == -9223372036854775807L) {
                return;
            }
            this.b.d(Format.n(null, "application/x-scte35", this.a.e()));
            this.c = true;
        }
        int iA = c2584Vs0.a();
        this.b.c(c2584Vs0, iA);
        this.b.a(this.a.d(), 1, iA, 0, null);
    }

    @Override // com.daaw.InterfaceC8736uO0
    public void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        this.a = r31;
        dVar.a();
        Z41 z41A = interfaceC9838yJ.a(dVar.c(), 4);
        this.b = z41A;
        z41A.d(Format.o(dVar.b(), "application/x-scte35", null, -1, null));
    }
}
