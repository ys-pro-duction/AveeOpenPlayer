package com.daaw;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.nD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6742nD2 {
    public static void a(AtomicReference atomicReference, InterfaceC6463mD2 interfaceC6463mD2) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC6463mD2.zza(obj);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            AbstractC4274eT1.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
