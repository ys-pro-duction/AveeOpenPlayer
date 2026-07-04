package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class W20 implements VM {
    public static final W20 a = new W20();

    @Override // com.daaw.VM
    public I80 a(KA0 ka0, String str, YS0 ys0, YS0 ys02) {
        G10.g(ka0, "proto");
        G10.g(str, "flexibleId");
        G10.g(ys0, "lowerBound");
        G10.g(ys02, "upperBound");
        return !G10.c(str, "kotlin.jvm.PlatformType") ? BH.d(AH.k0, str, ys0.toString(), ys02.toString()) : ka0.A(AbstractC7261p50.g) ? new DE0(ys0, ys02) : M80.e(ys0, ys02);
    }
}
