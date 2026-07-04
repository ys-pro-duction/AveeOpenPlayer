package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class NF2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC9334wW1 a;
    public final /* synthetic */ L12 b;
    public final /* synthetic */ C6487mJ2 c;
    public final /* synthetic */ C6077kq2 d;

    public NF2(InterfaceC9334wW1 interfaceC9334wW1, L12 l12, C6487mJ2 c6487mJ2, C6077kq2 c6077kq2) {
        this.a = interfaceC9334wW1;
        this.b = l12;
        this.c = c6487mJ2;
        this.d = c6077kq2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        if (!this.a.b().k0) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue()) {
                this.b.i(str, this.c, zzay.zze());
                return;
            } else {
                this.c.c(str, null);
                return;
            }
        }
        long jA = zzt.zzB().a();
        String str2 = this.a.zzP().b;
        int i = 2;
        if (!zzt.zzo().x(this.a.getContext())) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.k6)).booleanValue() || !this.a.b().U) {
                i = 1;
            }
        }
        this.d.j(new C6635mq2(jA, str2, str, i));
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
    }
}
