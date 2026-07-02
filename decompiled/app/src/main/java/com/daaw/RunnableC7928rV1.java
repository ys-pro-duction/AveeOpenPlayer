package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.rV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7928rV1 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ AbstractC9330wV1 L;

    public RunnableC7928rV1(AbstractC9330wV1 abstractC9330wV1, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.L = abstractC9330wV1;
        this.B = str;
        this.C = str2;
        this.D = j;
        this.E = j2;
        this.F = j3;
        this.G = j4;
        this.H = j5;
        this.I = z;
        this.J = i;
        this.K = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.B);
        map.put("cachedSrc", this.C);
        map.put("bufferedDuration", Long.toString(this.D));
        map.put("totalDuration", Long.toString(this.E));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.F));
            map.put("qoeCachedBytes", Long.toString(this.G));
            map.put("totalBytes", Long.toString(this.H));
            map.put("reportTime", Long.toString(zzt.zzB().a()));
        }
        map.put("cacheReady", true != this.I ? "0" : "1");
        map.put("playerCount", Integer.toString(this.J));
        map.put("playerPreparedCount", Integer.toString(this.K));
        AbstractC9330wV1.j(this.L, "onPrecacheEvent", map);
    }
}
