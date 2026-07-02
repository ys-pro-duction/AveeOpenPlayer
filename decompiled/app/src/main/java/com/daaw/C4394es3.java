package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.es3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4394es3 implements InterfaceC6244lS2 {
    public final /* synthetic */ EO1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzaa c;

    public C4394es3(zzaa zzaaVar, EO1 eo1, boolean z) {
        this.c = zzaaVar;
        this.a = eo1;
        this.b = z;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.a.s0(arrayList);
            if (!this.c.P && !this.b) {
                return;
            }
            for (Uri uri : arrayList) {
                if (this.c.n3(uri)) {
                    this.c.O.c(zzaa.w3(uri, this.c.Y, "1").toString(), null);
                } else {
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u7)).booleanValue()) {
                        this.c.O.c(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        try {
            this.a.a("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
