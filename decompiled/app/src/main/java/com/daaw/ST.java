package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ST {

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq) {
            super(1);
            this.B = nq;
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

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;
        public final /* synthetic */ float F;
        public final /* synthetic */ float G;
        public final /* synthetic */ float H;
        public final /* synthetic */ float I;
        public final /* synthetic */ float J;
        public final /* synthetic */ float K;
        public final /* synthetic */ long L;
        public final /* synthetic */ InterfaceC5391iR0 M;
        public final /* synthetic */ boolean N;
        public final /* synthetic */ long O;
        public final /* synthetic */ long P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3) {
            super(1);
            this.B = f;
            this.C = f2;
            this.D = f3;
            this.E = f4;
            this.F = f5;
            this.G = f6;
            this.H = f7;
            this.I = f8;
            this.J = f9;
            this.K = f10;
            this.L = j;
            this.M = interfaceC5391iR0;
            this.N = z;
            this.O = j2;
            this.P = j3;
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

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "block");
        return interfaceC1073Hk0.g(new C2947Zf(nq, AbstractC5550j00.c() ? new a(nq) : AbstractC5550j00.a()));
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3) {
        G10.g(interfaceC1073Hk0, "$this$graphicsLayer");
        G10.g(interfaceC5391iR0, "shape");
        return interfaceC1073Hk0.g(new KS0(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC5391iR0, z, ug0, j2, j3, AbstractC5550j00.c() ? new b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC5391iR0, z, ug0, j2, j3) : AbstractC5550j00.a(), null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3, int i, Object obj) {
        return b(interfaceC1073Hk0, (i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) == 0 ? f3 : 1.0f, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? f9 : 0.0f, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 8.0f : f10, (i & 1024) != 0 ? AbstractC6425m51.a.a() : j, (i & 2048) != 0 ? AbstractC4785gF0.a() : interfaceC5391iR0, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : ug0, (i & 16384) != 0 ? UT.a() : j2, (i & 32768) != 0 ? UT.a() : j3);
    }

    public static final InterfaceC1073Hk0 d(InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(interfaceC1073Hk0, "<this>");
        return AbstractC5550j00.c() ? interfaceC1073Hk0.g(c(InterfaceC1073Hk0.m, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null)) : interfaceC1073Hk0;
    }
}
