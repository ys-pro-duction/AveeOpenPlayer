package com.daaw;

import com.daaw.CO0;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class U3 implements InterfaceC8715uJ {
    public static final int[] j;
    public static final int m;
    public final byte[] a = new byte[1];
    public boolean b;
    public long c;
    public int d;
    public int e;
    public Z41 f;
    public boolean g;
    public static final InterfaceC10117zJ h = new a();
    public static final int[] i = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] k = AbstractC6280lb1.D("#!AMR\n");
    public static final byte[] l = AbstractC6280lb1.D("#!AMR-WB\n");

    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new U3()};
        }
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        j = iArr;
        m = iArr[8];
    }

    public final int b(int i2) throws C3000Zs0 {
        if (g(i2)) {
            return this.b ? j[i2] : i[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw new C3000Zs0(sb.toString());
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return l(interfaceC9001vJ);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        if (interfaceC9001vJ.getPosition() == 0 && !l(interfaceC9001vJ)) {
            throw new C3000Zs0("Could not find AMR header.");
        }
        j();
        return n(interfaceC9001vJ);
    }

    public final boolean e(int i2) {
        if (this.b) {
            return false;
        }
        return i2 < 12 || i2 > 14;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j2, long j3) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    public final boolean g(int i2) {
        if (i2 < 0 || i2 > 15) {
            return false;
        }
        return h(i2) || e(i2);
    }

    public final boolean h(int i2) {
        if (this.b) {
            return i2 < 10 || i2 > 13;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
        this.f = interfaceC9838yJ.a(0, 1);
        interfaceC9838yJ.n();
    }

    public final void j() {
        if (this.g) {
            return;
        }
        this.g = true;
        boolean z = this.b;
        this.f.d(Format.j(null, z ? "audio/amr-wb" : "audio/3gpp", null, -1, m, 1, z ? 16000 : 8000, -1, null, null, 0, null));
    }

    public final boolean k(InterfaceC9001vJ interfaceC9001vJ, byte[] bArr) {
        interfaceC9001vJ.i();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC9001vJ.k(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final boolean l(InterfaceC9001vJ interfaceC9001vJ) {
        byte[] bArr = k;
        if (k(interfaceC9001vJ, bArr)) {
            this.b = false;
            interfaceC9001vJ.j(bArr.length);
            return true;
        }
        byte[] bArr2 = l;
        if (!k(interfaceC9001vJ, bArr2)) {
            return false;
        }
        this.b = true;
        interfaceC9001vJ.j(bArr2.length);
        return true;
    }

    public final int m(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        interfaceC9001vJ.i();
        interfaceC9001vJ.k(this.a, 0, 1);
        byte b = this.a[0];
        if ((b & 131) <= 0) {
            return b((b >> 3) & 15);
        }
        throw new C3000Zs0("Invalid padding bits for frame header " + ((int) b));
    }

    public final int n(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        if (this.e == 0) {
            try {
                int iM = m(interfaceC9001vJ);
                this.d = iM;
                this.e = iM;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.f.b(interfaceC9001vJ, this.e, true);
        if (iB == -1) {
            return -1;
        }
        int i2 = this.e - iB;
        this.e = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f.a(this.c, 1, this.d, 0, null);
        this.c += 20000;
        return 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
