package com.daaw;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: renamed from: com.daaw.qt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7764qt0 extends Y70 {
    public Path q;
    public final Y70 r;

    public C7764qt0(C0737Ee0 c0737Ee0, Y70 y70) {
        super(c0737Ee0, (PointF) y70.b, (PointF) y70.c, y70.d, y70.e, y70.f, y70.g, y70.h);
        this.r = y70;
        i();
    }

    public void i() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = (obj3 == null || (obj2 = this.b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        Y70 y70 = this.r;
        this.q = AbstractC0301Ab1.d((PointF) obj4, (PointF) obj, y70.o, y70.p);
    }

    public Path j() {
        return this.q;
    }
}
