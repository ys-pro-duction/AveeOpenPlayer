package com.daaw;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.AbstractC9089ve;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4217eF0 implements AbstractC9089ve.b, U70, InterfaceC6648mt0 {
    public final String c;
    public final boolean d;
    public final C4615ff0 e;
    public final AbstractC9089ve f;
    public final AbstractC9089ve g;
    public final AbstractC9089ve h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final C2571Vp i = new C2571Vp();
    public AbstractC9089ve j = null;

    public C4217eF0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C4496fF0 c4496fF0) {
        this.c = c4496fF0.c();
        this.d = c4496fF0.f();
        this.e = c4615ff0;
        AbstractC9089ve abstractC9089veH = c4496fF0.d().h();
        this.f = abstractC9089veH;
        AbstractC9089ve abstractC9089veH2 = c4496fF0.e().h();
        this.g = abstractC9089veH2;
        AbstractC9089ve abstractC9089veH3 = c4496fF0.b().h();
        this.h = abstractC9089veH3;
        abstractC9647xe.j(abstractC9089veH);
        abstractC9647xe.j(abstractC9089veH2);
        abstractC9647xe.j(abstractC9089veH3);
        abstractC9089veH.a(this);
        abstractC9089veH2.a(this);
        abstractC9089veH3.a(this);
    }

    private void f() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.daaw.InterfaceC2371Tr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.daaw.Tr r0 = (com.daaw.InterfaceC2371Tr) r0
            boolean r1 = r0 instanceof com.daaw.C4178e61
            if (r1 == 0) goto L25
            r1 = r0
            com.daaw.e61 r1 = (com.daaw.C4178e61) r1
            com.daaw.BR0$a r2 = r1.k()
            com.daaw.BR0$a r3 = com.daaw.BR0.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.daaw.Vp r0 = r4.i
            r0.a(r1)
            r1.c(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.daaw.C5643jK0
            if (r1 == 0) goto L31
            com.daaw.jK0 r0 = (com.daaw.C5643jK0) r0
            com.daaw.ve r0 = r0.h()
            r4.j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4217eF0.b(java.util.List, java.util.List):void");
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        if (obj == InterfaceC7136of0.l) {
            this.g.n(c8530tf0);
        } else if (obj == InterfaceC7136of0.n) {
            this.f.n(c8530tf0);
        } else if (obj == InterfaceC7136of0.m) {
            this.h.n(c8530tf0);
        }
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.c;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        AbstractC9089ve abstractC9089ve;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        AbstractC9089ve abstractC9089ve2 = this.h;
        float fP = abstractC9089ve2 == null ? 0.0f : ((C4248eN) abstractC9089ve2).p();
        if (fP == 0.0f && (abstractC9089ve = this.j) != null) {
            fP = Math.min(((Float) abstractC9089ve.h()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fP > fMin) {
            fP = fMin;
        }
        PointF pointF2 = (PointF) this.f.h();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + fP);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - fP);
        if (fP > 0.0f) {
            RectF rectF = this.b;
            float f3 = pointF2.x;
            float f4 = fP * 2.0f;
            float f5 = pointF2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + fP, pointF2.y + f2);
        if (fP > 0.0f) {
            RectF rectF2 = this.b;
            float f6 = pointF2.x;
            float f7 = pointF2.y;
            float f8 = fP * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + fP);
        if (fP > 0.0f) {
            RectF rectF3 = this.b;
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = fP * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - fP, pointF2.y - f2);
        if (fP > 0.0f) {
            RectF rectF4 = this.b;
            float f12 = pointF2.x;
            float f13 = fP * 2.0f;
            float f14 = pointF2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }
}
