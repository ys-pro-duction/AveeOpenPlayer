package com.daaw;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NR1 implements InterfaceC10148zQ2 {
    public final AbstractC5392iR1 a;

    public NR1(AbstractC5392iR1 abstractC5392iR1) {
        Charset charset = J82.a;
        this.a = abstractC5392iR1;
        abstractC5392iR1.a = this;
    }

    public static NR1 o(AbstractC5392iR1 abstractC5392iR1) {
        NR1 nr1 = abstractC5392iR1.a;
        return nr1 != null ? nr1 : new NR1(abstractC5392iR1);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    AbstractC5392iR1 abstractC5392iR1 = this.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC5392iR1.p(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iW += AbstractC5392iR1.w((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.a.q(iW);
            while (i2 < list.size()) {
                AbstractC5392iR1 abstractC5392iR12 = this.a;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abstractC5392iR12.q((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                AbstractC5392iR1 abstractC5392iR13 = this.a;
                int iM = c5854k42.m(i2);
                abstractC5392iR13.p(i, (iM >> 31) ^ (iM + iM));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < c5854k42.size(); i4++) {
            int iM2 = c5854k42.m(i4);
            iW2 += AbstractC5392iR1.w((iM2 >> 31) ^ (iM2 + iM2));
        }
        this.a.q(iW2);
        while (i2 < c5854k42.size()) {
            AbstractC5392iR1 abstractC5392iR14 = this.a;
            int iM3 = c5854k42.m(i2);
            abstractC5392iR14.q((iM3 >> 31) ^ (iM3 + iM3));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void B(int i, Object obj, InterfaceC7500pw2 interfaceC7500pw2) {
        AbstractC5392iR1 abstractC5392iR1 = this.a;
        abstractC5392iR1.o(i, 3);
        interfaceC7500pw2.g((InterfaceC7467pp2) obj, abstractC5392iR1.a);
        abstractC5392iR1.o(i, 4);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void C(int i, long j) {
        this.a.r(i, (j >> 63) ^ (j + j));
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void D(int i, List list, boolean z) {
        if (list instanceof AbstractC1586Mi2) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += AbstractC5392iR1.x(((Long) list.get(i3)).longValue());
        }
        this.a.q(iX);
        while (i2 < list.size()) {
            this.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void E(int i, BM1 bm1) {
        this.a.f(i, bm1);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void F(int i, Object obj) {
        if (obj instanceof BM1) {
            C9864yP1 c9864yP1 = (C9864yP1) this.a;
            c9864yP1.q(11);
            c9864yP1.p(2, i);
            c9864yP1.f(3, (BM1) obj);
            c9864yP1.q(12);
            return;
        }
        AbstractC5392iR1 abstractC5392iR1 = this.a;
        InterfaceC7467pp2 interfaceC7467pp2 = (InterfaceC7467pp2) obj;
        C9864yP1 c9864yP12 = (C9864yP1) abstractC5392iR1;
        c9864yP12.q(11);
        c9864yP12.p(2, i);
        c9864yP12.q(26);
        c9864yP12.q(interfaceC7467pp2.zzf());
        interfaceC7467pp2.b(abstractC5392iR1);
        c9864yP12.q(12);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void G(int i, int i2) {
        this.a.g(i, i2);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void H(int i, List list, boolean z) {
        if (list instanceof AbstractC1586Mi2) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC5392iR1 abstractC5392iR1 = this.a;
                long jLongValue = ((Long) list.get(i2)).longValue();
                abstractC5392iR1.r(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iX += AbstractC5392iR1.x((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.q(iX);
        while (i2 < list.size()) {
            AbstractC5392iR1 abstractC5392iR12 = this.a;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC5392iR12.s((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void I(int i, Object obj, InterfaceC7500pw2 interfaceC7500pw2) {
        InterfaceC7467pp2 interfaceC7467pp2 = (InterfaceC7467pp2) obj;
        C9864yP1 c9864yP1 = (C9864yP1) this.a;
        c9864yP1.q((i << 3) | 2);
        c9864yP1.q(((AbstractC8127sB1) interfaceC7467pp2).a(interfaceC7500pw2));
        interfaceC7500pw2.g(interfaceC7467pp2, c9864yP1.a);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void J(int i, List list) {
        int i2 = 0;
        if (!(list instanceof InterfaceC1259Je2)) {
            while (i2 < list.size()) {
                this.a.n(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC1259Je2 interfaceC1259Je2 = (InterfaceC1259Je2) list;
        while (i2 < list.size()) {
            Object objD = interfaceC1259Je2.d(i2);
            if (objD instanceof String) {
                this.a.n(i, (String) objD);
            } else {
                this.a.f(i, (BM1) objD);
            }
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void K(int i, long j) {
        this.a.r(i, j);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void L(int i) {
        this.a.o(i, 3);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void a(int i, long j) {
        this.a.i(i, j);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.f(i, (BM1) list.get(i2));
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void c(int i, int i2) {
        this.a.g(i, i2);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void d(int i, boolean z) {
        this.a.e(i, z);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void e(int i, long j) {
        this.a.r(i, j);
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
    @Override // com.daaw.InterfaceC10148zQ2
    public final void f(int i, List list, boolean z) {
        if (list instanceof AbstractC9545xF1) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.e(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.a.q(i3);
        while (i2 < list.size()) {
            this.a.d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void g(int i) {
        this.a.o(i, 4);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                this.a.g(i, c5854k42.m(i2));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5854k42.size(); i6++) {
            c5854k42.m(i6);
            i5 += 4;
        }
        this.a.q(i5);
        while (i2 < c5854k42.size()) {
            this.a.h(c5854k42.m(i2));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += AbstractC5392iR1.x(((Integer) list.get(i3)).intValue());
            }
            this.a.q(iX);
            while (i2 < list.size()) {
                this.a.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                this.a.k(i, c5854k42.m(i2));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < c5854k42.size(); i4++) {
            iX2 += AbstractC5392iR1.x(c5854k42.m(i4));
        }
        this.a.q(iX2);
        while (i2 < c5854k42.size()) {
            this.a.l(c5854k42.m(i2));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void j(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += AbstractC5392iR1.x(((Integer) list.get(i3)).intValue());
            }
            this.a.q(iX);
            while (i2 < list.size()) {
                this.a.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                this.a.k(i, c5854k42.m(i2));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < c5854k42.size(); i4++) {
            iX2 += AbstractC5392iR1.x(c5854k42.m(i4));
        }
        this.a.q(iX2);
        while (i2 < c5854k42.size()) {
            this.a.l(c5854k42.m(i2));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void l(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void m(int i, double d) {
        this.a.i(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void n(int i, List list, boolean z) {
        if (list instanceof AbstractC1586Mi2) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.q(i3);
        while (i2 < list.size()) {
            this.a.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void p(int i, float f) {
        this.a.g(i, Float.floatToRawIntBits(f));
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void q(int i, List list, boolean z) {
        if (list instanceof AbstractC1586Mi2) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += AbstractC5392iR1.x(((Long) list.get(i3)).longValue());
        }
        this.a.q(iX);
        while (i2 < list.size()) {
            this.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void r(int i, List list, boolean z) {
        if (list instanceof JS1) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.q(i3);
        while (i2 < list.size()) {
            this.a.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void s(int i, List list, boolean z) {
        if (list instanceof SY1) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.a.q(i3);
        while (i2 < list.size()) {
            this.a.h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void t(int i, String str) {
        this.a.n(i, str);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void u(int i, int i2) {
        this.a.p(i, i2);
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void v(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                this.a.g(i, c5854k42.m(i2));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5854k42.size(); i6++) {
            c5854k42.m(i6);
            i5 += 4;
        }
        this.a.q(i5);
        while (i2 < c5854k42.size()) {
            this.a.h(c5854k42.m(i2));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof C5854k42)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.a.p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.a.o(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += AbstractC5392iR1.w(((Integer) list.get(i3)).intValue());
            }
            this.a.q(iW);
            while (i2 < list.size()) {
                this.a.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5854k42 c5854k42 = (C5854k42) list;
        if (!z) {
            while (i2 < c5854k42.size()) {
                this.a.p(i, c5854k42.m(i2));
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < c5854k42.size(); i4++) {
            iW2 += AbstractC5392iR1.w(c5854k42.m(i4));
        }
        this.a.q(iW2);
        while (i2 < c5854k42.size()) {
            this.a.q(c5854k42.m(i2));
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void x(int i, List list, boolean z) {
        if (list instanceof AbstractC1586Mi2) {
            AbstractC6314li0.a(list);
            if (!z) {
                throw null;
            }
            this.a.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.a.q(i3);
        while (i2 < list.size()) {
            this.a.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void y(int i, int i2) {
        this.a.p(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.daaw.InterfaceC10148zQ2
    public final void z(int i, long j) {
        this.a.i(i, j);
    }
}
