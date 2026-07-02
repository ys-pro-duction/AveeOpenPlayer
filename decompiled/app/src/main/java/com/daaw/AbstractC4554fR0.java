package com.daaw;

/* JADX INFO: renamed from: com.daaw.fR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4554fR0 {

    /* JADX INFO: renamed from: com.daaw.fR0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ long E;
        public final /* synthetic */ long F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, InterfaceC5391iR0 interfaceC5391iR0, boolean z, long j, long j2) {
            super(1);
            this.B = f;
            this.C = interfaceC5391iR0;
            this.D = z;
            this.E = j;
            this.F = j2;
        }

        public final void a(TT tt) {
            G10.g(tt, "$this$graphicsLayer");
            tt.t(tt.O(this.B));
            tt.w(this.C);
            tt.U(this.D);
            tt.P(this.E);
            tt.Y(this.F);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TT) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.fR0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ long E;
        public final /* synthetic */ long F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, InterfaceC5391iR0 interfaceC5391iR0, boolean z, long j, long j2) {
            super(1);
            this.B = f;
            this.C = interfaceC5391iR0;
            this.D = z;
            this.E = j;
            this.F = j2;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, float f, InterfaceC5391iR0 interfaceC5391iR0, boolean z, long j, long j2) {
        G10.g(interfaceC1073Hk0, "$this$shadow");
        G10.g(interfaceC5391iR0, "shape");
        if (C6460mD.k(f, C6460mD.l(0)) > 0 || z) {
            return AbstractC5550j00.b(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(f, interfaceC5391iR0, z, j, j2) : AbstractC5550j00.a(), ST.a(InterfaceC1073Hk0.m, new a(f, interfaceC5391iR0, z, j, j2)));
        }
        return interfaceC1073Hk0;
    }

    public static /* synthetic */ InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, float f, InterfaceC5391iR0 interfaceC5391iR0, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        InterfaceC5391iR0 interfaceC5391iR0A = (i & 2) != 0 ? AbstractC4785gF0.a() : interfaceC5391iR0;
        if ((i & 4) != 0) {
            z2 = false;
            if (C6460mD.k(f, C6460mD.l(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return a(interfaceC1073Hk0, f, interfaceC5391iR0A, z2, (i & 8) != 0 ? UT.a() : j, (i & 16) != 0 ? UT.a() : j2);
    }
}
