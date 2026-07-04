package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5744jh2 implements HI1 {
    public final WeakReference a;
    public final String b;
    public final HI1 c;
    public final /* synthetic */ C6023kh2 d;

    public /* synthetic */ C5744jh2(C6023kh2 c6023kh2, WeakReference weakReference, String str, HI1 hi1, AbstractC5463ih2 abstractC5463ih2) {
        this.d = c6023kh2;
        this.a = weakReference;
        this.b = str;
        this.c = hi1;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        Object obj2 = this.a.get();
        if (obj2 == null) {
            this.d.k(this.b, this);
        } else {
            this.c.a(obj2, map);
        }
    }
}
