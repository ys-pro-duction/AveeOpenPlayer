package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.fu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4692fu2 implements E72 {
    public boolean a = false;
    public final /* synthetic */ C2994Zq2 b;
    public final /* synthetic */ BT1 c;
    public final /* synthetic */ C4971gu2 d;

    public C4692fu2(C4971gu2 c4971gu2, C2994Zq2 c2994Zq2, BT1 bt1) {
        this.d = c4971gu2;
        this.b = c2994Zq2;
        this.c = bt1;
    }

    @Override // com.daaw.E72
    public final synchronized void a(int i, String str) {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (str == null) {
                str = C4971gu2.e(this.b.a, i);
            }
            b(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().b(AbstractC9820yE1.p5)).booleanValue()) {
            i = 3;
        }
        this.c.c(new C3274ar2(i, zzeVar));
    }

    @Override // com.daaw.E72
    public final synchronized void c(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(new zze(i, C4971gu2.e(this.b.a, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.daaw.E72
    public final synchronized void zzb(zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(zzeVar);
    }

    @Override // com.daaw.E72
    public final synchronized void zzd() {
        this.c.b(null);
    }
}
