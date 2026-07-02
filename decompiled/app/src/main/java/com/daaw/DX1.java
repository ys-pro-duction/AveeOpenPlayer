package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class DX1 {
    public final C1198Ip1 a = new C1198Ip1();

    public final DX1 a(int i) {
        this.a.a(i);
        return this;
    }

    public final DX1 b(PY1 py1) {
        C1617Mq1 c1617Mq1 = py1.a;
        for (int i = 0; i < c1617Mq1.b(); i++) {
            this.a.a(c1617Mq1.a(i));
        }
        return this;
    }

    public final DX1 c(int... iArr) {
        for (int i = 0; i < 19; i++) {
            this.a.a(iArr[i]);
        }
        return this;
    }

    public final DX1 d(int i, boolean z) {
        if (z) {
            this.a.a(i);
        }
        return this;
    }

    public final PY1 e() {
        return new PY1(this.a.b(), null);
    }
}
