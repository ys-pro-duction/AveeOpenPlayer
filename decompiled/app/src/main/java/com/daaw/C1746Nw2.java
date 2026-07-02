package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Nw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1746Nw2 implements InterfaceC1447Kz2 {
    public final Executor a;
    public final OS1 b;

    public C1746Nw2(Executor executor, OS1 os1) {
        this.a = executor;
        this.b = os1;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 10;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.y2)).booleanValue()) {
            return AbstractC7360pS2.h(null);
        }
        OS1 os1 = this.b;
        return AbstractC7360pS2.m(os1.j(), new WN2() { // from class: com.daaw.Mw2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new InterfaceC1343Jz2() { // from class: com.daaw.Lw2
                    @Override // com.daaw.InterfaceC1343Jz2
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.a);
    }
}
