package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b.a {
    public static Account I(b bVar) {
        if (bVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return bVar.zzb();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}
