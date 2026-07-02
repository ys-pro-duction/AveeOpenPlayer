package com.daaw;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BW1 implements InterfaceC6244lS2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ FW1 d;

    public BW1(FW1 fw1, List list, String str, Uri uri) {
        this.d = fw1;
        this.a = list;
        this.b = str;
        this.c = uri;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list = this.a;
        String str = this.b;
        this.d.t((Map) obj, list, str);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        AbstractC4274eT1.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.c)));
    }
}
