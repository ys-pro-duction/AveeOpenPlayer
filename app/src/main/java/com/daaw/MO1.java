package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MO1 {
    public final View a;
    public final Map b;
    public final InterfaceC3156aS1 c;

    public MO1(LO1 lo1) {
        View view = lo1.a;
        this.a = view;
        Map map = lo1.b;
        this.b = map;
        InterfaceC3156aS1 interfaceC3156aS1A = GO1.a(lo1.a.getContext());
        this.c = interfaceC3156aS1A;
        if (interfaceC3156aS1A == null || map.isEmpty()) {
            return;
        }
        try {
            interfaceC3156aS1A.zzf(new zzbtt(BinderC7744qp0.Z2(view).asBinder(), BinderC7744qp0.Z2(map).asBinder()));
        } catch (RemoteException unused) {
            AbstractC4274eT1.zzg("Failed to call remote method.");
        }
    }

    public final void a(List list) {
        if (list == null || list.isEmpty()) {
            AbstractC4274eT1.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.c == null) {
            AbstractC4274eT1.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.c.zzg(list, BinderC7744qp0.Z2(this.a), new KO1(this, list));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void b(List list) {
        if (list == null || list.isEmpty()) {
            AbstractC4274eT1.zzj("No impression urls were passed to recordImpression");
            return;
        }
        InterfaceC3156aS1 interfaceC3156aS1 = this.c;
        if (interfaceC3156aS1 == null) {
            AbstractC4274eT1.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            interfaceC3156aS1.zzh(list, BinderC7744qp0.Z2(this.a), new JO1(this, list));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void c(MotionEvent motionEvent) {
        InterfaceC3156aS1 interfaceC3156aS1 = this.c;
        if (interfaceC3156aS1 == null) {
            AbstractC4274eT1.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            interfaceC3156aS1.zzj(BinderC7744qp0.Z2(motionEvent));
        } catch (RemoteException unused) {
            AbstractC4274eT1.zzg("Failed to call remote method.");
        }
    }

    public final void d(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.c.zzk(new ArrayList(Arrays.asList(uri)), BinderC7744qp0.Z2(this.a), new IO1(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void e(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.c.zzl(list, BinderC7744qp0.Z2(this.a), new HO1(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
