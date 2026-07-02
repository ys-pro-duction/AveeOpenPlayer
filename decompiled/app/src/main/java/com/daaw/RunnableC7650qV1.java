package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.qV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7650qV1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ AbstractC9330wV1 F;

    public RunnableC7650qV1(AbstractC9330wV1 abstractC9330wV1, String str, String str2, int i, int i2, boolean z) {
        this.F = abstractC9330wV1;
        this.B = str;
        this.C = str2;
        this.D = i;
        this.E = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.B);
        map.put("cachedSrc", this.C);
        map.put("bytesLoaded", Integer.toString(this.D));
        map.put("totalBytes", Integer.toString(this.E));
        map.put("cacheReady", "0");
        AbstractC9330wV1.j(this.F, "onPrecacheEvent", map);
    }
}
