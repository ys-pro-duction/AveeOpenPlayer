package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.Tl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2349Tl1 {
    public final int a;

    public AbstractC2349Tl1(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(C4646fl1 c4646fl1);

    public abstract void d(C2241Sk1 c2241Sk1, boolean z);
}
