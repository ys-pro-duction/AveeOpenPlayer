package com.daaw;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.daaw.Hu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1115Hu2 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final C8826ui2 b;

    public C1115Hu2(C8826ui2 c8826ui2) {
        this.b = c8826ui2;
    }

    public final ZM1 a(String str) {
        if (this.a.containsKey(str)) {
            return (ZM1) this.a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.a.put(str, this.b.b(str));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
