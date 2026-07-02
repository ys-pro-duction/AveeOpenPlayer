package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Bw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0490Bw2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final C8826ui2 b;
    public final C2242Sk2 c;
    public final C0707Dw2 d;

    public C0490Bw2(PS2 ps2, C8826ui2 c8826ui2, C2242Sk2 c2242Sk2, C0707Dw2 c0707Dw2) {
        this.a = ps2;
        this.b = c8826ui2;
        this.c = c2242Sk2;
        this.d = c0707Dw2;
    }

    public final /* synthetic */ C0594Cw2 a() {
        List<String> listAsList = Arrays.asList(((String) zzba.zzc().b(AbstractC9820yE1.p1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                C4502fG2 c4502fG2C = this.b.c(str, new JSONObject());
                c4502fG2C.c();
                boolean zT = this.c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Ga)).booleanValue() || zT) {
                    try {
                        zzbrj zzbrjVarK = c4502fG2C.k();
                        if (zzbrjVarK != null) {
                            bundle2.putString("sdk_version", zzbrjVarK.toString());
                        }
                    } catch (KF2 unused) {
                    }
                }
                try {
                    zzbrj zzbrjVarJ = c4502fG2C.j();
                    if (zzbrjVarJ != null) {
                        bundle2.putString("adapter_version", zzbrjVarJ.toString());
                    }
                } catch (KF2 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (KF2 unused3) {
            }
        }
        C0594Cw2 c0594Cw2 = new C0594Cw2(bundle);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Ga)).booleanValue()) {
            this.d.b(c0594Cw2);
        }
        return c0594Cw2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 1;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.Ga;
        if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && this.d.a() != null) {
            C0594Cw2 c0594Cw2A = this.d.a();
            c0594Cw2A.getClass();
            return AbstractC7360pS2.h(c0594Cw2A);
        }
        if (BO2.d((String) zzba.zzc().b(AbstractC9820yE1.p1)) || (!((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && (this.d.d() || !this.c.t()))) {
            return AbstractC7360pS2.h(new C0594Cw2(new Bundle()));
        }
        this.d.c(true);
        return this.a.S0(new Callable() { // from class: com.daaw.Aw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
