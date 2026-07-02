package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.ly2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6392ly2 implements InterfaceC1343Jz2 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public C6392ly2(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.a.isEmpty()) {
            bundle.putString("inspector_extras", this.a);
        }
        bundle.putInt("test_mode", this.b ? 1 : 0);
        bundle.putInt("linked_device", this.c ? 1 : 0);
        if (this.b || this.c) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V8)).booleanValue()) {
                bundle.putInt("risd", !this.d ? 1 : 0);
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.e);
            }
        }
    }
}
