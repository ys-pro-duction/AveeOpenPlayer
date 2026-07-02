package com.daaw;

import android.graphics.Path;
import android.graphics.PointF;
import com.daaw.AbstractC9089ve;
import com.daaw.BR0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SF implements InterfaceC6648mt0, AbstractC9089ve.b, U70 {
    public final String b;
    public final C4615ff0 c;
    public final AbstractC9089ve d;
    public final AbstractC9089ve e;
    public final C2655Wk f;
    public boolean h;
    public final Path a = new Path();
    public final C2571Vp g = new C2571Vp();

    public SF(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C2655Wk c2655Wk) {
        this.b = c2655Wk.b();
        this.c = c4615ff0;
        AbstractC9089ve abstractC9089veH = c2655Wk.d().h();
        this.d = abstractC9089veH;
        AbstractC9089ve abstractC9089veH2 = c2655Wk.c().h();
        this.e = abstractC9089veH2;
        this.f = c2655Wk;
        abstractC9647xe.j(abstractC9089veH);
        abstractC9647xe.j(abstractC9089veH2);
        abstractC9089veH.a(this);
        abstractC9089veH2.a(this);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        f();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) list.get(i);
            if (interfaceC2371Tr instanceof C4178e61) {
                C4178e61 c4178e61 = (C4178e61) interfaceC2371Tr;
                if (c4178e61.k() == BR0.a.SIMULTANEOUSLY) {
                    this.g.a(c4178e61);
                    c4178e61.c(this);
                }
            }
        }
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        if (obj == InterfaceC7136of0.k) {
            this.d.n(c8530tf0);
        } else if (obj == InterfaceC7136of0.n) {
            this.e.n(c8530tf0);
        }
    }

    public final void f() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public String getName() {
        return this.b;
    }

    @Override // com.daaw.T70
    public void h(S70 s70, int i, List list, S70 s702) {
        AbstractC9678xk0.k(s70, i, list, s702, this);
    }

    @Override // com.daaw.InterfaceC6648mt0
    public Path i() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.h();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
