package com.daaw;

/* JADX INFO: renamed from: com.daaw.jZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5704jZ1 {
    public CX1 a;
    public C4717g02 b;
    public C3674cI2 c;
    public C8074s02 d;
    public C6196lG2 e;

    public /* synthetic */ C5704jZ1(AbstractC5424iZ1 abstractC5424iZ1) {
    }

    public final AbstractC10175zX1 a() {
        AbstractC7000o83.c(this.a, CX1.class);
        AbstractC7000o83.c(this.b, C4717g02.class);
        if (this.c == null) {
            this.c = new C3674cI2();
        }
        if (this.d == null) {
            this.d = new C8074s02();
        }
        if (this.e == null) {
            this.e = new C6196lG2();
        }
        return new HY1(this.a, this.b, this.c, this.d, this.e, null);
    }

    public final C5704jZ1 b(CX1 cx1) {
        this.a = cx1;
        return this;
    }

    public final C5704jZ1 c(C4717g02 c4717g02) {
        this.b = c4717g02;
        return this;
    }
}
