package com.daaw;

import com.daaw.C1577Mg1;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.Hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1077Hl0 extends US0 {
    public static final int q = AbstractC6280lb1.v("payl");
    public static final int r = AbstractC6280lb1.v("sttg");
    public static final int s = AbstractC6280lb1.v("vttc");
    public final C2584Vs0 o;
    public final C1577Mg1.b p;

    public C1077Hl0() {
        super("Mp4WebvttDecoder");
        this.o = new C2584Vs0();
        this.p = new C1577Mg1.b();
    }

    public static C1631Mu D(C2584Vs0 c2584Vs0, C1577Mg1.b bVar, int i) throws C7107oZ0 {
        bVar.c();
        while (i > 0) {
            if (i < 8) {
                throw new C7107oZ0("Incomplete vtt cue box header found.");
            }
            int i2 = c2584Vs0.i();
            int i3 = c2584Vs0.i();
            int i4 = i2 - 8;
            String strQ = AbstractC6280lb1.q(c2584Vs0.a, c2584Vs0.c(), i4);
            c2584Vs0.K(i4);
            i = (i - 8) - i4;
            if (i3 == r) {
                C1681Ng1.j(strQ, bVar);
            } else if (i3 == q) {
                C1681Ng1.k(null, strQ.trim(), bVar, Collections.EMPTY_LIST);
            }
        }
        return bVar.a();
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C1181Il0 z(byte[] bArr, int i, boolean z) throws C7107oZ0 {
        this.o.H(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() < 8) {
                throw new C7107oZ0("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i2 = this.o.i();
            if (this.o.i() == s) {
                arrayList.add(D(this.o, this.p, i2 - 8));
            } else {
                this.o.K(i2 - 8);
            }
        }
        return new C1181Il0(arrayList);
    }
}
