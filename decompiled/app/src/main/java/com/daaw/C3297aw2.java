package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.aw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3297aw2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final PS2 b;
    public final Context c;
    public final FF2 d;
    public final View e;

    public C3297aw2(PS2 ps2, PS2 ps22, Context context, FF2 ff2, ViewGroup viewGroup) {
        this.a = ps2;
        this.b = ps22;
        this.c = context;
        this.d = ff2;
        this.e = viewGroup;
    }

    public final /* synthetic */ C3854cw2 a() {
        return new C3854cw2(this.c, this.d.e, c());
    }

    public final /* synthetic */ C3854cw2 b() {
        return new C3854cw2(this.c, this.d.e, c());
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        View view = this.e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 3;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        AbstractC9820yE1.a(this.c);
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.ga)).booleanValue() ? this.b.S0(new Callable() { // from class: com.daaw.Yv2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        }) : this.a.S0(new Callable() { // from class: com.daaw.Zv2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
    }
}
