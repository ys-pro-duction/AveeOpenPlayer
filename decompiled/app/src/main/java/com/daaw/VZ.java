package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class VZ implements UZ {
    public final O90 a;

    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ Context B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.B = context;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = this.B.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public VZ(Context context) {
        G10.g(context, "context");
        this.a = AbstractC3192ab0.b(EnumC7395pb0.D, new a(context));
    }

    @Override // com.daaw.UZ
    public void a(IBinder iBinder) {
        d().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // com.daaw.UZ
    public void b(View view) {
        G10.g(view, "view");
        d().showSoftInput(view, 0);
    }

    @Override // com.daaw.UZ
    public void c(View view) {
        G10.g(view, "view");
        d().restartInput(view);
    }

    public final InputMethodManager d() {
        return (InputMethodManager) this.a.getValue();
    }
}
