package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SC1 extends LinkedHashMap {
    public final /* synthetic */ zzc B;

    public SC1(zzc zzcVar) {
        this.B = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.B) {
            try {
                int size = size();
                zzc zzcVar = this.B;
                if (size <= zzcVar.a) {
                    return false;
                }
                zzcVar.f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.B.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
