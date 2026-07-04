package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8748uR0 extends AbstractC9647xe {
    public final C3276as D;
    public final C1923Pp E;

    public C8748uR0(C4615ff0 c4615ff0, C5595j90 c5595j90, C1923Pp c1923Pp) {
        super(c4615ff0, c5595j90);
        this.E = c1923Pp;
        C3276as c3276as = new C3276as(c4615ff0, this, new C7911rR0("__container", c5595j90.n(), false));
        this.D = c3276as;
        List list = Collections.EMPTY_LIST;
        c3276as.b(list, list);
    }

    @Override // com.daaw.AbstractC9647xe
    public void H(S70 s70, int i, List list, S70 s702) {
        this.D.h(s70, i, list, s702);
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.e(rectF, this.o, z);
    }

    @Override // com.daaw.AbstractC9647xe
    public void u(Canvas canvas, Matrix matrix, int i) {
        this.D.g(canvas, matrix, i);
    }

    @Override // com.daaw.AbstractC9647xe
    public C5177hg w() {
        C5177hg c5177hgW = super.w();
        return c5177hgW != null ? c5177hgW : this.E.w();
    }

    @Override // com.daaw.AbstractC9647xe
    public C8416tE y() {
        C8416tE c8416tEY = super.y();
        return c8416tEY != null ? c8416tEY : this.E.y();
    }
}
