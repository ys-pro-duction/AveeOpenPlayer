package com.daaw;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public final class Zt3 implements DisplayManager.DisplayListener, Xt3 {
    public final DisplayManager a;
    public Tt3 b;

    public Zt3(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static Xt3 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new Zt3(displayManager);
        }
        return null;
    }

    @Override // com.daaw.Xt3
    public final void a(Tt3 tt3) {
        this.b = tt3;
        this.a.registerDisplayListener(this, AbstractC9004vJ2.H(null));
        bu3.b(tt3.a, c());
    }

    public final Display c() {
        return this.a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        Tt3 tt3 = this.b;
        if (tt3 == null || i != 0) {
            return;
        }
        bu3.b(tt3.a, c());
    }

    @Override // com.daaw.Xt3
    public final void zza() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
