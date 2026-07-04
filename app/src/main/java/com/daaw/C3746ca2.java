package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ca2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3746ca2 extends AbstractC9351wa2 implements TH1 {
    public C3746ca2(Set set) {
        super(set);
    }

    @Override // com.daaw.TH1
    public final synchronized void a(final String str, final String str2) {
        A0(new InterfaceC9072va2() { // from class: com.daaw.ba2
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
