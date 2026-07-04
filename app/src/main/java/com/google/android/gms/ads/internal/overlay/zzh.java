package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.daaw.CD2;
import com.daaw.InterfaceC9334wW1;

/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(InterfaceC9334wW1 interfaceC9334wW1) throws CD2 {
        this.zzb = interfaceC9334wW1.getLayoutParams();
        ViewParent parent = interfaceC9334wW1.getParent();
        this.zzd = interfaceC9334wW1.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new CD2("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(interfaceC9334wW1.h());
        viewGroup.removeView(interfaceC9334wW1.h());
        interfaceC9334wW1.r0(true);
    }
}
