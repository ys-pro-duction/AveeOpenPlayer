package com.daaw;

import com.google.android.gms.ads.mediation.MediationConfiguration;

/* JADX INFO: renamed from: com.daaw.lH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6197lH {
    public static /* synthetic */ InterfaceC6440m81 b(AbstractC6197lH abstractC6197lH, Z71 z71, AbstractC6476mH abstractC6476mH, C5035h81 c5035h81, I80 i80, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i & 8) != 0) {
            i80 = c5035h81.e(z71, abstractC6476mH);
        }
        return abstractC6197lH.a(z71, abstractC6476mH, c5035h81, i80);
    }

    public InterfaceC6440m81 a(Z71 z71, AbstractC6476mH abstractC6476mH, C5035h81 c5035h81, I80 i80) {
        G10.g(z71, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        G10.g(abstractC6476mH, "typeAttr");
        G10.g(c5035h81, "typeParameterUpperBoundEraser");
        G10.g(i80, "erasedUpperBound");
        return new C6998o81(EnumC1042Hc1.H, i80);
    }
}
