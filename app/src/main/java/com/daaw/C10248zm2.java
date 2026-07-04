package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.daaw.zm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10248zm2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C0346Am2 a;

    public C10248zm2(C0346Am2 c0346Am2) {
        this.a = c0346Am2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C9267wF2 c9267wF2 = (C9267wF2) obj;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue()) {
            this.a.e.i(c9267wF2.b.b.e);
            this.a.e.j(c9267wF2.b.b.f);
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue()) {
            Matcher matcher = C0346Am2.h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.a.e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
