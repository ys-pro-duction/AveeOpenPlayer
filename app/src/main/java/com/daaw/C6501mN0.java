package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.mN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6501mN0 extends Z70 {
    public final C6780nN0 i;

    public C6501mN0(List list) {
        super(list);
        this.i = new C6780nN0();
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C6780nN0 i(Y70 y70, float f) {
        Object obj;
        float f2;
        Object obj2 = y70.b;
        if (obj2 == null || (obj = y70.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C6780nN0 c6780nN0 = (C6780nN0) obj2;
        C6780nN0 c6780nN02 = (C6780nN0) obj;
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 != null) {
            f2 = f;
            C6780nN0 c6780nN03 = (C6780nN0) c8530tf0.b(y70.g, y70.h.floatValue(), c6780nN0, c6780nN02, f2, e(), f());
            if (c6780nN03 != null) {
                return c6780nN03;
            }
        } else {
            f2 = f;
        }
        this.i.d(AbstractC9678xk0.i(c6780nN0.b(), c6780nN02.b(), f2), AbstractC9678xk0.i(c6780nN0.c(), c6780nN02.c(), f2));
        return this.i;
    }
}
