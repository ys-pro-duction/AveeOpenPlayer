package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.daaw.C4972gv;
import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: renamed from: com.daaw.wi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9392wi3 implements InterfaceC3661cF1 {
    public final /* synthetic */ C4218eF1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    public C9392wi3(zzt zztVar, C4218eF1 c4218eF1, Context context, Uri uri) {
        this.a = c4218eF1;
        this.b = context;
        this.c = uri;
    }

    @Override // com.daaw.InterfaceC3661cF1
    public final void zza() {
        C4972gv c4972gvA = new C4972gv.b(this.a.a()).a();
        c4972gvA.a.setPackage(AbstractC8673u83.a(this.b));
        c4972gvA.a(this.b, this.c);
        this.a.f((Activity) this.b);
    }
}
