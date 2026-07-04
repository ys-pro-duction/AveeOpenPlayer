package com.daaw;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Ng2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1682Ng2 implements InterfaceC4790gG1 {
    public final /* synthetic */ String a = "_videoMediaView";
    public final /* synthetic */ BinderC1786Og2 b;

    public C1682Ng2(BinderC1786Og2 binderC1786Og2, String str) {
        this.b = binderC1786Og2;
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final JSONObject zza() {
        return null;
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final void zzc() {
        BinderC1786Og2 binderC1786Og2 = this.b;
        if (binderC1786Og2.E != null) {
            binderC1786Og2.E.k(this.a);
        }
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final void a(MotionEvent motionEvent) {
    }
}
