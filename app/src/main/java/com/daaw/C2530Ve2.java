package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbfc;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Ve2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530Ve2 {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final zzg a;
    public final FF2 b;
    public final C9371we2 c;
    public final C7969re2 d;
    public final C5175hf2 e;
    public final C8532tf2 f;
    public final Executor g;
    public final Executor h;
    public final zzbfc i;
    public final C7133oe2 j;

    public C2530Ve2(zzg zzgVar, FF2 ff2, C9371we2 c9371we2, C7969re2 c7969re2, C5175hf2 c5175hf2, C8532tf2 c8532tf2, Executor executor, Executor executor2, C7133oe2 c7133oe2) {
        this.a = zzgVar;
        this.b = ff2;
        this.i = ff2.i;
        this.c = c9371we2;
        this.d = c7969re2;
        this.e = c5175hf2;
        this.f = c8532tf2;
        this.g = executor;
        this.h = executor2;
        this.j = c7133oe2;
    }

    public static void h(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final /* synthetic */ void a(ViewGroup viewGroup) {
        C7969re2 c7969re2 = this.d;
        if (c7969re2.S() != null) {
            boolean z = viewGroup != null;
            if (c7969re2.P() == 2 || c7969re2.P() == 1) {
                this.a.zzJ(this.b.f, String.valueOf(c7969re2.P()), z);
            } else if (c7969re2.P() == 6) {
                this.a.zzJ(this.b.f, "2", z);
                this.a.zzJ(this.b.f, "1", z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(com.daaw.InterfaceViewOnClickListenerC9097vf2 r10) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2530Ve2.b(com.daaw.vf2):void");
    }

    public final void c(InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        if (interfaceViewOnClickListenerC9097vf2 == null || this.e == null || interfaceViewOnClickListenerC9097vf2.zzh() == null || !this.c.g()) {
            return;
        }
        try {
            interfaceViewOnClickListenerC9097vf2.zzh().addView(this.e.a());
        } catch (JW1 e) {
            zze.zzb("web view can not be obtained", e);
        }
    }

    public final void d(InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        if (interfaceViewOnClickListenerC9097vf2 == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC9097vf2.zzf().getContext();
        if (zzbz.zzh(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                AbstractC4274eT1.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.f == null || interfaceViewOnClickListenerC9097vf2.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f.a(interfaceViewOnClickListenerC9097vf2.zzh(), windowManager), zzbz.zzb());
            } catch (JW1 e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void e(final InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        this.g.execute(new Runnable() { // from class: com.daaw.Te2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b(interfaceViewOnClickListenerC9097vf2);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }

    public final boolean i(ViewGroup viewGroup, boolean z) {
        View viewS = z ? this.d.S() : this.d.T();
        if (viewS == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewS.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewS.getParent()).removeView(viewS);
        }
        viewGroup.addView(viewS, ((Boolean) zzba.zzc().b(AbstractC9820yE1.G3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
