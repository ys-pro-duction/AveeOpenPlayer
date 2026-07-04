package com.daaw;

import android.util.Pair;
import com.daaw.V01;
import com.google.android.exoplayer2.Format;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3475bc extends V01 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public C3475bc(Z41 z41) {
        super(z41);
    }

    @Override // com.daaw.V01
    public boolean b(C2584Vs0 c2584Vs0) throws V01.a {
        if (this.b) {
            c2584Vs0.K(1);
        } else {
            int iX = c2584Vs0.x();
            int i = (iX >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.d(Format.k(null, "audio/mpeg", null, -1, -1, 1, e[(iX >> 2) & 3], null, null, 0, null));
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.a.d(Format.j(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (iX & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.c = true;
            } else if (i != 10) {
                throw new V01.a("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    @Override // com.daaw.V01
    public void c(C2584Vs0 c2584Vs0, long j) {
        if (this.d == 2) {
            int iA = c2584Vs0.a();
            this.a.c(c2584Vs0, iA);
            this.a.a(j, 1, iA, 0, null);
            return;
        }
        int iX = c2584Vs0.x();
        if (iX != 0 || this.c) {
            if (this.d != 10 || iX == 1) {
                int iA2 = c2584Vs0.a();
                this.a.c(c2584Vs0, iA2);
                this.a.a(j, 1, iA2, 0, null);
                return;
            }
            return;
        }
        int iA3 = c2584Vs0.a();
        byte[] bArr = new byte[iA3];
        c2584Vs0.g(bArr, 0, iA3);
        Pair pairI = AbstractC9129vm.i(bArr);
        this.a.d(Format.k(null, "audio/mp4a-latm", null, -1, -1, ((Integer) pairI.second).intValue(), ((Integer) pairI.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.c = true;
    }
}
