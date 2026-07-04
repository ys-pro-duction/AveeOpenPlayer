package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class N00 extends Z70 {
    public N00(List list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(Y70 y70, float f) {
        float f2;
        if (y70.b == null || y70.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 != null) {
            f2 = f;
            Integer num = (Integer) c8530tf0.b(y70.g, y70.h.floatValue(), (Integer) y70.b, (Integer) y70.c, f2, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return AbstractC9678xk0.j(y70.g(), y70.d(), f2);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(Y70 y70, float f) {
        return Integer.valueOf(q(y70, f));
    }
}
