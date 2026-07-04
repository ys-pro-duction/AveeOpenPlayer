package com.daaw;

import android.graphics.Path;
import android.graphics.PointF;
import com.daaw.AbstractC9089ve;
import com.daaw.BR0;
import com.daaw.C0596Cx0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Bx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0492Bx0 implements InterfaceC6648mt0, AbstractC9089ve.b, U70 {
    public final String b;
    public final C4615ff0 c;
    public final C0596Cx0.a d;
    public final boolean e;
    public final boolean f;
    public final AbstractC9089ve g;
    public final AbstractC9089ve h;
    public final AbstractC9089ve i;
    public final AbstractC9089ve j;
    public final AbstractC9089ve k;
    public final AbstractC9089ve l;
    public final AbstractC9089ve m;
    public boolean o;
    public final Path a = new Path();
    public final C2571Vp n = new C2571Vp();

    /* JADX INFO: renamed from: com.daaw.Bx0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C0596Cx0.a.values().length];
            a = iArr;
            try {
                iArr[C0596Cx0.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C0596Cx0.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C0492Bx0(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe, C0596Cx0 c0596Cx0) {
        this.c = c4615ff0;
        this.b = c0596Cx0.d();
        C0596Cx0.a aVarJ = c0596Cx0.j();
        this.d = aVarJ;
        this.e = c0596Cx0.k();
        this.f = c0596Cx0.l();
        AbstractC9089ve abstractC9089veH = c0596Cx0.g().h();
        this.g = abstractC9089veH;
        AbstractC9089ve abstractC9089veH2 = c0596Cx0.h().h();
        this.h = abstractC9089veH2;
        AbstractC9089ve abstractC9089veH3 = c0596Cx0.i().h();
        this.i = abstractC9089veH3;
        AbstractC9089ve abstractC9089veH4 = c0596Cx0.e().h();
        this.k = abstractC9089veH4;
        AbstractC9089ve abstractC9089veH5 = c0596Cx0.f().h();
        this.m = abstractC9089veH5;
        C0596Cx0.a aVar = C0596Cx0.a.STAR;
        if (aVarJ == aVar) {
            this.j = c0596Cx0.b().h();
            this.l = c0596Cx0.c().h();
        } else {
            this.j = null;
            this.l = null;
        }
        abstractC9647xe.j(abstractC9089veH);
        abstractC9647xe.j(abstractC9089veH2);
        abstractC9647xe.j(abstractC9089veH3);
        abstractC9647xe.j(abstractC9089veH4);
        abstractC9647xe.j(abstractC9089veH5);
        if (aVarJ == aVar) {
            abstractC9647xe.j(this.j);
            abstractC9647xe.j(this.l);
        }
        abstractC9089veH.a(this);
        abstractC9089veH2.a(this);
        abstractC9089veH3.a(this);
        abstractC9089veH4.a(this);
        abstractC9089veH5.a(this);
        if (aVarJ == aVar) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    private void k() {
        this.o = false;
        this.c.invalidateSelf();
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        k();
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2371Tr interfaceC2371Tr = (InterfaceC2371Tr) list.get(i);
            if (interfaceC2371Tr instanceof C4178e61) {
                C4178e61 c4178e61 = (C4178e61) interfaceC2371Tr;
                if (c4178e61.k() == BR0.a.SIMULTANEOUSLY) {
                    this.n.a(c4178e61);
                    c4178e61.c(this);
                }
            }
        }
    }

    @Override // com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        AbstractC9089ve abstractC9089ve;
        AbstractC9089ve abstractC9089ve2;
        if (obj == InterfaceC7136of0.w) {
            this.g.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.x) {
            this.i.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.n) {
            this.h.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.y && (abstractC9089ve2 = this.j) != null) {
            abstractC9089ve2.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.z) {
            this.k.n(c8530tf0);
            return;
        }
        if (obj == InterfaceC7136of0.A && (abstractC9089ve = this.l) != null) {
            abstractC9089ve.n(c8530tf0);
        } else if (obj == InterfaceC7136of0.B) {
            this.m.n(c8530tf0);
        }
    }

    public final void f() {
        double d;
        int iFloor = (int) Math.floor(((Float) this.g.h()).floatValue());
        double radians = Math.toRadians((this.i == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d2 = iFloor;
        float fFloatValue = ((Float) this.m.h()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.k.h()).floatValue();
        double d3 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d3);
        float fSin = (float) (Math.sin(radians) * d3);
        this.a.moveTo(fCos, fSin);
        double d4 = (float) (6.283185307179586d / d2);
        double d5 = radians + d4;
        double dCeil = Math.ceil(d2);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (Math.cos(d5) * d3);
            int i2 = i;
            double d6 = d5;
            float fSin2 = (float) (d3 * Math.sin(d5));
            if (fFloatValue != 0.0f) {
                d = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.a.cubicTo(fCos - (f * fCos3), fSin - (f * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d = dCeil;
                fCos = fCos2;
                this.a.lineTo(fCos, fSin);
            }
            d5 = d6 + d4;
            i = i2 + 1;
            dCeil = d;
        }
        PointF pointF = (PointF) this.h.h();
        this.a.offset(pointF.x, pointF.y);
        this.a.close();
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
        if (this.o) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.o = true;
            return this.a;
        }
        int i = a.a[this.d.ordinal()];
        if (i == 1) {
            j();
        } else if (i == 2) {
            f();
        }
        this.a.close();
        this.n.b(this.a);
        this.o = true;
        return this.a;
    }

    public final void j() {
        int i;
        float f;
        float f2;
        float fCos;
        float fSin;
        float f3;
        float f4;
        double d;
        float f5;
        int i2;
        float f6;
        double d2;
        float f7;
        float f8;
        double d3;
        float f9;
        float f10;
        float fFloatValue = ((Float) this.g.h()).floatValue();
        double radians = Math.toRadians((this.i == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f11 = (float) (6.283185307179586d / d4);
        if (this.f) {
            f11 *= -1.0f;
        }
        float f12 = f11 / 2.0f;
        float f13 = fFloatValue - ((int) fFloatValue);
        int i3 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            radians += (double) ((1.0f - f13) * f12);
        }
        float fFloatValue2 = ((Float) this.k.h()).floatValue();
        float fFloatValue3 = ((Float) this.j.h()).floatValue();
        AbstractC9089ve abstractC9089ve = this.l;
        float fFloatValue4 = abstractC9089ve != null ? ((Float) abstractC9089ve.h()).floatValue() / 100.0f : 0.0f;
        AbstractC9089ve abstractC9089ve2 = this.m;
        float fFloatValue5 = abstractC9089ve2 != null ? ((Float) abstractC9089ve2.h()).floatValue() / 100.0f : 0.0f;
        if (i3 != 0) {
            f5 = ((fFloatValue2 - fFloatValue3) * f13) + fFloatValue3;
            i = i3;
            f = 0.0f;
            double d5 = f5;
            f2 = 2.0f;
            float fCos2 = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.a.moveTo(fCos2, fSin);
            d = radians + ((double) ((f11 * f13) / 2.0f));
            f3 = f13;
            fCos = fCos2;
            f4 = f12;
        } else {
            i = i3;
            f = 0.0f;
            f2 = 2.0f;
            double d6 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d6);
            fSin = (float) (d6 * Math.sin(radians));
            this.a.moveTo(fCos, fSin);
            f3 = f13;
            f4 = f12;
            d = radians + ((double) f4);
            f5 = 0.0f;
        }
        double dCeil = Math.ceil(d4) * 2.0d;
        int i4 = 0;
        boolean z = false;
        double d7 = d;
        float f14 = fSin;
        float f15 = fCos;
        double d8 = d7;
        while (true) {
            double d9 = i4;
            if (d9 >= dCeil) {
                PointF pointF = (PointF) this.h.h();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
                return;
            }
            float f16 = z ? fFloatValue2 : fFloatValue3;
            if (f5 == f || d9 != dCeil - 2.0d) {
                i2 = i4;
                f6 = f4;
            } else {
                i2 = i4;
                f6 = (f11 * f3) / f2;
            }
            if (f5 == f || d9 != dCeil - 1.0d) {
                d2 = d9;
                f7 = f16;
            } else {
                d2 = d9;
                f7 = f5;
            }
            double d10 = f7;
            float fCos3 = (float) (d10 * Math.cos(d8));
            float f17 = f11;
            float fSin2 = (float) (d10 * Math.sin(d8));
            if (fFloatValue4 == f && fFloatValue5 == f) {
                this.a.lineTo(fCos3, fSin2);
                f10 = fCos3;
                f9 = fSin2;
                f8 = f4;
                d3 = d8;
            } else {
                f8 = f4;
                d3 = d8;
                double dAtan2 = (float) (Math.atan2(f14, f15) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f18 = f15;
                float f19 = f14;
                f9 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f20 = z ? fFloatValue4 : fFloatValue5;
                float f21 = z ? fFloatValue5 : fFloatValue4;
                float f22 = (z ? fFloatValue3 : fFloatValue2) * f20 * 0.47829f;
                float f23 = fCos4 * f22;
                float f24 = f22 * fSin3;
                float f25 = (z ? fFloatValue2 : fFloatValue3) * f21 * 0.47829f;
                float f26 = fCos5 * f25;
                float f27 = f25 * fSin4;
                if (i != 0) {
                    if (i2 == 0) {
                        f23 *= f3;
                        f24 *= f3;
                    } else if (d2 == dCeil - 1.0d) {
                        f26 *= f3;
                        f27 *= f3;
                    }
                }
                f10 = fCos3;
                this.a.cubicTo(f18 - f23, f19 - f24, fCos3 + f26, f9 + f27, f10, f9);
            }
            d8 = d3 + ((double) f6);
            z = !z;
            i4 = i2 + 1;
            f4 = f8;
            f15 = f10;
            f14 = f9;
            f11 = f17;
        }
    }
}
