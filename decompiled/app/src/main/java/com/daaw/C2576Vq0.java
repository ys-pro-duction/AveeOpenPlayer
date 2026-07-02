package com.daaw;

import com.daaw.AbstractC3789cj0;
import com.daaw.AbstractC7322pJ0;
import com.daaw.AbstractC9639xc1;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2576Vq0 extends T {
    public static final C2576Vq0 a = new C2576Vq0();
    public static final List b;

    static {
        C2352Tm0 c2352Tm0 = C2680Wq0.k;
        AbstractC3789cj0.b bVar = AbstractC3789cj0.b.b;
        C0864Fk c0864Fk = new C0864Fk(c2352Tm0, new InterfaceC0543Ck[]{bVar, new AbstractC9639xc1.a(1)}, (NQ) null, 4, (AbstractC2911Yw) null);
        C0864Fk c0864Fk2 = new C0864Fk(C2680Wq0.l, new InterfaceC0543Ck[]{bVar, new AbstractC9639xc1.a(2)}, C2264Sq0.B);
        C2352Tm0 c2352Tm02 = C2680Wq0.b;
        C4092do0 c4092do0 = C4092do0.a;
        AbstractC9639xc1.a aVar = new AbstractC9639xc1.a(2);
        Z10 z10 = Z10.a;
        C0864Fk c0864Fk3 = new C0864Fk(c2352Tm02, new InterfaceC0543Ck[]{bVar, c4092do0, aVar, z10}, (NQ) null, 4, (AbstractC2911Yw) null);
        C0864Fk c0864Fk4 = new C0864Fk(C2680Wq0.c, new InterfaceC0543Ck[]{bVar, c4092do0, new AbstractC9639xc1.a(3), z10}, (NQ) null, 4, (AbstractC2911Yw) null);
        C0864Fk c0864Fk5 = new C0864Fk(C2680Wq0.d, new InterfaceC0543Ck[]{bVar, c4092do0, new AbstractC9639xc1.b(2), z10}, (NQ) null, 4, (AbstractC2911Yw) null);
        C0864Fk c0864Fk6 = new C0864Fk(C2680Wq0.i, new InterfaceC0543Ck[]{bVar}, (NQ) null, 4, (AbstractC2911Yw) null);
        C2352Tm0 c2352Tm03 = C2680Wq0.h;
        AbstractC9639xc1.d dVar = AbstractC9639xc1.d.b;
        AbstractC7322pJ0.a aVar2 = AbstractC7322pJ0.a.d;
        C0864Fk c0864Fk7 = new C0864Fk(c2352Tm03, new InterfaceC0543Ck[]{bVar, dVar, c4092do0, aVar2}, (NQ) null, 4, (AbstractC2911Yw) null);
        C2352Tm0 c2352Tm04 = C2680Wq0.j;
        AbstractC9639xc1.c cVar = AbstractC9639xc1.c.b;
        b = AbstractC1599Mm.n(c0864Fk, c0864Fk2, c0864Fk3, c0864Fk4, c0864Fk5, c0864Fk6, c0864Fk7, new C0864Fk(c2352Tm04, new InterfaceC0543Ck[]{bVar, cVar}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.m, new InterfaceC0543Ck[]{bVar, cVar}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.n, new InterfaceC0543Ck[]{bVar, cVar, aVar2}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.I, new InterfaceC0543Ck[]{bVar, dVar, c4092do0}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.J, new InterfaceC0543Ck[]{bVar, dVar, c4092do0}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.e, new InterfaceC0543Ck[]{AbstractC3789cj0.a.b}, C2368Tq0.B), new C0864Fk(C2680Wq0.g, new InterfaceC0543Ck[]{bVar, AbstractC7322pJ0.b.d, dVar, c4092do0}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.S, new InterfaceC0543Ck[]{bVar, dVar, c4092do0}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.R, new InterfaceC0543Ck[]{bVar, cVar}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(AbstractC1599Mm.n(C2680Wq0.x, C2680Wq0.y), new InterfaceC0543Ck[]{bVar}, C2472Uq0.B), new C0864Fk(C2680Wq0.X, new InterfaceC0543Ck[]{bVar, AbstractC7322pJ0.c.d, dVar, c4092do0}, (NQ) null, 4, (AbstractC2911Yw) null), new C0864Fk(C2680Wq0.p, new InterfaceC0543Ck[]{bVar, cVar}, (NQ) null, 4, (AbstractC2911Yw) null));
    }

    public static final String f(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "$this$Checks");
        List listH = interfaceC8468tR.h();
        G10.f(listH, "getValueParameters(...)");
        InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) AbstractC2455Um.r0(listH);
        boolean z = false;
        if (interfaceC9918yc1 != null && !AbstractC8400tA.f(interfaceC9918yc1) && interfaceC9918yc1.g0() == null) {
            z = true;
        }
        if (z) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[EDGE_INSN: B:27:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:8:0x002d->B:28:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(com.daaw.InterfaceC8468tR r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            com.daaw.G10.g(r3, r0)
            com.daaw.tw r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            com.daaw.G10.f(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            com.daaw.G10.f(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            com.daaw.tR r2 = (com.daaw.InterfaceC8468tR) r2
            com.daaw.tw r2 = r2.b()
            com.daaw.G10.f(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = com.daaw.AbstractC6727nA.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            com.daaw.tw r2 = r3.b()
            com.daaw.G10.f(r2, r1)
            boolean r1 = com.daaw.JZ.g(r2)
            if (r1 == 0) goto La1
            com.daaw.Yz r1 = com.daaw.AbstractC2923Yz.j
            com.daaw.tw r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            com.daaw.G10.e(r3, r2)
            com.daaw.gl r3 = (com.daaw.InterfaceC4923gl) r3
            com.daaw.YS0 r3 = r3.s()
            java.lang.String r2 = "getDefaultType(...)"
            com.daaw.G10.f(r3, r2)
            com.daaw.I80 r3 = com.daaw.H81.D(r3)
            java.lang.String r3 = r1.U(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            com.daaw.G10.f(r3, r0)
            return r3
        Lab:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2576Vq0.g(com.daaw.tR):java.lang.String");
    }

    public static final boolean h(InterfaceC8612tw interfaceC8612tw) {
        return (interfaceC8612tw instanceof InterfaceC4923gl) && AbstractC8670u80.a0((InterfaceC4923gl) interfaceC8612tw);
    }

    public static final String i(InterfaceC8468tR interfaceC8468tR) {
        boolean zW;
        G10.g(interfaceC8468tR, "$this$Checks");
        RE0 re0C0 = interfaceC8468tR.c0();
        if (re0C0 == null) {
            re0C0 = interfaceC8468tR.i0();
        }
        C2576Vq0 c2576Vq0 = a;
        boolean z = false;
        if (re0C0 != null) {
            I80 returnType = interfaceC8468tR.getReturnType();
            if (returnType != null) {
                I80 type = re0C0.getType();
                G10.f(type, "getType(...)");
                zW = H81.w(returnType, type);
            } else {
                zW = false;
            }
            if (zW || c2576Vq0.j(interfaceC8468tR, re0C0)) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    @Override // com.daaw.T
    public List b() {
        return b;
    }

    public final boolean j(InterfaceC8468tR interfaceC8468tR, RE0 re0) {
        C6607ml c6607mlN;
        I80 returnType;
        TE0 value = re0.getValue();
        G10.f(value, "getValue(...)");
        if (!(value instanceof WY)) {
            return false;
        }
        InterfaceC4923gl interfaceC4923glR = ((WY) value).r();
        if (!interfaceC4923glR.J() || (c6607mlN = AbstractC8400tA.n(interfaceC4923glR)) == null) {
            return false;
        }
        InterfaceC10240zl interfaceC10240zlC = AbstractC5366iL.c(AbstractC8400tA.s(interfaceC4923glR), c6607mlN);
        InterfaceC5586j71 interfaceC5586j71 = interfaceC10240zlC instanceof InterfaceC5586j71 ? (InterfaceC5586j71) interfaceC10240zlC : null;
        if (interfaceC5586j71 == null || (returnType = interfaceC8468tR.getReturnType()) == null) {
            return false;
        }
        return H81.w(returnType, interfaceC5586j71.S());
    }
}
