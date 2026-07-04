package com.daaw;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;

/* JADX INFO: renamed from: com.daaw.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC9139vo extends Dialog implements InterfaceC1764Ob0, InterfaceC3824cq0, InterfaceC3135aN0 {
    public androidx.lifecycle.l B;
    public final ZM0 C;
    public final C3267aq0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC9139vo(Context context, int i) {
        super(context, i);
        G10.g(context, "context");
        this.C = ZM0.d.a(this);
        this.D = new C3267aq0(new Runnable() { // from class: com.daaw.uo
            @Override // java.lang.Runnable
            public final void run() {
                DialogC9139vo.e(this.B);
            }
        });
    }

    public static final void e(DialogC9139vo dialogC9139vo) {
        G10.g(dialogC9139vo, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        G10.g(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.l b() {
        androidx.lifecycle.l lVar = this.B;
        if (lVar != null) {
            return lVar;
        }
        androidx.lifecycle.l lVar2 = new androidx.lifecycle.l(this);
        this.B = lVar2;
        return lVar2;
    }

    @Override // com.daaw.InterfaceC3824cq0
    public final C3267aq0 c() {
        return this.D;
    }

    public void d() {
        Window window = getWindow();
        G10.d(window);
        View decorView = window.getDecorView();
        G10.f(decorView, "window!!.decorView");
        AbstractC2217Se1.b(decorView, this);
        Window window2 = getWindow();
        G10.d(window2);
        View decorView2 = window2.getDecorView();
        G10.f(decorView2, "window!!.decorView");
        AbstractC2321Te1.a(decorView2, this);
        Window window3 = getWindow();
        G10.d(window3);
        View decorView3 = window3.getDecorView();
        G10.f(decorView3, "window!!.decorView");
        AbstractC2425Ue1.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.D.k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C3267aq0 c3267aq0 = this.D;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            G10.f(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c3267aq0.n(onBackInvokedDispatcher);
        }
        this.C.d(bundle);
        b().i(g.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        G10.f(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.C.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().i(g.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().i(g.a.ON_DESTROY);
        this.B = null;
        super.onStop();
    }

    @Override // com.daaw.InterfaceC3135aN0
    public YM0 p() {
        return this.C.b();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // com.daaw.InterfaceC1764Ob0
    public androidx.lifecycle.g w() {
        return b();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        G10.g(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        G10.g(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
