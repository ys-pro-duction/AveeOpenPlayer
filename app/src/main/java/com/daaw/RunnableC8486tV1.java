package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.tV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8486tV1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ int D;
    public final /* synthetic */ AbstractC9330wV1 E;

    public RunnableC8486tV1(AbstractC9330wV1 abstractC9330wV1, String str, String str2, int i) {
        this.E = abstractC9330wV1;
        this.B = str;
        this.C = str2;
        this.D = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.B);
        map.put("cachedSrc", this.C);
        map.put("totalBytes", Integer.toString(this.D));
        AbstractC9330wV1.j(this.E, "onPrecacheEvent", map);
    }
}
