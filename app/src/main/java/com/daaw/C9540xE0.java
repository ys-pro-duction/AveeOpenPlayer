package com.daaw;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9540xE0 extends AbstractC6197lH {

    /* JADX INFO: renamed from: com.daaw.xE0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F30.values().length];
            try {
                iArr[F30.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F30.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F30.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // com.daaw.AbstractC6197lH
    public InterfaceC6440m81 a(Z71 z71, AbstractC6476mH abstractC6476mH, C5035h81 c5035h81, I80 i80) {
        InterfaceC6440m81 c6998o81;
        G10.g(z71, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        G10.g(abstractC6476mH, "typeAttr");
        G10.g(c5035h81, "typeParameterUpperBoundEraser");
        G10.g(i80, "erasedUpperBound");
        if (!(abstractC6476mH instanceof B30)) {
            return super.a(z71, abstractC6476mH, c5035h81, i80);
        }
        B30 b30L = (B30) abstractC6476mH;
        if (!b30L.i()) {
            b30L = b30L.l(F30.B);
        }
        int i = a.a[b30L.g().ordinal()];
        if (i == 1) {
            return new C6998o81(EnumC1042Hc1.F, i80);
        }
        if (i != 2 && i != 3) {
            throw new C6902no0();
        }
        if (z71.o().c()) {
            List parameters = i80.N0().getParameters();
            G10.f(parameters, "getParameters(...)");
            c6998o81 = !parameters.isEmpty() ? new C6998o81(EnumC1042Hc1.H, i80) : D81.t(z71, b30L);
        } else {
            c6998o81 = new C6998o81(EnumC1042Hc1.F, AbstractC8400tA.m(z71).H());
        }
        G10.d(c6998o81);
        return c6998o81;
    }
}
