package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Pe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1882Pe2 extends BG1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC9097vf2 {
    public final WeakReference B;
    public final Map C = new HashMap();
    public final Map D = new HashMap();
    public final Map E = new HashMap();
    public C6575me2 F;
    public ViewOnAttachStateChangeListenerC9470wz1 G;

    public ViewTreeObserverOnGlobalLayoutListenerC1882Pe2(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzx();
        JT1.a(view, this);
        zzt.zzx();
        JT1.b(view, this);
        this.B = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.C.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.E.putAll(this.C);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.D.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.E.putAll(this.D);
        this.G = new ViewOnAttachStateChangeListenerC9470wz1(view.getContext(), view);
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized void B(String str, View view, boolean z) {
        this.E.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.C.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.i(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.d0(zzf(), zzl(), zzm(), C6575me2.C(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.d0(zzf(), zzl(), zzm(), C6575me2.C(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.p(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized View t(String str) {
        WeakReference weakReference = (WeakReference) this.E.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.CG1
    public final synchronized void zzb(InterfaceC7934rX interfaceC7934rX) {
        try {
            if (this.F != null) {
                Object objI = BinderC7744qp0.I(interfaceC7934rX);
                if (!(objI instanceof View)) {
                    AbstractC4274eT1.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.F.r((View) objI);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.CG1
    public final synchronized void zzc(InterfaceC7934rX interfaceC7934rX) {
        Object objI = BinderC7744qp0.I(interfaceC7934rX);
        if (!(objI instanceof C6575me2)) {
            AbstractC4274eT1.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.x(this);
        }
        C6575me2 c6575me22 = (C6575me2) objI;
        if (!c6575me22.y()) {
            AbstractC4274eT1.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.F = c6575me22;
        c6575me22.w(this);
        this.F.o(zzf());
    }

    @Override // com.daaw.CG1
    public final synchronized void zzd() {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 != null) {
            c6575me2.x(this);
            this.F = null;
        }
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final View zzf() {
        return (View) this.B.get();
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final ViewOnAttachStateChangeListenerC9470wz1 zzi() {
        return this.G;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized InterfaceC7934rX zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzl() {
        return this.E;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzm() {
        return this.C;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzn() {
        return this.D;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized JSONObject zzp() {
        C6575me2 c6575me2 = this.F;
        if (c6575me2 == null) {
            return null;
        }
        return c6575me2.T(zzf(), zzl(), zzm());
    }
}
