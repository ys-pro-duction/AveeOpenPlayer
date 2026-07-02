package com.daaw;

import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UE implements InterfaceC9543xF {
    public final List a;
    public final Z41[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public UE(List list) {
        this.a = list;
        this.b = new Z41[list.size()];
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) {
        if (this.c) {
            if (this.d != 2 || f(c2584Vs0, 32)) {
                if (this.d != 1 || f(c2584Vs0, 0)) {
                    int iC = c2584Vs0.c();
                    int iA = c2584Vs0.a();
                    for (Z41 z41 : this.b) {
                        c2584Vs0.J(iC);
                        z41.c(c2584Vs0, iA);
                    }
                    this.e += iA;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.c = false;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
        if (this.c) {
            for (Z41 z41 : this.b) {
                z41.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            InterfaceC8103s61.a aVar = (InterfaceC8103s61.a) this.a.get(i);
            dVar.a();
            Z41 z41A = interfaceC9838yJ.a(dVar.c(), 3);
            z41A.d(Format.m(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.c), aVar.a, null));
            this.b[i] = z41A;
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final boolean f(C2584Vs0 c2584Vs0, int i) {
        if (c2584Vs0.a() == 0) {
            return false;
        }
        if (c2584Vs0.x() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
