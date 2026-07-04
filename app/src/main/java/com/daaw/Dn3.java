package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Dn3 implements InterfaceC6273la {
    public final InterfaceC6273la a;
    public final InterfaceC6273la b;

    public Dn3(Context context) {
        this.a = new Pk3(context, C9599xT.f());
        this.b = Ue3.d(context);
    }

    public static /* synthetic */ AbstractC6963o11 b(Dn3 dn3, AbstractC6963o11 abstractC6963o11) {
        if (!abstractC6963o11.n() && !abstractC6963o11.l()) {
            Exception excJ = abstractC6963o11.j();
            if (excJ instanceof E8) {
                int iB = ((E8) excJ).b();
                if (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) {
                    return dn3.b.a();
                }
                if (iB == 43000) {
                    return A11.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (iB == 15) {
                    return A11.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return abstractC6963o11;
    }

    @Override // com.daaw.InterfaceC6273la
    public final AbstractC6963o11 a() {
        return this.a.a().h(new InterfaceC1519Ls() { // from class: com.daaw.om3
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return Dn3.b(this.a, abstractC6963o11);
            }
        });
    }
}
