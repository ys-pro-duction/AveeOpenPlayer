package com.daaw;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: com.daaw.oa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7114oa3 {
    public final AudioManager a;
    public final Z93 b;
    public InterfaceC6277la3 c;
    public int d;
    public float e = 1.0f;

    public C7114oa3(Context context, Handler handler, InterfaceC6277la3 interfaceC6277la3) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = interfaceC6277la3;
        this.b = new Z93(this, handler);
        this.d = 0;
    }

    public static /* bridge */ /* synthetic */ void c(C7114oa3 c7114oa3, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                c7114oa3.g(3);
                return;
            } else {
                c7114oa3.f(0);
                c7114oa3.g(2);
                return;
            }
        }
        if (i == -1) {
            c7114oa3.f(-1);
            c7114oa3.e();
        } else if (i == 1) {
            c7114oa3.g(1);
            c7114oa3.f(1);
        } else {
            AbstractC3305ay2.f("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    public final float a() {
        return this.e;
    }

    public final int b(boolean z, int i) {
        e();
        return z ? 1 : -1;
    }

    public final void d() {
        this.c = null;
        e();
    }

    public final void e() {
        if (this.d == 0) {
            return;
        }
        if (AbstractC9004vJ2.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        g(0);
    }

    public final void f(int i) {
        InterfaceC6277la3 interfaceC6277la3 = this.c;
        if (interfaceC6277la3 != null) {
            SurfaceHolderCallbackC5725jd3 surfaceHolderCallbackC5725jd3 = (SurfaceHolderCallbackC5725jd3) interfaceC6277la3;
            boolean zZzv = surfaceHolderCallbackC5725jd3.B.zzv();
            surfaceHolderCallbackC5725jd3.B.S(zZzv, i, Cd3.F(zZzv, i));
        }
    }

    public final void g(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        InterfaceC6277la3 interfaceC6277la3 = this.c;
        if (interfaceC6277la3 != null) {
            ((SurfaceHolderCallbackC5725jd3) interfaceC6277la3).B.P();
        }
    }
}
