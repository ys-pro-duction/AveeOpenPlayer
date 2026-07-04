package com.daaw.avee.comp.playback;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Virtualizer;
import com.daaw.AbstractC0405Bb1;
import com.daaw.AbstractC0441Bk1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public C0153b b;
    public d c;
    public String d;
    public int a = 0;
    public boolean e = false;
    public int g = 0;
    public boolean h = false;
    public int j = 0;
    public Equalizer f = null;
    public Virtualizer i = null;

    public class a implements AudioEffect.OnControlStatusChangeListener {
        public a() {
        }

        @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
        public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
            b.this.h = z;
        }
    }

    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public float[] d;
        public float e;
    }

    public interface d {
        void c(C0153b c0153b);

        c d(String str);

        boolean w(String str);
    }

    public b(d dVar, String str) {
        this.c = dVar;
        this.d = str;
        this.b = new C0153b(str);
    }

    public final void b(c cVar, C0153b c0153b) {
        Equalizer equalizer = this.f;
        if (equalizer == null || cVar == null) {
            return;
        }
        boolean enabled = equalizer.getEnabled();
        boolean z = cVar.a;
        if (enabled != z) {
            this.f.setEnabled(z);
        }
        if (cVar.a) {
            try {
                if (cVar.b) {
                    short s = (short) cVar.c;
                    if (s < this.f.getNumberOfPresets() && s >= 0) {
                        this.f.usePreset(s);
                        return;
                    }
                    AbstractC0441Bk1.c("invalid preset: " + ((int) s));
                    return;
                }
                int i = (c0153b.d - c0153b.c) / 2;
                if (cVar.d.length != this.f.getNumberOfBands()) {
                    AbstractC0441Bk1.c("invalid band count " + cVar.d.length);
                    return;
                }
                for (int i2 = 0; i2 < c0153b.f.length; i2++) {
                    this.f.setBandLevel((short) i2, (short) (Math.round(cVar.d[i2] * i) + i + c0153b.c));
                }
            } catch (Exception e) {
                AbstractC0441Bk1.c("Equalizer exception");
                e.printStackTrace();
            }
        }
    }

    public final void c(c cVar) {
        Virtualizer virtualizer = this.i;
        if (virtualizer == null) {
            return;
        }
        virtualizer.setEnabled(cVar.a && cVar.e > 0.0f);
        if (this.i.getStrengthSupported()) {
            this.i.setStrength((short) AbstractC0405Bb1.j(cVar.e * 1000.0f, 0.0f, 1000.0f));
        }
    }

    public C0153b d() {
        f(true, this.a);
        this.c.c(this.b);
        return this.b;
    }

    public String e() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(boolean r7, int r8) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.comp.playback.b.f(boolean, int):boolean");
    }

    public final void g(boolean z, int i) {
        if (i == 0 || !z) {
            l();
            return;
        }
        if (this.i == null || this.j != i) {
            l();
            this.j = i;
            try {
                this.i = new Virtualizer(0, i);
            } catch (Exception unused) {
            }
        }
    }

    public void h(int i) {
        this.a = i;
        boolean z = false;
        if (this.c.w(e())) {
            c cVarD = this.c.d(e());
            boolean z2 = cVarD.a;
            this.e = z2;
            f(z2, i);
            b(cVarD, this.b);
            if (cVarD.a && cVarD.e > 0.0f) {
                z = true;
            }
            g(z, i);
            c(cVarD);
        } else {
            f(false, i);
            g(false, i);
        }
        this.c.c(this.b);
    }

    public void i() {
        if (this.e) {
            return;
        }
        k();
    }

    public void j() {
        k();
        l();
    }

    public final void k() {
        try {
            Equalizer equalizer = this.f;
            if (equalizer != null) {
                equalizer.setControlStatusListener(null);
                this.f.release();
            }
        } catch (Exception unused) {
        }
        this.h = false;
        this.f = null;
        this.g = 0;
    }

    public final void l() {
        try {
            Virtualizer virtualizer = this.i;
            if (virtualizer != null) {
                virtualizer.release();
            }
        } catch (Exception unused) {
        }
        this.i = null;
        this.j = 0;
    }

    public void m(c cVar) {
        boolean z = cVar.a;
        this.e = z;
        f(z, this.a);
        b(cVar, this.b);
        g(cVar.a && cVar.e > 0.0f, this.a);
        c(cVar);
    }

    /* JADX INFO: renamed from: com.daaw.avee.comp.playback.b$b, reason: collision with other inner class name */
    public static class C0153b {
        public static final C0153b g = new C0153b("Default");
        public String a;
        public int b;
        public int c;
        public int d;
        public int[] e;
        public float[] f;

        public C0153b(String str) {
            this.a = str;
            this.b = 0;
            this.c = -1000;
            this.d = 1000;
            this.e = new int[0];
            this.f = new float[0];
        }

        public C0153b() {
        }
    }
}
