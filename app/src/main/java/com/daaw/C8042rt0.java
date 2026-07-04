package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8042rt0 extends Z70 {
    public final PointF i;
    public final float[] j;
    public final PathMeasure k;
    public C7764qt0 l;

    public C8042rt0(List list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(Y70 y70, float f) {
        float f2;
        C7764qt0 c7764qt0 = (C7764qt0) y70;
        Path pathJ = c7764qt0.j();
        if (pathJ == null) {
            return (PointF) y70.b;
        }
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 != null) {
            f2 = f;
            PointF pointF = (PointF) c8530tf0.b(c7764qt0.g, c7764qt0.h.floatValue(), (PointF) c7764qt0.b, (PointF) c7764qt0.c, e(), f2, f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.l != c7764qt0) {
            this.k.setPath(pathJ, false);
            this.l = c7764qt0;
        }
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
