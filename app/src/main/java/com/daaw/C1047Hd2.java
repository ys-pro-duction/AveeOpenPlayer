package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Hd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1047Hd2 implements HI1 {
    public final WeakReference a;

    public /* synthetic */ C1047Hd2(C1151Id2 c1151Id2, AbstractC0943Gd2 abstractC0943Gd2) {
        this.a = new WeakReference(c1151Id2);
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        C1151Id2 c1151Id2 = (C1151Id2) this.a.get();
        if (c1151Id2 == null) {
            return;
        }
        c1151Id2.g.zza();
    }
}
