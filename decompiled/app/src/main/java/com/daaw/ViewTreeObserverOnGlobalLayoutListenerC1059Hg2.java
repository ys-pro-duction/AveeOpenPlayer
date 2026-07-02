package com.daaw;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Hg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1059Hg2 extends AbstractBinderC3960dK1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ZF1 {
    public View B;
    public zzdq C;
    public C6575me2 D;
    public boolean E = false;
    public boolean F = false;

    public ViewTreeObserverOnGlobalLayoutListenerC1059Hg2(C6575me2 c6575me2, C7969re2 c7969re2) {
        this.B = c7969re2.S();
        this.C = c7969re2.W();
        this.D = c6575me2;
        if (c7969re2.f0() != null) {
            c7969re2.f0().E(this);
        }
    }

    public static final void Z2(InterfaceC5085hK1 interfaceC5085hK1, int i) {
        try {
            interfaceC5085hK1.zze(i);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    private final void zzg() {
        View view;
        C6575me2 c6575me2 = this.D;
        if (c6575me2 == null || (view = this.B) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c6575me2.d0(view, map, map, C6575me2.C(view));
    }

    private final void zzh() {
        View view = this.B;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.B);
        }
    }

    @Override // com.daaw.InterfaceC4238eK1
    public final void N0(InterfaceC7934rX interfaceC7934rX, InterfaceC5085hK1 interfaceC5085hK1) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        if (this.E) {
            AbstractC4274eT1.zzg("Instream ad can not be shown after destroy().");
            Z2(interfaceC5085hK1, 2);
            return;
        }
        View view = this.B;
        if (view == null || this.C == null) {
            AbstractC4274eT1.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            Z2(interfaceC5085hK1, 0);
            return;
        }
        if (this.F) {
            AbstractC4274eT1.zzg("Instream ad should not be used again.");
            Z2(interfaceC5085hK1, 1);
            return;
        }
        this.F = true;
        zzh();
        ((ViewGroup) BinderC7744qp0.I(interfaceC7934rX)).addView(this.B, new ViewGroup.LayoutParams(-1, -1));
        zzt.zzx();
        JT1.a(this.B, this);
        zzt.zzx();
        JT1.b(this.B, this);
        zzg();
        try {
            interfaceC5085hK1.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.daaw.InterfaceC4238eK1
    public final zzdq zzb() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        if (!this.E) {
            return this.C;
        }
        AbstractC4274eT1.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.daaw.InterfaceC4238eK1
    public final InterfaceC7311pG1 zzc() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        if (this.E) {
            AbstractC4274eT1.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        C6575me2 c6575me2 = this.D;
        if (c6575me2 == null || c6575me2.M() == null) {
            return null;
        }
        return c6575me2.M().a();
    }

    @Override // com.daaw.InterfaceC4238eK1
    public final void zzd() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        zzh();
        C6575me2 c6575me2 = this.D;
        if (c6575me2 != null) {
            c6575me2.a();
        }
        this.D = null;
        this.B = null;
        this.C = null;
        this.E = true;
    }

    @Override // com.daaw.InterfaceC4238eK1
    public final void zze(InterfaceC7934rX interfaceC7934rX) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        N0(interfaceC7934rX, new BinderC0955Gg2(this));
    }
}
