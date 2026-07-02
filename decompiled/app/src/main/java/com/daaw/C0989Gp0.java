package com.daaw;

import java.io.EOFException;

/* JADX INFO: renamed from: com.daaw.Gp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0989Gp0 {
    public static final int l = AbstractC6280lb1.v("OggS");
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    public final C2584Vs0 k = new C2584Vs0(255);

    public boolean a(InterfaceC9001vJ interfaceC9001vJ, boolean z) throws C3000Zs0, EOFException {
        this.k.F();
        b();
        if ((interfaceC9001vJ.b() != -1 && interfaceC9001vJ.b() - interfaceC9001vJ.f() < 27) || !interfaceC9001vJ.e(this.k.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (this.k.z() != l) {
            if (z) {
                return false;
            }
            throw new C3000Zs0("expected OggS capture pattern at begin of page");
        }
        int iX = this.k.x();
        this.a = iX;
        if (iX != 0) {
            if (z) {
                return false;
            }
            throw new C3000Zs0("unsupported bit stream revision");
        }
        this.b = this.k.x();
        this.c = this.k.m();
        this.d = this.k.n();
        this.e = this.k.n();
        this.f = this.k.n();
        int iX2 = this.k.x();
        this.g = iX2;
        this.h = iX2 + 27;
        this.k.F();
        interfaceC9001vJ.k(this.k.a, 0, this.g);
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.x();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }
}
