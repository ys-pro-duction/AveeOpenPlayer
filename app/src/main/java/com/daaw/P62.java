package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class P62 extends AbstractC9351wa2 implements zza {
    public P62(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        A0(new InterfaceC9072va2() { // from class: com.daaw.O62
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((zza) obj).onAdClicked();
            }
        });
    }
}
