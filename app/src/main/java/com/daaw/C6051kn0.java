package com.daaw;

import android.media.audiofx.Virtualizer;
import android.media.audiofx.Visualizer;
import com.daaw.avee.comp.playback.a;

/* JADX INFO: renamed from: com.daaw.kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6051kn0 {
    public Visualizer c;
    public byte[] b = new byte[1];
    public int d = -1;
    public Virtualizer e = null;
    public boolean a = false;

    public static int b(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    public com.daaw.avee.comp.playback.a a(long j, a.h hVar, com.daaw.avee.comp.playback.a aVar, int i, boolean z) {
        if (this.a) {
            return null;
        }
        int i2 = 0;
        if (z) {
            i = 0;
        }
        if (this.c == null || this.d != i) {
            try {
                AbstractC0441Bk1.a("### audioSessionId: " + i);
                Visualizer visualizer = new Visualizer(i);
                this.c = visualizer;
                this.d = i;
                visualizer.setScalingMode(0);
            } catch (RuntimeException e) {
                AbstractC0441Bk1.a("### visualizer exception: " + e.getMessage());
                this.a = true;
                this.d = -1;
            }
        }
        Visualizer visualizer2 = this.c;
        if (visualizer2 == null) {
            return null;
        }
        int captureSize = visualizer2.getCaptureSize();
        int iB = b(hVar.d);
        int[] captureSizeRange = Visualizer.getCaptureSizeRange();
        int iMax = Math.max(captureSizeRange[0], Math.min(captureSizeRange[1], iB));
        aVar.e(44100, hVar.a, iMax, 0, false);
        if (iMax != captureSize) {
            this.c.setEnabled(false);
            try {
                this.c.setCaptureSize(iMax);
                captureSize = iMax;
            } catch (IllegalStateException unused) {
            }
        }
        if (this.b.length != captureSize) {
            this.b = new byte[captureSize];
        }
        if (!this.c.getEnabled()) {
            this.c.setEnabled(true);
        }
        try {
            this.c.getWaveForm(this.b);
        } catch (IllegalStateException unused2) {
        }
        int iMin = Math.min(this.b.length, aVar.b());
        int i3 = aVar.b;
        float f = 0.0f;
        if (i3 == 1) {
            while (i2 < iMin) {
                short s = (short) (((short) ((this.b[i2] & 255) - 128)) * 300);
                aVar.c[i2 * aVar.b] = s;
                if (aVar.d > s) {
                    aVar.d = s;
                }
                if (aVar.e < s) {
                    aVar.e = s;
                }
                f += r14[r0 * i2] / 255.0f;
                i2++;
            }
        } else if (i3 == 2) {
            while (i2 < iMin) {
                short s2 = (short) (((short) ((this.b[i2] & 255) - 128)) * 300);
                short[] sArr = aVar.c;
                int i4 = aVar.b;
                sArr[i2 * i4] = s2;
                sArr[(i2 * i4) + 1] = s2;
                if (aVar.d > s2) {
                    aVar.d = s2;
                }
                if (aVar.e < s2) {
                    aVar.e = s2;
                }
                f += sArr[i4 * i2] / 255.0f;
                i2++;
            }
        }
        aVar.g = f / aVar.b();
        aVar.a = true;
        return aVar;
    }

    public void c() {
        Visualizer visualizer = this.c;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.c.release();
        }
        Virtualizer virtualizer = this.e;
        if (virtualizer != null) {
            virtualizer.setEnabled(true);
            this.e.setEnabled(false);
            this.e.release();
        }
    }

    public void d() {
        this.a = false;
    }
}
