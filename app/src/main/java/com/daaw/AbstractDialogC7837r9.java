package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC8081s2;
import com.daaw.J70;

/* JADX INFO: renamed from: com.daaw.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC7837r9 extends DialogC9139vo implements T8 {
    public Z8 E;
    public final J70.a F;

    public AbstractDialogC7837r9(Context context, int i) {
        super(context, g(context, i));
        this.F = new J70.a() { // from class: com.daaw.q9
            @Override // com.daaw.J70.a
            public final boolean s(KeyEvent keyEvent) {
                return this.B.i(keyEvent);
            }
        };
        Z8 z8F = f();
        z8F.R(g(context, i));
        z8F.B(null);
    }

    public static int g(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(KC0.x, typedValue, true);
        return typedValue.resourceId;
    }

    private void h() {
        AbstractC2217Se1.b(getWindow().getDecorView(), this);
        AbstractC2425Ue1.b(getWindow().getDecorView(), this);
        AbstractC2321Te1.a(getWindow().getDecorView(), this);
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().C();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return J70.e(this.F, getWindow().getDecorView(), this, keyEvent);
    }

    public Z8 f() {
        if (this.E == null) {
            this.E = Z8.m(this, this);
        }
        return this.E;
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return f().n(i);
    }

    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().y();
    }

    public boolean j(int i) {
        return f().K(i);
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().x();
        super.onCreate(bundle);
        f().B(bundle);
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void onStop() {
        super.onStop();
        f().H();
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void setContentView(int i) {
        h();
        f().M(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().S(charSequence);
    }

    @Override // com.daaw.T8
    public AbstractC8081s2 t(AbstractC8081s2.a aVar) {
        return null;
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void setContentView(View view) {
        h();
        f().N(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        f().S(getContext().getString(i));
    }

    @Override // com.daaw.DialogC9139vo, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        f().O(view, layoutParams);
    }

    @Override // com.daaw.T8
    public void o(AbstractC8081s2 abstractC8081s2) {
    }

    @Override // com.daaw.T8
    public void r(AbstractC8081s2 abstractC8081s2) {
    }
}
