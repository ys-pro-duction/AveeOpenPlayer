package com.daaw;

import android.graphics.PointF;
import com.daaw.AbstractC9089ve;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.vV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9050vV0 extends AbstractC9089ve {
    public final PointF i;
    public final PointF j;
    public final AbstractC9089ve k;
    public final AbstractC9089ve l;
    public C8530tf0 m;
    public C8530tf0 n;

    public C9050vV0(AbstractC9089ve abstractC9089ve, AbstractC9089ve abstractC9089ve2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = abstractC9089ve;
        this.l = abstractC9089ve2;
        m(f());
    }

    @Override // com.daaw.AbstractC9089ve
    public void m(float f) {
        this.k.m(f);
        this.l.m(f);
        this.i.set(((Float) this.k.h()).floatValue(), ((Float) this.l.h()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((AbstractC9089ve.b) this.a.get(i)).a();
        }
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(Y70 y70, float f) {
        float f2;
        Float f3;
        Y70 y70B;
        Y70 y70B2;
        Float f4 = null;
        if (this.m == null || (y70B2 = this.k.b()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fD = this.k.d();
            Float f5 = y70B2.h;
            C8530tf0 c8530tf0 = this.m;
            float f6 = y70B2.g;
            f2 = f;
            f3 = (Float) c8530tf0.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) y70B2.b, (Float) y70B2.c, f, f, fD);
        }
        if (this.n != null && (y70B = this.l.b()) != null) {
            float fD2 = this.l.d();
            Float f7 = y70B.h;
            C8530tf0 c8530tf02 = this.n;
            float f8 = y70B.g;
            f4 = (Float) c8530tf02.b(f8, f7 == null ? f8 : f7.floatValue(), (Float) y70B.b, (Float) y70B.c, f2, f2, fD2);
        }
        if (f3 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.j;
    }

    public void r(C8530tf0 c8530tf0) {
        C8530tf0 c8530tf02 = this.m;
        if (c8530tf02 != null) {
            c8530tf02.c(null);
        }
        this.m = c8530tf0;
        if (c8530tf0 != null) {
            c8530tf0.c(this);
        }
    }

    public void s(C8530tf0 c8530tf0) {
        C8530tf0 c8530tf02 = this.n;
        if (c8530tf02 != null) {
            c8530tf02.c(null);
        }
        this.n = c8530tf0;
        if (c8530tf0 != null) {
            c8530tf0.c(this);
        }
    }
}
