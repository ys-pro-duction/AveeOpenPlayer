package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.hp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5225hp2 implements InterfaceC7676qb2 {
    public final String D;
    public final InterfaceC6483mI2 E;
    public boolean B = false;
    public boolean C = false;
    public final zzg F = zzt.zzo().h();

    public C5225hp2(String str, InterfaceC6483mI2 interfaceC6483mI2) {
        this.D = str;
        this.E = interfaceC6483mI2;
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void a(String str, String str2) {
        C6204lI2 c6204lI2B = b("adapter_init_finished");
        c6204lI2B.a("ancn", str);
        c6204lI2B.a("rqe", str2);
        this.E.a(c6204lI2B);
    }

    public final C6204lI2 b(String str) {
        String str2 = this.F.zzQ() ? "" : this.D;
        C6204lI2 c6204lI2B = C6204lI2.b(str);
        c6204lI2B.a("tms", Long.toString(zzt.zzB().b(), 10));
        c6204lI2B.a("tid", str2);
        return c6204lI2B;
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void l(String str) {
        C6204lI2 c6204lI2B = b("adapter_init_finished");
        c6204lI2B.a("ancn", str);
        this.E.a(c6204lI2B);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void o(String str) {
        C6204lI2 c6204lI2B = b("adapter_init_started");
        c6204lI2B.a("ancn", str);
        this.E.a(c6204lI2B);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void zza(String str) {
        C6204lI2 c6204lI2B = b("aaia");
        c6204lI2B.a("aair", "MalformedJson");
        this.E.a(c6204lI2B);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final synchronized void zze() {
        if (this.C) {
            return;
        }
        this.E.a(b("init_finished"));
        this.C = true;
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final synchronized void zzf() {
        if (this.B) {
            return;
        }
        this.E.a(b("init_started"));
        this.B = true;
    }
}
