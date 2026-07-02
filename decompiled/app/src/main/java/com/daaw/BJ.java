package com.daaw;

import com.daaw.CJ;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BJ {

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ CJ B;
        public final /* synthetic */ InterfaceC1073Hk0 C;
        public final /* synthetic */ float D;
        public final /* synthetic */ long E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CJ cj, InterfaceC1073Hk0 interfaceC1073Hk0, float f, long j, int i, int i2) {
            super(2);
            this.B = cj;
            this.C = interfaceC1073Hk0;
            this.D = f;
            this.E = j;
            this.F = i;
            this.G = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            BJ.a(this.B, this.C, this.D, this.E, interfaceC5781jp, this.F | 1, this.G);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.CJ r41, com.daaw.InterfaceC1073Hk0 r42, float r43, long r44, com.daaw.InterfaceC5781jp r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BJ.a(com.daaw.CJ, com.daaw.Hk0, float, long, com.daaw.jp, int, int):void");
    }

    public static final String b(int i) {
        return String.valueOf((char) i);
    }

    public static final AbstractC7898rO c(CJ cj) {
        if (cj instanceof CJ.a) {
            return AbstractC8456tO.a(AbstractC9858yO.b(AbstractC4488fD0.a, null, 0, 6, null));
        }
        if (cj instanceof CJ.c) {
            return AbstractC8456tO.a(AbstractC9858yO.b(AbstractC4488fD0.c, null, 0, 6, null));
        }
        if (cj instanceof CJ.b) {
            return AbstractC8456tO.a(AbstractC9858yO.b(AbstractC4488fD0.b, null, 0, 6, null));
        }
        throw new C6902no0();
    }

    public static final long d(float f, float f2) {
        return T21.c(C6460mD.l(f - C6460mD.l(3)) / f2);
    }
}
