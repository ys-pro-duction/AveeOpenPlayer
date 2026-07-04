package com.daaw;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.yw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10017yw2 implements InterfaceC1447Kz2 {
    public final Set a;

    public C10017yw2(Set set) {
        this.a = set;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 8;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC7360pS2.h(new InterfaceC1343Jz2() { // from class: com.daaw.xw2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
