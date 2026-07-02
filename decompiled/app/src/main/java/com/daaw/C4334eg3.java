package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.eg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4334eg3 {
    public final C9357wb3 a;

    public C4334eg3(Context context, C3172aW1 c3172aW1) {
        this.a = new C9357wb3(context, c3172aW1);
    }

    public final C4334eg3 a(final InterfaceC6576me3 interfaceC6576me3) {
        C9357wb3 c9357wb3 = this.a;
        AbstractC6048km2.f(!c9357wb3.q);
        interfaceC6576me3.getClass();
        c9357wb3.f = new CO2() { // from class: com.daaw.Ya3
            @Override // com.daaw.CO2
            public final Object zza() {
                return interfaceC6576me3;
            }
        };
        return this;
    }

    public final C4334eg3 b(final Cs3 cs3) {
        C9357wb3 c9357wb3 = this.a;
        AbstractC6048km2.f(!c9357wb3.q);
        cs3.getClass();
        c9357wb3.e = new CO2() { // from class: com.daaw.tb3
            @Override // com.daaw.CO2
            public final Object zza() {
                return cs3;
            }
        };
        return this;
    }

    public final C4902gg3 c() {
        C9357wb3 c9357wb3 = this.a;
        AbstractC6048km2.f(!c9357wb3.q);
        c9357wb3.q = true;
        return new C4902gg3(c9357wb3);
    }
}
