package com.daaw;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Wd3 implements Hi3 {
    public final Vd3 a;

    public Wd3(Vd3 vd3) {
        Charset charset = AbstractC10214zf3.a;
        this.a = vd3;
        vd3.a = this;
    }

    public static Wd3 J(Vd3 vd3) {
        Wd3 wd3 = vd3.a;
        return wd3 != null ? wd3 : new Wd3(vd3);
    }

    @Override // com.daaw.Hi3
    public final void A(int i, List list) {
        int i2 = 0;
        if (!(list instanceof Rf3)) {
            while (i2 < list.size()) {
                this.a.o(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        Rf3 rf3 = (Rf3) list;
        while (i2 < list.size()) {
            Object objD = rf3.d(i2);
            if (objD instanceof String) {
                this.a.o(i, (String) objD);
            } else {
                this.a.g(i, (AbstractC9646xd3) objD);
            }
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void B(int i, Object obj, InterfaceC4907gh3 interfaceC4907gh3) {
        Vd3 vd3 = this.a;
        vd3.p(i, 3);
        interfaceC4907gh3.f((Kg3) obj, vd3.a);
        vd3.p(i, 4);
    }

    @Override // com.daaw.Hi3
    public final void C(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                Vd3 vd3 = this.a;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                vd3.q(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iY += Vd3.y((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.a.r(iY);
        while (i2 < list.size()) {
            Vd3 vd32 = this.a;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            vd32.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += Vd3.z(((Long) list.get(i3)).longValue());
        }
        this.a.r(iZ);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void E(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void F(int i, long j) {
        this.a.s(i, j);
    }

    @Override // com.daaw.Hi3
    public final void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                Vd3 vd3 = this.a;
                long jLongValue = ((Long) list.get(i2)).longValue();
                vd3.s(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZ += Vd3.z((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.r(iZ);
        while (i2 < list.size()) {
            Vd3 vd32 = this.a;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            vd32.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void H(int i, Object obj, InterfaceC4907gh3 interfaceC4907gh3) throws Pd3 {
        Kg3 kg3 = (Kg3) obj;
        Md3 md3 = (Md3) this.a;
        md3.r((i << 3) | 2);
        md3.r(((AbstractC8797uc3) kg3).a(interfaceC4907gh3));
        interfaceC4907gh3.f(kg3, md3.a);
    }

    @Override // com.daaw.Hi3
    public final void I(int i, long j) {
        this.a.s(i, (j >> 63) ^ (j + j));
    }

    @Override // com.daaw.Hi3
    public final void a(int i, long j) {
        this.a.j(i, j);
    }

    @Override // com.daaw.Hi3
    public final void b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.g(i, (AbstractC9646xd3) list.get(i2));
        }
    }

    @Override // com.daaw.Hi3
    public final void c(int i, int i2) {
        this.a.h(i, i2);
    }

    @Override // com.daaw.Hi3
    public final void d(int i, boolean z) {
        this.a.f(i, z);
    }

    @Override // com.daaw.Hi3
    public final void e(int i, long j) {
        this.a.s(i, j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.Hi3
    public final void f(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.f(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void g(int i) {
        this.a.p(i, 4);
    }

    @Override // com.daaw.Hi3
    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV += Vd3.v(((Integer) list.get(i3)).intValue());
        }
        this.a.r(iV);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void j(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // com.daaw.Hi3
    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iV = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV += Vd3.v(((Integer) list.get(i3)).intValue());
        }
        this.a.r(iV);
        while (i2 < list.size()) {
            this.a.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void l(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // com.daaw.Hi3
    public final void m(int i, double d) {
        this.a.j(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.daaw.Hi3
    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void o(int i, int i2) {
        this.a.h(i, i2);
    }

    @Override // com.daaw.Hi3
    public final void p(int i, float f) {
        this.a.h(i, Float.floatToRawIntBits(f));
    }

    @Override // com.daaw.Hi3
    public final void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += Vd3.z(((Long) list.get(i3)).longValue());
        }
        this.a.r(iZ);
        while (i2 < list.size()) {
            this.a.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void s(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void t(int i, int i2) {
        this.a.q(i, i2);
    }

    @Override // com.daaw.Hi3
    public final void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.r(i3);
        while (i2 < list.size()) {
            this.a.k(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void v(int i, int i2) {
        this.a.q(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.daaw.Hi3
    public final void w(int i, String str) {
        this.a.o(i, str);
    }

    @Override // com.daaw.Hi3
    public final void x(int i, long j) {
        this.a.j(i, j);
    }

    @Override // com.daaw.Hi3
    public final void y(int i, AbstractC9646xd3 abstractC9646xd3) {
        this.a.g(i, abstractC9646xd3);
    }

    @Override // com.daaw.Hi3
    public final void z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.p(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += Vd3.y(((Integer) list.get(i3)).intValue());
        }
        this.a.r(iY);
        while (i2 < list.size()) {
            this.a.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.Hi3
    public final void zzE(int i) {
        this.a.p(i, 3);
    }
}
