package com.daaw;

/* JADX INFO: renamed from: com.daaw.uo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8855uo1 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(InterfaceC8576to1 interfaceC8576to1, C8297so1 c8297so1) {
        if (this.c > 0) {
            interfaceC8576to1.c(this.d, this.e, this.f, this.g, c8297so1);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(InterfaceC8576to1 interfaceC8576to1, long j, int i, int i2, int i3, C8297so1 c8297so1) {
        if (this.g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(interfaceC8576to1, c8297so1);
            }
        }
    }

    public final void d(InterfaceC1190In1 interfaceC1190In1) {
        if (this.b) {
            return;
        }
        interfaceC1190In1.j(this.a, 0, 10);
        interfaceC1190In1.zzj();
        byte[] bArr = this.a;
        int[] iArr = AbstractC3810cn1.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
