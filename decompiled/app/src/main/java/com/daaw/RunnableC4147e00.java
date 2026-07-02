package com.daaw;

import android.os.Build;
import android.view.View;
import com.daaw.C5184hh1;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4147e00 extends C5184hh1.b implements Runnable, InterfaceC2780Xp0, View.OnAttachStateChangeListener {
    public final C2957Zh1 D;
    public boolean E;
    public C8820uh1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC4147e00(C2957Zh1 c2957Zh1) {
        super(!c2957Zh1.c() ? 1 : 0);
        G10.g(c2957Zh1, "composeInsets");
        this.D = c2957Zh1;
    }

    @Override // com.daaw.InterfaceC2780Xp0
    public C8820uh1 a(View view, C8820uh1 c8820uh1) {
        G10.g(view, "view");
        G10.g(c8820uh1, "insets");
        if (this.E) {
            this.F = c8820uh1;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c8820uh1;
            }
        } else {
            C2957Zh1.g(this.D, c8820uh1, 0, 2, null);
            if (this.D.c()) {
                C8820uh1 c8820uh12 = C8820uh1.b;
                G10.f(c8820uh12, "CONSUMED");
                return c8820uh12;
            }
        }
        return c8820uh1;
    }

    @Override // com.daaw.C5184hh1.b
    public void c(C5184hh1 c5184hh1) {
        G10.g(c5184hh1, "animation");
        this.E = false;
        C8820uh1 c8820uh1 = this.F;
        if (c5184hh1.a() != 0 && c8820uh1 != null) {
            this.D.f(c8820uh1, c5184hh1.c());
        }
        this.F = null;
        super.c(c5184hh1);
    }

    @Override // com.daaw.C5184hh1.b
    public void d(C5184hh1 c5184hh1) {
        G10.g(c5184hh1, "animation");
        this.E = true;
        super.d(c5184hh1);
    }

    @Override // com.daaw.C5184hh1.b
    public C8820uh1 e(C8820uh1 c8820uh1, List list) {
        G10.g(c8820uh1, "insets");
        G10.g(list, "runningAnimations");
        C2957Zh1.g(this.D, c8820uh1, 0, 2, null);
        if (!this.D.c()) {
            return c8820uh1;
        }
        C8820uh1 c8820uh12 = C8820uh1.b;
        G10.f(c8820uh12, "CONSUMED");
        return c8820uh12;
    }

    @Override // com.daaw.C5184hh1.b
    public C5184hh1.a f(C5184hh1 c5184hh1, C5184hh1.a aVar) {
        G10.g(c5184hh1, "animation");
        G10.g(aVar, "bounds");
        this.E = false;
        C5184hh1.a aVarF = super.f(c5184hh1, aVar);
        G10.f(aVarF, "super.onStart(animation, bounds)");
        return aVarF;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        G10.g(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        G10.g(view, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.E) {
            this.E = false;
            C8820uh1 c8820uh1 = this.F;
            if (c8820uh1 != null) {
                C2957Zh1.g(this.D, c8820uh1, 0, 2, null);
                this.F = null;
            }
        }
    }
}
