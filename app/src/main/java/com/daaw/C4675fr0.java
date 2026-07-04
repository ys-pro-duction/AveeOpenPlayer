package com.daaw;

import com.daaw.VX0;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4675fr0 extends VX0 {
    public static final int o = AbstractC6280lb1.v("Opus");
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    public static boolean n(C2584Vs0 c2584Vs0) {
        int iA = c2584Vs0.a();
        byte[] bArr = p;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c2584Vs0.g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.VX0
    public long e(C2584Vs0 c2584Vs0) {
        return b(l(c2584Vs0.a));
    }

    @Override // com.daaw.VX0
    public boolean h(C2584Vs0 c2584Vs0, long j, VX0.b bVar) {
        if (this.n) {
            boolean z = c2584Vs0.i() == o;
            c2584Vs0.J(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(c2584Vs0.a, c2584Vs0.d());
        int i = bArrCopyOf[9] & 255;
        int i2 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArrCopyOf);
        m(arrayList, i2);
        m(arrayList, 3840);
        bVar.a = Format.k(null, "audio/opus", null, -1, -1, i, 48000, arrayList, null, 0, null);
        this.n = true;
        return true;
    }

    @Override // com.daaw.VX0
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = false;
        }
    }

    public final long l(byte[] bArr) {
        int i;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i4 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    public final void m(List list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
