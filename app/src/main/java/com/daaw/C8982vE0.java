package com.daaw;

import com.daaw.CO0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.vE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8982vE0 implements InterfaceC8715uJ {
    public static final int i = AbstractC6280lb1.v("RCC\u0001");
    public final Format a;
    public Z41 c;
    public int e;
    public long f;
    public int g;
    public int h;
    public final C2584Vs0 b = new C2584Vs0(9);
    public int d = 0;

    public C8982vE0(Format format) {
        this.a = format;
    }

    public final boolean b(InterfaceC9001vJ interfaceC9001vJ) throws IOException {
        this.b.F();
        if (!interfaceC9001vJ.d(this.b.a, 0, 8, true)) {
            return false;
        }
        if (this.b.i() != i) {
            throw new IOException("Input not RawCC");
        }
        this.e = this.b.x();
        return true;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        this.b.F();
        interfaceC9001vJ.k(this.b.a, 0, 8);
        return this.b.i() == i;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        while (true) {
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    e(interfaceC9001vJ);
                    this.d = 1;
                    return 0;
                }
                if (!g(interfaceC9001vJ)) {
                    this.d = 0;
                    return -1;
                }
                this.d = 2;
            } else {
                if (!b(interfaceC9001vJ)) {
                    return -1;
                }
                this.d = 1;
            }
        }
    }

    public final void e(InterfaceC9001vJ interfaceC9001vJ) {
        while (this.g > 0) {
            this.b.F();
            interfaceC9001vJ.g(this.b.a, 0, 3);
            this.c.c(this.b, 3);
            this.h += 3;
            this.g--;
        }
        int i2 = this.h;
        if (i2 > 0) {
            this.c.a(this.f, 1, i2, 0, null);
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.d = 0;
    }

    public final boolean g(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        this.b.F();
        int i2 = this.e;
        if (i2 == 0) {
            if (!interfaceC9001vJ.d(this.b.a, 0, 5, true)) {
                return false;
            }
            this.f = (this.b.z() * 1000) / 45;
        } else {
            if (i2 != 1) {
                throw new C3000Zs0("Unsupported version number: " + this.e);
            }
            if (!interfaceC9001vJ.d(this.b.a, 0, 9, true)) {
                return false;
            }
            this.f = this.b.q();
        }
        this.g = this.b.x();
        this.h = 0;
        return true;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
        this.c = interfaceC9838yJ.a(0, 3);
        interfaceC9838yJ.n();
        this.c.d(this.a);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
