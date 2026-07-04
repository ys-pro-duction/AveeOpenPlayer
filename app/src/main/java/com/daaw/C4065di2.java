package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: com.daaw.di2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4065di2 {
    public Context a;
    public PopupWindow b;

    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!AbstractC7494pv0.d() || AbstractC7494pv0.f()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            AbstractC4274eT1.zze("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
                popupWindow = null;
            }
        }
        this.b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.a = context;
    }

    public final void b() {
        Context context = this.a;
        if (context == null || this.b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.b.isShowing()) {
            this.b.dismiss();
        }
        this.a = null;
        this.b = null;
    }
}
