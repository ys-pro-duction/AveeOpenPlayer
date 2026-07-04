package com.daaw;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzej;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ss2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2274Ss2 extends XJ1 {
    public final /* synthetic */ zzej B;

    public /* synthetic */ BinderC2274Ss2(zzej zzejVar, zzeh zzehVar) {
        this.B = zzejVar;
    }

    @Override // com.daaw.YJ1
    public final void W1(List list) {
        int i;
        ArrayList arrayList;
        synchronized (this.B.a) {
            this.B.c = false;
            this.B.d = true;
            arrayList = new ArrayList(this.B.b);
            this.B.b.clear();
        }
        InitializationStatus initializationStatusK = zzej.k(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusK);
        }
    }
}
