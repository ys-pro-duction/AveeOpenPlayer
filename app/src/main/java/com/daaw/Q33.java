package com.daaw;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Q33 {
    public final P33 a;

    public Q33(P33 p33) {
        Charset charset = AbstractC8374t43.a;
        this.a = p33;
        p33.a = this;
    }

    public static Q33 l(P33 p33) {
        Q33 q33 = p33.a;
        return q33 != null ? q33 : new Q33(p33);
    }

    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void B(int i, Object obj, InterfaceC7821r53 interfaceC7821r53) {
        P33 p33 = this.a;
        p33.u(i, 3);
        interfaceC7821r53.g((U43) obj, p33.a);
        p33.u(i, 4);
    }

    public final void C(int i, int i2) {
        this.a.q(i, i2);
    }

    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += P33.A(((Integer) list.get(i3)).intValue());
        }
        this.a.w(iA);
        while (i2 < list.size()) {
            this.a.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void E(int i, long j) {
        this.a.x(i, j);
    }

    public final void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += P33.c(((Long) list.get(i3)).longValue());
        }
        this.a.w(iC);
        while (i2 < list.size()) {
            this.a.y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void G(int i, Object obj, InterfaceC7821r53 interfaceC7821r53) {
        this.a.s(i, (U43) obj, interfaceC7821r53);
    }

    public final void H(int i, int i2) {
        this.a.m(i, i2);
    }

    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void J(int i, long j) {
        this.a.o(i, j);
    }

    public final void K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void a(int i, int i2) {
        this.a.v(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                P33 p33 = this.a;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                p33.v(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iB += P33.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.a.w(iB);
        while (i2 < list.size()) {
            P33 p332 = this.a;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            p332.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public final void c(int i, long j) {
        this.a.x(i, (j >> 63) ^ (j + j));
    }

    public final void d(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                P33 p33 = this.a;
                long jLongValue = ((Long) list.get(i2)).longValue();
                p33.x(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iC += P33.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.w(iC);
        while (i2 < list.size()) {
            P33 p332 = this.a;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            p332.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public final void e(int i) {
        this.a.u(i, 3);
    }

    public final void f(int i, String str) {
        this.a.t(i, str);
    }

    public final void g(int i, List list) {
        int i2 = 0;
        if (!(list instanceof InterfaceC10055z43)) {
            while (i2 < list.size()) {
                this.a.t(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC10055z43 interfaceC10055z43 = (InterfaceC10055z43) list;
        while (i2 < list.size()) {
            Object objD = interfaceC10055z43.d(i2);
            if (objD instanceof String) {
                this.a.t(i, (String) objD);
            } else {
                this.a.k(i, (AbstractC9213w33) objD);
            }
            i2++;
        }
    }

    public final void h(int i, int i2) {
        this.a.v(i, i2);
    }

    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB += P33.b(((Integer) list.get(i3)).intValue());
        }
        this.a.w(iB);
        while (i2 < list.size()) {
            this.a.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void j(int i, long j) {
        this.a.x(i, j);
    }

    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.x(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += P33.c(((Long) list.get(i3)).longValue());
        }
        this.a.w(iC);
        while (i2 < list.size()) {
            this.a.y(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void m(int i, boolean z) {
        this.a.j(i, z);
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
    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void o(int i, AbstractC9213w33 abstractC9213w33) {
        this.a.k(i, abstractC9213w33);
    }

    public final void p(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k(i, (AbstractC9213w33) list.get(i2));
        }
    }

    public final void q(int i, double d) {
        this.a.o(i, Double.doubleToRawLongBits(d));
    }

    public final void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void s(int i) {
        this.a.u(i, 4);
    }

    public final void t(int i, int i2) {
        this.a.q(i, i2);
    }

    public final void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += P33.A(((Integer) list.get(i3)).intValue());
        }
        this.a.w(iA);
        while (i2 < list.size()) {
            this.a.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void v(int i, int i2) {
        this.a.m(i, i2);
    }

    public final void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void x(int i, long j) {
        this.a.o(i, j);
    }

    public final void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.w(i3);
        while (i2 < list.size()) {
            this.a.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void z(int i, float f) {
        this.a.m(i, Float.floatToRawIntBits(f));
    }
}
