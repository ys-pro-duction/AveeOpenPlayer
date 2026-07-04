package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.eN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4248eN extends Z70 {
    public C4248eN(List list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    public float q(Y70 y70, float f) {
        float f2;
        if (y70.b == null || y70.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 != null) {
            f2 = f;
            Float f3 = (Float) c8530tf0.b(y70.g, y70.h.floatValue(), (Float) y70.b, (Float) y70.c, f2, e(), f());
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        return AbstractC9678xk0.i(y70.f(), y70.c(), f2);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(Y70 y70, float f) {
        return Float.valueOf(q(y70, f));
    }
}
