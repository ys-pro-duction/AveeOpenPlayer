package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Re2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2112Re2 extends AbstractBinderC8991vG1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC9097vf2 {
    public static final OP2 P = OP2.M("2011", "1009", "3010");
    public final String B;
    public FrameLayout D;
    public FrameLayout E;
    public final PS2 F;
    public View G;
    public C6575me2 I;
    public ViewOnAttachStateChangeListenerC9470wz1 J;
    public InterfaceC7311pG1 L;
    public boolean M;
    public GestureDetector O;
    public Map C = new HashMap();
    public InterfaceC7934rX K = null;
    public boolean N = false;
    public final int H = 233702000;

    public ViewTreeObserverOnGlobalLayoutListenerC2112Re2(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.D = frameLayout;
        this.E = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.B = str;
        zzt.zzx();
        JT1.a(frameLayout, this);
        zzt.zzx();
        JT1.b(frameLayout, this);
        this.F = AbstractC9322wT1.e;
        this.J = new ViewOnAttachStateChangeListenerC9470wz1(this.D.getContext(), this.D);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.E.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.E.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        AbstractC4274eT1.zzk("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.E.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzu() {
        this.F.execute(new Runnable() { // from class: com.daaw.Qe2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a3();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue() || this.I.H() == 0) {
            return;
        }
        this.O = new GestureDetector(this.D.getContext(), new GestureDetectorOnGestureListenerC2738Xe2(this.I, this));
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized void B(String str, View view, boolean z) {
        if (this.N) {
            return;
        }
        if (view == null) {
            this.C.remove(str);
            return;
        }
        this.C.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (zzbz.zzi(this.H)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    public final FrameLayout Z2() {
        return this.D;
    }

    public final /* synthetic */ void a3() {
        if (this.G == null) {
            View view = new View(this.D.getContext());
            this.G = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.D != this.G.getParent()) {
            this.D.addView(this.G);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 == null || !c6575me2.z()) {
            return;
        }
        this.I.X();
        this.I.i(view, this.D, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 != null) {
            FrameLayout frameLayout = this.D;
            c6575me2.d0(frameLayout, zzl(), zzm(), C6575me2.C(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 != null) {
            FrameLayout frameLayout = this.D;
            c6575me2.d0(frameLayout, zzl(), zzm(), C6575me2.C(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 == null) {
            return false;
        }
        c6575me2.p(view, motionEvent, this.D);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue() && this.O != null && this.I.H() != 0) {
            this.O.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized View t(String str) {
        if (this.N) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.C.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized InterfaceC7934rX zzb(String str) {
        return BinderC7744qp0.Z2(t(str));
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzbA(InterfaceC7934rX interfaceC7934rX) {
        this.I.r((View) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzbB(InterfaceC7311pG1 interfaceC7311pG1) {
        if (this.N) {
            return;
        }
        this.M = true;
        this.L = interfaceC7311pG1;
        C6575me2 c6575me2 = this.I;
        if (c6575me2 != null) {
            c6575me2.M().b(interfaceC7311pG1);
        }
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzbC(InterfaceC7934rX interfaceC7934rX) {
        if (this.N) {
            return;
        }
        this.K = interfaceC7934rX;
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzbD(InterfaceC7934rX interfaceC7934rX) {
        if (this.N) {
            return;
        }
        Object objI = BinderC7744qp0.I(interfaceC7934rX);
        if (!(objI instanceof C6575me2)) {
            AbstractC4274eT1.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C6575me2 c6575me2 = this.I;
        if (c6575me2 != null) {
            c6575me2.x(this);
        }
        zzu();
        C6575me2 c6575me22 = (C6575me2) objI;
        this.I = c6575me22;
        c6575me22.w(this);
        this.I.o(this.D);
        this.I.W(this.E);
        if (this.M) {
            this.I.M().b(this.L);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.L3)).booleanValue() && !TextUtils.isEmpty(this.I.Q())) {
            zzt(this.I.Q());
        }
        zzv();
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzbz(String str, InterfaceC7934rX interfaceC7934rX) {
        B(str, (View) BinderC7744qp0.I(interfaceC7934rX), true);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zzc() {
        try {
            if (this.N) {
                return;
            }
            C6575me2 c6575me2 = this.I;
            if (c6575me2 != null) {
                c6575me2.x(this);
                this.I = null;
            }
            this.C.clear();
            this.D.removeAllViews();
            this.E.removeAllViews();
            this.C = null;
            this.D = null;
            this.E = null;
            this.G = null;
            this.J = null;
            this.N = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzd(InterfaceC7934rX interfaceC7934rX) {
        onTouch(this.D, (MotionEvent) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final synchronized void zze(InterfaceC7934rX interfaceC7934rX, int i) {
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final /* synthetic */ View zzf() {
        return this.D;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final FrameLayout zzh() {
        return this.E;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final ViewOnAttachStateChangeListenerC9470wz1 zzi() {
        return this.J;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final InterfaceC7934rX zzj() {
        return this.K;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized String zzk() {
        return this.B;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzl() {
        return this.C;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzm() {
        return this.C;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized JSONObject zzo() {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 == null) {
            return null;
        }
        return c6575me2.S(this.D, zzl(), zzm());
    }

    @Override // com.daaw.InterfaceViewOnClickListenerC9097vf2
    public final synchronized JSONObject zzp() {
        C6575me2 c6575me2 = this.I;
        if (c6575me2 == null) {
            return null;
        }
        return c6575me2.T(this.D, zzl(), zzm());
    }
}
