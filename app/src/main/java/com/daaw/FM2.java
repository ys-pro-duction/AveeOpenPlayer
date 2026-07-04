package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FM2 {
    public static InterfaceFutureC8236sc0 a(AbstractC6963o11 abstractC6963o11) {
        final AM2 am2 = new AM2(abstractC6963o11);
        abstractC6963o11.c(VS2.b(), new InterfaceC5228hq0() { // from class: com.daaw.zM2
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o112) {
                AM2 am22 = am2;
                if (abstractC6963o112.l()) {
                    am22.cancel(false);
                    return;
                }
                if (abstractC6963o112.n()) {
                    am22.e(abstractC6963o112.k());
                    return;
                }
                Exception excJ = abstractC6963o112.j();
                if (excJ == null) {
                    throw new IllegalStateException();
                }
                am22.f(excJ);
            }
        });
        return am2;
    }
}
