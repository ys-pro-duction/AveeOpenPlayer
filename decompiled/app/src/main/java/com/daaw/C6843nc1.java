package com.daaw;

import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.nc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6843nc1 extends AbstractC9089ve {
    public final Object i;

    public C6843nc1(C8530tf0 c8530tf0) {
        this(c8530tf0, null);
    }

    @Override // com.daaw.AbstractC9089ve
    public float c() {
        return 1.0f;
    }

    @Override // com.daaw.AbstractC9089ve
    public Object h() {
        C8530tf0 c8530tf0 = this.e;
        Object obj = this.i;
        return c8530tf0.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // com.daaw.AbstractC9089ve
    public Object i(Y70 y70, float f) {
        return h();
    }

    @Override // com.daaw.AbstractC9089ve
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override // com.daaw.AbstractC9089ve
    public void m(float f) {
        this.d = f;
    }

    public C6843nc1(C8530tf0 c8530tf0, Object obj) {
        super(Collections.EMPTY_LIST);
        n(c8530tf0);
        this.i = obj;
    }
}
