package com.daaw;

import android.util.SparseArray;
import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6389ly implements InterfaceC8103s61.c {
    public final int a;
    public final List b;

    public C6389ly(int i) {
        this(i, Collections.EMPTY_LIST);
    }

    @Override // com.daaw.InterfaceC8103s61.c
    public InterfaceC8103s61 a(int i, InterfaceC8103s61.b bVar) {
        if (i == 2) {
            return new C7769qu0(new C8480tU());
        }
        if (i == 3 || i == 4) {
            return new C7769qu0(new C1389Kl0(bVar.b));
        }
        if (i == 15) {
            if (d(2)) {
                return null;
            }
            return new C7769qu0(new C7807r3(false, bVar.b));
        }
        if (i == 17) {
            if (d(2)) {
                return null;
            }
            return new C7769qu0(new C5039h90(bVar.b));
        }
        if (i == 21) {
            return new C7769qu0(new QX());
        }
        if (i == 27) {
            if (d(4)) {
                return null;
            }
            return new C7769qu0(new C8759uU(c(bVar), d(1), d(8)));
        }
        if (i == 36) {
            return new C7769qu0(new C9045vU(c(bVar)));
        }
        if (i == 89) {
            return new C7769qu0(new UE(bVar.c));
        }
        if (i != 138) {
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (d(16)) {
                            return null;
                        }
                        return new C9022vO0(new C8764uV0());
                    }
                    if (i != 135) {
                        return null;
                    }
                }
            }
            return new C7769qu0(new C4430f1(bVar.b));
        }
        return new C7769qu0(new HE(bVar.b));
    }

    @Override // com.daaw.InterfaceC8103s61.c
    public SparseArray b() {
        return new SparseArray();
    }

    public final C4825gP0 c(InterfaceC8103s61.b bVar) {
        String str;
        int i;
        if (d(32)) {
            return new C4825gP0(this.b);
        }
        C2584Vs0 c2584Vs0 = new C2584Vs0(bVar.d);
        List arrayList = this.b;
        while (c2584Vs0.a() > 0) {
            int iX = c2584Vs0.x();
            int iC = c2584Vs0.c() + c2584Vs0.x();
            if (iX == 134) {
                arrayList = new ArrayList();
                int iX2 = c2584Vs0.x() & 31;
                for (int i2 = 0; i2 < iX2; i2++) {
                    String strU = c2584Vs0.u(3);
                    int iX3 = c2584Vs0.x();
                    if ((iX3 & 128) != 0) {
                        str = "application/cea-708";
                        i = iX3 & 63;
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    arrayList.add(Format.u(null, str, null, -1, 0, strU, i, null));
                    c2584Vs0.K(2);
                }
            }
            c2584Vs0.J(iC);
        }
        return new C4825gP0(arrayList);
    }

    public final boolean d(int i) {
        return (i & this.a) != 0;
    }

    public C6389ly(int i, List list) {
        this.a = i;
        if (!d(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.s(null, "application/cea-608", 0, null));
        }
        this.b = list;
    }
}
