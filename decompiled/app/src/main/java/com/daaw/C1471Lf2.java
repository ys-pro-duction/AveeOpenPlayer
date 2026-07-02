package com.daaw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Lf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1471Lf2 {
    public final zzbq a;
    public final InterfaceC5485im b;
    public final Executor c;

    public C1471Lf2(zzbq zzbqVar, InterfaceC5485im interfaceC5485im, Executor executor) {
        this.a = zzbqVar;
        this.b = interfaceC5485im;
        this.c = executor;
    }

    public final /* synthetic */ Bitmap a(double d, boolean z, C3845cu1 c3845cu1) {
        byte[] bArr = c3845cu1.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.c6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzba.zzc().b(AbstractC9820yE1.d6)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final InterfaceFutureC8236sc0 b(String str, final double d, final boolean z) {
        return AbstractC7360pS2.m(this.a.zza(str), new WN2() { // from class: com.daaw.Kf2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.a(d, z, (C3845cu1) obj);
            }
        }, this.c);
    }

    public final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jB = this.b.b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jB2 = this.b.b();
        if (bitmapDecodeByteArray != null) {
            long j = jB2 - jB;
            zze.zza("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }
}
