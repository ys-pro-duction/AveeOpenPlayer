package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbrj;

/* JADX INFO: renamed from: com.daaw.it2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5522it2 {
    public final ZF2 a;
    public final C7989ri2 b;
    public final C1071Hj2 c;
    public final InterfaceC6483mI2 d;

    public C5522it2(ZF2 zf2, C7989ri2 c7989ri2, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2) {
        this.a = zf2;
        this.b = c7989ri2;
        this.c = c1071Hj2;
        this.d = interfaceC6483mI2;
    }

    public final void a(C5622jF2 c5622jF2, C4498fF2 c4498fF2, int i, C3274ar2 c3274ar2, long j) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
            C6204lI2 c6204lI2B = C6204lI2.b("adapter_status");
            c6204lI2B.g(c5622jF2);
            c6204lI2B.f(c4498fF2);
            c6204lI2B.a("adapter_l", String.valueOf(j));
            c6204lI2B.a("sc", Integer.toString(i));
            if (c3274ar2 != null) {
                c6204lI2B.a("arec", Integer.toString(c3274ar2.b().zza));
                String strA = this.a.a(c3274ar2.getMessage());
                if (strA != null) {
                    c6204lI2B.a("areec", strA);
                }
            }
            C7711qi2 c7711qi2B = this.b.b(c4498fF2.v);
            if (c7711qi2B != null) {
                c6204lI2B.a("ancn", c7711qi2B.a);
                zzbrj zzbrjVar = c7711qi2B.b;
                if (zzbrjVar != null) {
                    c6204lI2B.a("adapter_v", zzbrjVar.toString());
                }
                zzbrj zzbrjVar2 = c7711qi2B.c;
                if (zzbrjVar2 != null) {
                    c6204lI2B.a("adapter_sv", zzbrjVar2.toString());
                }
            }
            this.d.a(c6204lI2B);
            return;
        }
        C0967Gj2 c0967Gj2A = this.c.a();
        c0967Gj2A.e(c5622jF2);
        c0967Gj2A.d(c4498fF2);
        c0967Gj2A.b("action", "adapter_status");
        c0967Gj2A.b("adapter_l", String.valueOf(j));
        c0967Gj2A.b("sc", Integer.toString(i));
        if (c3274ar2 != null) {
            c0967Gj2A.b("arec", Integer.toString(c3274ar2.b().zza));
            String strA2 = this.a.a(c3274ar2.getMessage());
            if (strA2 != null) {
                c0967Gj2A.b("areec", strA2);
            }
        }
        C7711qi2 c7711qi2B2 = this.b.b(c4498fF2.v);
        if (c7711qi2B2 != null) {
            c0967Gj2A.b("ancn", c7711qi2B2.a);
            zzbrj zzbrjVar3 = c7711qi2B2.b;
            if (zzbrjVar3 != null) {
                c0967Gj2A.b("adapter_v", zzbrjVar3.toString());
            }
            zzbrj zzbrjVar4 = c7711qi2B2.c;
            if (zzbrjVar4 != null) {
                c0967Gj2A.b("adapter_sv", zzbrjVar4.toString());
            }
        }
        c0967Gj2A.g();
    }
}
