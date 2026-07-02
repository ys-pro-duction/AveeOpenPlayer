package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.nU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6809nU1 extends FrameLayout implements InterfaceC4278eU1 {
    public final FU1 B;
    public final FrameLayout C;
    public final View D;
    public final VE1 E;
    public final HU1 F;
    public final long G;
    public final AbstractC4567fU1 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public String O;
    public String[] P;
    public Bitmap Q;
    public final ImageView R;
    public boolean S;

    public C6809nU1(Context context, FU1 fu1, int i, boolean z, VE1 ve1, EU1 eu1) {
        AbstractC4567fU1 textureViewSurfaceTextureListenerC4000dU1;
        VE1 ve12;
        super(context);
        this.B = fu1;
        this.E = ve1;
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AbstractC7506py0.l(fu1.zzj());
        AbstractC4846gU1 abstractC4846gU1 = fu1.zzj().zza;
        GU1 gu1 = new GU1(context, fu1.zzn(), fu1.k0(), ve1, fu1.zzk());
        if (i == 2) {
            textureViewSurfaceTextureListenerC4000dU1 = new XU1(context, gu1, fu1, z, AbstractC4846gU1.a(fu1), eu1);
            ve12 = ve1;
        } else {
            ve12 = ve1;
            textureViewSurfaceTextureListenerC4000dU1 = new TextureViewSurfaceTextureListenerC4000dU1(context, fu1, z, AbstractC4846gU1.a(fu1), eu1, new GU1(context, fu1.zzn(), fu1.k0(), ve1, fu1.zzk()));
        }
        this.H = textureViewSurfaceTextureListenerC4000dU1;
        View view = new View(context);
        this.D = view;
        view.setBackgroundColor(0);
        frameLayout.addView(textureViewSurfaceTextureListenerC4000dU1, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C)).booleanValue()) {
            q();
        }
        this.R = new ImageView(context);
        this.G = ((Long) zzba.zzc().b(AbstractC9820yE1.I)).longValue();
        boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.E)).booleanValue();
        this.L = zBooleanValue;
        if (ve12 != null) {
            ve1.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.F = new HU1(this);
        textureViewSurfaceTextureListenerC4000dU1.u(this);
    }

    public final void A(MotionEvent motionEvent) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.dispatchTouchEvent(motionEvent);
    }

    public final void B(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.z(i);
    }

    public final void C(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.A(i);
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void a(String str, String str2) {
        m("error", "what", str, "extra", str2);
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void b(int i, int i2) {
        if (this.L) {
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.H;
            int iMax = Math.max(i / ((Integer) zzba.zzc().b(abstractC7582qE1)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) zzba.zzc().b(abstractC7582qE1)).intValue(), 1);
            Bitmap bitmap = this.Q;
            if (bitmap != null && bitmap.getWidth() == iMax && this.Q.getHeight() == iMax2) {
                return;
            }
            this.Q = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.S = false;
        }
    }

    public final void c(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.B(i);
    }

    public final void d(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.a(i);
    }

    public final void e(int i) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F)).booleanValue()) {
            this.C.setBackgroundColor(i);
            this.D.setBackgroundColor(i);
        }
    }

    public final void f(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.f(i);
    }

    public final void finalize() throws Throwable {
        try {
            this.F.a();
            final AbstractC4567fU1 abstractC4567fU1 = this.H;
            if (abstractC4567fU1 != null) {
                AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.hU1
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC4567fU1.w();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(String str, String[] strArr) {
        this.O = str;
        this.P = strArr;
    }

    public final void h(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.C.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void i(float f) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.C.e(f);
        abstractC4567fU1.zzn();
    }

    public final void j(float f, float f2) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 != null) {
            abstractC4567fU1.x(f, f2);
        }
    }

    public final void k() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.C.d(false);
        abstractC4567fU1.zzn();
    }

    public final void l() {
        if (this.B.zzi() == null || !this.J || this.K) {
            return;
        }
        this.B.zzi().getWindow().clearFlags(128);
        this.J = false;
    }

    public final void m(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numO = o();
        if (numO != null) {
            map.put("playerId", numO.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.B.U("onVideoEvent", map);
    }

    public final boolean n() {
        return this.R.getParent() != null;
    }

    public final Integer o() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 != null) {
            return abstractC4567fU1.y();
        }
        return null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.F.b();
        } else {
            this.F.a();
            this.N = this.M;
        }
        zzt.zza.post(new Runnable() { // from class: com.daaw.jU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.t(z);
            }
        });
    }

    @Override // android.view.View, com.daaw.InterfaceC4278eU1
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.F.b();
            z = true;
        } else {
            this.F.a();
            this.N = this.M;
            z = false;
        }
        zzt.zza.post(new RunnableC6530mU1(this, z));
    }

    public final void q() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        TextView textView = new TextView(abstractC4567fU1.getContext());
        Resources resourcesD = com.google.android.gms.ads.internal.zzt.zzo().d();
        textView.setText(String.valueOf(resourcesD == null ? "AdMob - " : resourcesD.getString(R.string.watermark_label_prefix)).concat(this.H.q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.C.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.C.bringChildToFront(textView);
    }

    public final void r() {
        this.F.a();
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 != null) {
            abstractC4567fU1.w();
        }
        l();
    }

    public final /* synthetic */ void s() {
        m("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void t(boolean z) {
        m("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void u(Integer num) {
        if (this.H == null) {
            return;
        }
        if (TextUtils.isEmpty(this.O)) {
            m("no_src", new String[0]);
        } else {
            this.H.g(this.O, this.P, num);
        }
    }

    public final void v() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.C.d(true);
        abstractC4567fU1.zzn();
    }

    public final void w() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        long jI = abstractC4567fU1.i();
        if (this.M == jI || jI <= 0) {
            return;
        }
        float f = jI / 1000.0f;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue()) {
            m("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.H.p()), "qoeCachedBytes", String.valueOf(this.H.n()), "qoeLoadedBytes", String.valueOf(this.H.o()), "droppedFrames", String.valueOf(this.H.j()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().a()));
        } else {
            m("timeupdate", "time", String.valueOf(f));
        }
        this.M = jI;
    }

    public final void x() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.r();
    }

    public final void y() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.s();
    }

    public final void z(int i) {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 == null) {
            return;
        }
        abstractC4567fU1.t(i);
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zza() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q1)).booleanValue()) {
            this.F.a();
        }
        m("ended", new String[0]);
        l();
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzc(String str, String str2) {
        m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzd() {
        m("pause", new String[0]);
        l();
        this.I = false;
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zze() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q1)).booleanValue()) {
            this.F.b();
        }
        if (this.B.zzi() != null && !this.J) {
            boolean z = (this.B.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.K = z;
            if (!z) {
                this.B.zzi().getWindow().addFlags(128);
                this.J = true;
            }
        }
        this.I = true;
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzf() {
        AbstractC4567fU1 abstractC4567fU1 = this.H;
        if (abstractC4567fU1 != null && this.N == 0) {
            float fK = abstractC4567fU1.k();
            AbstractC4567fU1 abstractC4567fU12 = this.H;
            m("canplaythrough", "duration", String.valueOf(fK / 1000.0f), "videoWidth", String.valueOf(abstractC4567fU12.m()), "videoHeight", String.valueOf(abstractC4567fU12.l()));
        }
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzg() {
        this.D.setVisibility(4);
        zzt.zza.post(new Runnable() { // from class: com.daaw.iU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.s();
            }
        });
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzh() {
        this.F.b();
        zzt.zza.post(new RunnableC5963kU1(this));
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzi() {
        if (this.S && this.Q != null && !n()) {
            this.R.setImageBitmap(this.Q);
            this.R.invalidate();
            this.C.addView(this.R, new FrameLayout.LayoutParams(-1, -1));
            this.C.bringChildToFront(this.R);
        }
        this.F.a();
        this.N = this.M;
        zzt.zza.post(new RunnableC6251lU1(this));
    }

    @Override // com.daaw.InterfaceC4278eU1
    public final void zzk() {
        if (this.I && n()) {
            this.C.removeView(this.R);
        }
        if (this.H == null || this.Q == null) {
            return;
        }
        long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
        if (this.H.getBitmap(this.Q) != null) {
            this.S = true;
        }
        long jB2 = com.google.android.gms.ads.internal.zzt.zzB().b() - jB;
        if (zze.zzc()) {
            zze.zza("Spinner frame grab took " + jB2 + "ms");
        }
        if (jB2 > this.G) {
            AbstractC4274eT1.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.L = false;
            this.Q = null;
            VE1 ve1 = this.E;
            if (ve1 != null) {
                ve1.d("spinner_jank", Long.toString(jB2));
            }
        }
    }
}
