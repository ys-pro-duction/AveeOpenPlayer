package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbz;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.tf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8532tf2 {
    public final C2958Zh2 a;
    public final C6023kh2 b;
    public ViewTreeObserver.OnScrollChangedListener c = null;

    public C8532tf2(C2958Zh2 c2958Zh2, C6023kh2 c6023kh2) {
        this.a = c2958Zh2;
        this.b = c6023kh2;
    }

    public static final int f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return XS1.B(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        InterfaceC9334wW1 interfaceC9334wW1A = this.a.a(zzq.zzc(), null, null);
        View view2 = (View) interfaceC9334wW1A;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        interfaceC9334wW1A.C("/sendMessageToSdk", new HI1() { // from class: com.daaw.jf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.b((InterfaceC9334wW1) obj, map);
            }
        });
        interfaceC9334wW1A.C("/hideValidatorOverlay", new HI1() { // from class: com.daaw.kf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.c(windowManager, view, (InterfaceC9334wW1) obj, map);
            }
        });
        interfaceC9334wW1A.C("/open", new SI1(null, null, null, null, null, null));
        this.b.j(new WeakReference(interfaceC9334wW1A), "/loadNativeAdPolicyViolations", new HI1() { // from class: com.daaw.lf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.e(view, windowManager, (InterfaceC9334wW1) obj, map);
            }
        });
        this.b.j(new WeakReference(interfaceC9334wW1A), "/showValidatorOverlay", new HI1() { // from class: com.daaw.qf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                AbstractC4274eT1.zze("Show native ad policy validator overlay.");
                ((InterfaceC9334wW1) obj).h().setVisibility(0);
            }
        });
        return (View) interfaceC9334wW1A;
    }

    public final /* synthetic */ void b(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void c(WindowManager windowManager, View view, InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        AbstractC4274eT1.zze("Hide native ad policy validator overlay.");
        interfaceC9334wW1.h().setVisibility(8);
        if (interfaceC9334wW1.h().getWindowToken() != null) {
            windowManager.removeView(interfaceC9334wW1.h());
        }
        interfaceC9334wW1.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.c);
    }

    public final /* synthetic */ void d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", map2);
    }

    public final /* synthetic */ void e(final View view, final WindowManager windowManager, InterfaceC9334wW1 interfaceC9334wW1, final Map map) {
        final InterfaceC9334wW1 interfaceC9334wW12;
        interfaceC9334wW1.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.sf2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str, String str2) {
                this.B.d(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iF = f(context, (String) map.get("validator_width"), ((Integer) zzba.zzc().b(AbstractC9820yE1.Q7)).intValue());
        int iF2 = f(context, (String) map.get("validator_height"), ((Integer) zzba.zzc().b(AbstractC9820yE1.R7)).intValue());
        int iF3 = f(context, (String) map.get("validator_x"), 0);
        int iF4 = f(context, (String) map.get("validator_y"), 0);
        interfaceC9334wW1.H(C8494tX1.b(iF, iF2));
        try {
            interfaceC9334wW1.j().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().b(AbstractC9820yE1.S7)).booleanValue());
            interfaceC9334wW1.j().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().b(AbstractC9820yE1.T7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = zzbz.zzb();
        layoutParamsZzb.x = iF3;
        layoutParamsZzb.y = iF4;
        windowManager.updateViewLayout(interfaceC9334wW1.h(), layoutParamsZzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iF4;
            interfaceC9334wW12 = interfaceC9334wW1;
            this.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.daaw.rf2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        InterfaceC9334wW1 interfaceC9334wW13 = interfaceC9334wW12;
                        if (interfaceC9334wW13.h().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(interfaceC9334wW13.h(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.c);
            }
        } else {
            interfaceC9334wW12 = interfaceC9334wW1;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        interfaceC9334wW12.loadUrl(str2);
    }
}
