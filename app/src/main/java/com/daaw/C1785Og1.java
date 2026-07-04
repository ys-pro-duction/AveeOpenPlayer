package com.daaw;

import android.text.TextUtils;
import com.daaw.C1577Mg1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Og1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1785Og1 extends US0 {
    public final C1681Ng1 o;
    public final C2584Vs0 p;
    public final C1577Mg1.b q;
    public final C1320Ju r;
    public final List s;

    public C1785Og1() {
        super("WebvttDecoder");
        this.o = new C1681Ng1();
        this.p = new C2584Vs0();
        this.q = new C1577Mg1.b();
        this.r = new C1320Ju();
        this.s = new ArrayList();
    }

    public static int D(C2584Vs0 c2584Vs0) {
        int i = -1;
        int iC = 0;
        while (i == -1) {
            iC = c2584Vs0.c();
            String strK = c2584Vs0.k();
            i = strK == null ? 0 : "STYLE".equals(strK) ? 2 : "NOTE".startsWith(strK) ? 1 : 3;
        }
        c2584Vs0.J(iC);
        return i;
    }

    public static void E(C2584Vs0 c2584Vs0) {
        while (!TextUtils.isEmpty(c2584Vs0.k())) {
        }
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C2119Rg1 z(byte[] bArr, int i, boolean z) throws C7107oZ0 {
        this.p.H(bArr, i);
        this.q.c();
        this.s.clear();
        AbstractC2015Qg1.d(this.p);
        while (!TextUtils.isEmpty(this.p.k())) {
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int iD = D(this.p);
            if (iD == 0) {
                return new C2119Rg1(arrayList);
            }
            if (iD == 1) {
                E(this.p);
            } else if (iD == 2) {
                if (!arrayList.isEmpty()) {
                    throw new C7107oZ0("A style block was found after the first cue.");
                }
                this.p.k();
                C1474Lg1 c1474Lg1D = this.r.d(this.p);
                if (c1474Lg1D != null) {
                    this.s.add(c1474Lg1D);
                }
            } else if (iD == 3 && this.o.h(this.p, this.q, this.s)) {
                arrayList.add(this.q.a());
                this.q.c();
            }
        }
    }
}
