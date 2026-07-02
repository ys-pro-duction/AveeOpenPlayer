package com.daaw;

import com.daaw.CO0;
import com.daaw.VX0;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class QM extends VX0 {
    public RM n;
    public a o;

    public static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(C2584Vs0 c2584Vs0) {
        return c2584Vs0.a() >= 5 && c2584Vs0.x() == 127 && c2584Vs0.z() == 1179402563;
    }

    @Override // com.daaw.VX0
    public long e(C2584Vs0 c2584Vs0) {
        if (n(c2584Vs0.a)) {
            return m(c2584Vs0);
        }
        return -1L;
    }

    @Override // com.daaw.VX0
    public boolean h(C2584Vs0 c2584Vs0, long j, VX0.b bVar) {
        byte[] bArr = c2584Vs0.a;
        if (this.n == null) {
            this.n = new RM(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c2584Vs0.d());
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            int iA = this.n.a();
            RM rm = this.n;
            bVar.a = Format.k(null, "audio/flac", null, -1, iA, rm.f, rm.e, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            a aVar = new a();
            this.o = aVar;
            aVar.f(c2584Vs0);
            return true;
        }
        if (!n(bArr)) {
            return true;
        }
        a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.i(j);
            bVar.b = this.o;
        }
        return false;
    }

    @Override // com.daaw.VX0
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    public final int m(C2584Vs0 c2584Vs0) {
        int i;
        int i2;
        int i3 = (c2584Vs0.a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                c2584Vs0.K(4);
                c2584Vs0.E();
                int iX = i3 == 6 ? c2584Vs0.x() : c2584Vs0.D();
                c2584Vs0.J(0);
                return iX + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i3 - 8;
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    public class a implements InterfaceC1093Hp0, CO0 {
        public long[] a;
        public long[] b;
        public long c = -1;
        public long d = -1;

        public a() {
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public long a(InterfaceC9001vJ interfaceC9001vJ) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public long d(long j) {
            long jB = QM.this.b(j);
            this.d = this.a[AbstractC6280lb1.e(this.a, jB, true, true)];
            return jB;
        }

        @Override // com.daaw.CO0
        public boolean e() {
            return true;
        }

        public void f(C2584Vs0 c2584Vs0) {
            c2584Vs0.K(1);
            int iA = c2584Vs0.A() / 18;
            this.a = new long[iA];
            this.b = new long[iA];
            for (int i = 0; i < iA; i++) {
                this.a[i] = c2584Vs0.q();
                this.b[i] = c2584Vs0.q();
                c2584Vs0.K(2);
            }
        }

        @Override // com.daaw.CO0
        public CO0.a g(long j) {
            int iE = AbstractC6280lb1.e(this.a, QM.this.b(j), true, true);
            long jA = QM.this.a(this.a[iE]);
            EO0 eo0 = new EO0(jA, this.c + this.b[iE]);
            if (jA < j) {
                long[] jArr = this.a;
                if (iE != jArr.length - 1) {
                    int i = iE + 1;
                    return new CO0.a(eo0, new EO0(QM.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new CO0.a(eo0);
        }

        @Override // com.daaw.CO0
        public long h() {
            return QM.this.n.b();
        }

        public void i(long j) {
            this.c = j;
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public CO0 c() {
            return this;
        }
    }
}
