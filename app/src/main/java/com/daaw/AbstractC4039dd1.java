package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4039dd1 {

    /* JADX INFO: renamed from: com.daaw.dd1$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ AbstractC3482bd1 B;
        public final /* synthetic */ Map C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3482bd1 abstractC3482bd1, Map map) {
            super(2);
            this.B = abstractC3482bd1;
            this.C = map;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                AbstractC4039dd1.a((C2937Zc1) this.B, this.C, interfaceC5781jp, 64, 0);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dd1$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C2937Zc1 B;
        public final /* synthetic */ Map C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2937Zc1 c2937Zc1, Map map, int i, int i2) {
            super(2);
            this.B = c2937Zc1;
            this.C = map;
            this.D = i;
            this.E = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC4039dd1.a(this.B, this.C, interfaceC5781jp, this.D | 1, this.E);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dd1$c */
    public static final class c implements InterfaceC2417Uc1 {
        @Override // com.daaw.InterfaceC2417Uc1
        public /* synthetic */ Object a(AbstractC4606fd1 abstractC4606fd1, Object obj) {
            return AbstractC2313Tc1.a(this, abstractC4606fd1, obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.dd1$d */
    public static final class d implements InterfaceC2417Uc1 {
        @Override // com.daaw.InterfaceC2417Uc1
        public /* synthetic */ Object a(AbstractC4606fd1 abstractC4606fd1, Object obj) {
            return AbstractC2313Tc1.a(this, abstractC4606fd1, obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.dd1$e */
    public static final class e extends AbstractC4192e90 implements InterfaceC4553fR {
        public final /* synthetic */ C8775uY B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8775uY c8775uY) {
            super(4);
            this.B = c8775uY;
        }

        public final void a(float f, float f2, InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                AbstractC4039dd1.a(this.B.e(), null, interfaceC5781jp, 0, 2);
            }
        }

        @Override // com.daaw.InterfaceC4553fR
        public /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
            a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (InterfaceC5781jp) obj3, ((Number) obj4).intValue());
            return G91.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.C2937Zc1 r23, java.util.Map r24, com.daaw.InterfaceC5781jp r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4039dd1.a(com.daaw.Zc1, java.util.Map, com.daaw.jp, int, int):void");
    }

    public static final C3760cd1 b(C8775uY c8775uY, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(c8775uY, "image");
        interfaceC5781jp.e(1413834416);
        C3760cd1 c3760cd1C = c(c8775uY.c(), c8775uY.b(), c8775uY.i(), c8775uY.h(), c8775uY.d(), c8775uY.g(), c8775uY.f(), c8775uY.a(), AbstractC1815Oo.b(interfaceC5781jp, 1873274766, true, new e(c8775uY)), interfaceC5781jp, 100663296, 0);
        interfaceC5781jp.L();
        return c3760cd1C;
    }

    public static final C3760cd1 c(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, InterfaceC4553fR interfaceC4553fR, InterfaceC5781jp interfaceC5781jp, int i2, int i3) {
        G10.g(interfaceC4553fR, "content");
        interfaceC5781jp.e(1068590786);
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long jG = (i3 & 32) != 0 ? C2559Vm.b.g() : j;
        int iZ = (i3 & 64) != 0 ? C2323Tf.b.z() : i;
        boolean z2 = (i3 & 128) != 0 ? false : z;
        InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
        float fO = interfaceC4988gz.O(f);
        float fO2 = interfaceC4988gz.O(f2);
        if (Float.isNaN(f5)) {
            f5 = fO;
        }
        if (Float.isNaN(f6)) {
            f6 = fO2;
        }
        C2559Vm c2559VmI = C2559Vm.i(jG);
        C2323Tf c2323TfD = C2323Tf.D(iZ);
        int i4 = i2 >> 15;
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(c2559VmI) | interfaceC5781jp.P(c2323TfD);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = !C2559Vm.o(jG, C2559Vm.b.g()) ? C2871Ym.b.a(jG, iZ) : null;
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C2871Ym c2871Ym = (C2871Ym) objF;
        interfaceC5781jp.e(-492369756);
        Object objF2 = interfaceC5781jp.f();
        if (objF2 == InterfaceC5781jp.a.a()) {
            objF2 = new C3760cd1();
            interfaceC5781jp.H(objF2);
        }
        interfaceC5781jp.L();
        C3760cd1 c3760cd1 = (C3760cd1) objF2;
        c3760cd1.u(BT0.a(fO, fO2));
        c3760cd1.r(z2);
        c3760cd1.t(c2871Ym);
        c3760cd1.k(str2, f5, f6, interfaceC4553fR, interfaceC5781jp, ((i2 >> 12) & 14) | 32768 | (i4 & 7168));
        interfaceC5781jp.L();
        return c3760cd1;
    }
}
