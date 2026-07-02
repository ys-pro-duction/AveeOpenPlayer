package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.le2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6296le2 implements InterfaceC6244lS2 {
    public final /* synthetic */ View a;
    public final /* synthetic */ C6575me2 b;

    public C6296le2(C6575me2 c6575me2, View view) {
        this.b = c6575me2;
        this.a = view;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.b.J(this.a, (AbstractC9841yJ2) obj);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "omid native display exp");
    }
}
