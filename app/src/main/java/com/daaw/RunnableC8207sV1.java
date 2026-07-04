package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.sV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8207sV1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ AbstractC9330wV1 K;

    public RunnableC8207sV1(AbstractC9330wV1 abstractC9330wV1, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.K = abstractC9330wV1;
        this.B = str;
        this.C = str2;
        this.D = i;
        this.E = i2;
        this.F = j;
        this.G = j2;
        this.H = z;
        this.I = i3;
        this.J = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.B);
        map.put("cachedSrc", this.C);
        map.put("bytesLoaded", Integer.toString(this.D));
        map.put("totalBytes", Integer.toString(this.E));
        map.put("bufferedDuration", Long.toString(this.F));
        map.put("totalDuration", Long.toString(this.G));
        map.put("cacheReady", true != this.H ? "0" : "1");
        map.put("playerCount", Integer.toString(this.I));
        map.put("playerPreparedCount", Integer.toString(this.J));
        AbstractC9330wV1.j(this.K, "onPrecacheEvent", map);
    }
}
