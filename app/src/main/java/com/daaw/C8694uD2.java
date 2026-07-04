package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.uD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8694uD2 extends AbstractC0770Em1 {
    public final IBinder g;
    public final /* synthetic */ AbstractC8245se h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8694uD2(AbstractC8245se abstractC8245se, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC8245se, i, bundle);
        this.h = abstractC8245se;
        this.g = iBinder;
    }

    @Override // com.daaw.AbstractC0770Em1
    public final void f(ConnectionResult connectionResult) {
        if (this.h.v != null) {
            this.h.v.G(connectionResult);
        }
        this.h.p(connectionResult);
    }

    @Override // com.daaw.AbstractC0770Em1
    public final boolean g() {
        try {
            IBinder iBinder = this.g;
            AbstractC7506py0.l(iBinder);
            if (!this.h.k().equals(iBinder.getInterfaceDescriptor())) {
                this.h.k();
                return false;
            }
            IInterface iInterfaceE = this.h.e(this.g);
            if (iInterfaceE == null) {
                return false;
            }
            if (!AbstractC8245se.G(this.h, 2, 4, iInterfaceE) && !AbstractC8245se.G(this.h, 3, 4, iInterfaceE)) {
                return false;
            }
            this.h.z = null;
            AbstractC8245se abstractC8245se = this.h;
            Bundle connectionHint = abstractC8245se.getConnectionHint();
            if (abstractC8245se.u != null) {
                this.h.u.I(connectionHint);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
