package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class U72 extends AbstractC9351wa2 implements LH1 {
    public final Bundle C;

    public U72(Set set) {
        super(set);
        this.C = new Bundle();
    }

    public final synchronized Bundle B0() {
        return new Bundle(this.C);
    }

    @Override // com.daaw.LH1
    public final synchronized void t(String str, Bundle bundle) {
        this.C.putAll(bundle);
        A0(new InterfaceC9072va2() { // from class: com.daaw.T72
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }
}
