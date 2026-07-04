package com.daaw;

/* JADX INFO: renamed from: com.daaw.e51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4173e51 {
    public final int a;
    public final XH0[] b;
    public final C3338b51 c;
    public final Object d;

    public C4173e51(XH0[] xh0Arr, com.google.android.exoplayer2.trackselection.c[] cVarArr, Object obj) {
        this.b = xh0Arr;
        this.c = new C3338b51(cVarArr);
        this.d = obj;
        this.a = xh0Arr.length;
    }

    public boolean a(C4173e51 c4173e51) {
        if (c4173e51 == null || c4173e51.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!b(c4173e51, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(C4173e51 c4173e51, int i) {
        return c4173e51 != null && AbstractC6280lb1.b(this.b[i], c4173e51.b[i]) && AbstractC6280lb1.b(this.c.a(i), c4173e51.c.a(i));
    }

    public boolean c(int i) {
        return this.b[i] != null;
    }
}
