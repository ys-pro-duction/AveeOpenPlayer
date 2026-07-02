package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: renamed from: com.daaw.z82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC10074z82 extends AbstractBinderC2565Vn1 {
    public AbstractC8245se B;
    public final int C;

    public BinderC10074z82(AbstractC8245se abstractC8245se, int i) {
        this.B = abstractC8245se;
        this.C = i;
    }

    @Override // com.daaw.InterfaceC5973kX
    public final void F2(int i, IBinder iBinder, zzk zzkVar) {
        AbstractC8245se abstractC8245se = this.B;
        AbstractC7506py0.m(abstractC8245se, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC7506py0.l(zzkVar);
        AbstractC8245se.C(abstractC8245se, zzkVar);
        k1(i, iBinder, zzkVar.B);
    }

    @Override // com.daaw.InterfaceC5973kX
    public final void H0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.daaw.InterfaceC5973kX
    public final void k1(int i, IBinder iBinder, Bundle bundle) {
        AbstractC7506py0.m(this.B, "onPostInitComplete can be called only once per call to getRemoteService");
        this.B.r(i, iBinder, bundle, this.C);
        this.B = null;
    }
}
