package com.daaw;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Qk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2032Qk2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C2242Sk2 a;

    public C2032Qk2(C2242Sk2 c2242Sk2) {
        this.a = c2242Sk2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.a.c = true;
            this.a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.zzB().b() - this.a.d));
            this.a.i.execute(new Runnable() { // from class: com.daaw.Pk2
                @Override // java.lang.Runnable
                public final void run() {
                    C2242Sk2.j(this.B.a, str);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        synchronized (this) {
            this.a.c = true;
            this.a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.zzB().b() - this.a.d));
            this.a.e.c(new Exception());
        }
    }
}
