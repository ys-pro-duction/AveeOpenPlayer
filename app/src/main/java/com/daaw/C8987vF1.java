package com.daaw;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.daaw.AbstractC1969Qa1;
import com.daaw.InterfaceC2263Sq;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.vF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8987vF1 implements InterfaceC2263Sq {
    public final Application a;
    public final C6071kp1 b;
    public final C4834gR1 c;
    public final C0814Ex1 d;
    public final JN1 e;
    public final InterfaceC1483Li2 f;
    public Dialog g;
    public C3148aQ1 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public boolean m = false;

    public C8987vF1(Application application, C6071kp1 c6071kp1, C4834gR1 c4834gR1, C0814Ex1 c0814Ex1, JN1 jn1, InterfaceC1483Li2 interfaceC1483Li2) {
        this.a = application;
        this.b = c6071kp1;
        this.c = c4834gR1;
        this.d = c0814Ex1;
        this.e = jn1;
        this.f = interfaceC1483Li2;
    }

    @Override // com.daaw.InterfaceC2263Sq
    public final void a(Activity activity, InterfaceC2263Sq.a aVar) {
        AbstractC5295i42.a();
        if (!this.i.compareAndSet(false, true)) {
            aVar.a(new C4304ea3(3, true != this.m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        GD1 gd1 = new GD1(this, activity);
        this.a.registerActivityLifecycleCallbacks(gd1);
        this.l.set(gd1);
        this.c.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new C4304ea3(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.k.set(aVar);
        dialog.show();
        this.g = dialog;
        this.h.c("UMP_messagePresented", "");
    }

    public final C3148aQ1 b() {
        return this.h;
    }

    public final void c(AbstractC1969Qa1.b bVar, AbstractC1969Qa1.a aVar) {
        C3148aQ1 c3148aQ1A = ((DQ1) this.f).zzb();
        this.h = c3148aQ1A;
        c3148aQ1A.setBackgroundColor(0);
        c3148aQ1A.getSettings().setJavaScriptEnabled(true);
        c3148aQ1A.setWebViewClient(new C9306wP1(c3148aQ1A, null));
        this.j.set(new QE1(bVar, aVar, 0 == true ? 1 : 0));
        this.h.loadDataWithBaseURL(this.e.a(), this.e.b(), "text/html", "UTF-8", null);
        AbstractC5295i42.a.postDelayed(new Runnable() { // from class: com.daaw.aD1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.g(new C4304ea3(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void d(int i) {
        h();
        InterfaceC2263Sq.a aVar = (InterfaceC2263Sq.a) this.k.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.d.e(3);
        aVar.a(null);
    }

    public final void e(C4304ea3 c4304ea3) {
        h();
        InterfaceC2263Sq.a aVar = (InterfaceC2263Sq.a) this.k.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(c4304ea3.a());
    }

    public final void f() {
        QE1 qe1 = (QE1) this.j.getAndSet(null);
        if (qe1 == null) {
            return;
        }
        qe1.a(this);
    }

    public final void g(C4304ea3 c4304ea3) {
        QE1 qe1 = (QE1) this.j.getAndSet(null);
        if (qe1 == null) {
            return;
        }
        qe1.b(c4304ea3.a());
    }

    public final void h() {
        Dialog dialog = this.g;
        if (dialog != null) {
            dialog.dismiss();
            this.g = null;
        }
        this.c.a(null);
        GD1 gd1 = (GD1) this.l.getAndSet(null);
        if (gd1 != null) {
            gd1.C.a.unregisterActivityLifecycleCallbacks(gd1);
        }
    }
}
