package com.daaw;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3016Zw0 extends Z70 {
    public final PointF i;

    public C3016Zw0(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(Y70 y70, float f) {
        return j(y70, f, f, f);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(Y70 y70, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = y70.b;
        if (obj2 == null || (obj = y70.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 != null && (pointF = (PointF) c8530tf0.b(y70.g, y70.h.floatValue(), pointF2, pointF3, f, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.i;
        float f4 = pointF2.x;
        float f5 = f4 + (f2 * (pointF3.x - f4));
        float f6 = pointF2.y;
        pointF4.set(f5, f6 + (f3 * (pointF3.y - f6)));
        return this.i;
    }
}
