package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.daaw.AbstractC6559mb1;
import com.daaw.C1680Ng0;
import com.daaw.C5343iF0;
import com.daaw.EnumC0591Cw;
import com.daaw.InterfaceC1468Lf;
import com.daaw.InterfaceC1883Pf;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceC1468Lf {
    public static final Set a = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);
    public static final Queue b = AbstractC6559mb1.d(0);
    public static final a c = new C0043a();
    public static final a d = new b();
    public static final a e = new c();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    public static class C0043a extends a {
        @Override // com.daaw.InterfaceC1468Lf
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    }

    public static class b extends a {
        @Override // com.daaw.InterfaceC1468Lf
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return iMax << (iMax >= iCeil ? 0 : 1);
        }
    }

    public static class c extends a {
        @Override // com.daaw.InterfaceC1468Lf
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            return 0;
        }
    }

    public static Bitmap b(C1680Ng0 c1680Ng0, C5343iF0 c5343iF0, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            c1680Ng0.mark(5242880);
        } else {
            c5343iF0.c();
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c1680Ng0, null, options);
        try {
            if (options.inJustDecodeBounds) {
                c1680Ng0.reset();
            }
        } catch (IOException unused) {
        }
        return bitmapDecodeStream;
    }

    public static Bitmap.Config d(InputStream inputStream, EnumC0591Cw enumC0591Cw) {
        boolean zF;
        if (enumC0591Cw == EnumC0591Cw.ALWAYS_ARGB_8888 || enumC0591Cw == EnumC0591Cw.PREFER_ARGB_8888) {
            return Bitmap.Config.ARGB_8888;
        }
        inputStream.mark(1024);
        try {
            try {
                zF = new ImageHeaderParser(inputStream).f();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Objects.toString(enumC0591Cw);
                }
                try {
                    inputStream.reset();
                } catch (IOException unused2) {
                }
                zF = false;
            }
            return zF ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        } finally {
            try {
                inputStream.reset();
            } catch (IOException unused3) {
            }
        }
    }

    public static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = b;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            j(options);
        }
        return options;
    }

    public static void i(BitmapFactory.Options options) {
        j(options);
        Queue queue = b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static void k(BitmapFactory.Options options, Bitmap bitmap) {
        options.inBitmap = bitmap;
    }

    public static boolean l(InputStream inputStream) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0022, B:6:0x002f, B:16:0x0040, B:19:0x006f, B:21:0x0079, B:23:0x007f, B:28:0x0091, B:29:0x0096, B:12:0x0038, B:13:0x003b, B:14:0x003c, B:5:0x0026), top: B:35:0x0022, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap a(java.io.InputStream r22, com.daaw.InterfaceC1883Pf r23, int r24, int r25, com.daaw.EnumC0591Cw r26) {
        /*
            r21 = this;
            com.daaw.bi r10 = com.daaw.C3505bi.a()
            byte[] r11 = r10.b()
            byte[] r12 = r10.b()
            android.graphics.BitmapFactory$Options r4 = e()
            com.daaw.iF0 r3 = new com.daaw.iF0
            r0 = r22
            r3.<init>(r0, r12)
            com.daaw.mI r13 = com.daaw.C6480mI.c(r3)
            com.daaw.Ng0 r2 = new com.daaw.Ng0
            r2.<init>(r13)
            r0 = 5242880(0x500000, float:7.34684E-39)
            r13.mark(r0)     // Catch: java.lang.Throwable -> L33
            r0 = 0
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser r1 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3c
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3c
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3c
            r13.reset()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            goto L35
        L33:
            r0 = move-exception
            goto L97
        L35:
            r14 = r1
            goto L40
        L37:
            r0 = move-exception
            r13.reset()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L33
        L3c:
            r13.reset()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3f
        L3f:
            r14 = 0
        L40:
            r4.inTempStorage = r11     // Catch: java.lang.Throwable -> L33
            r15 = r21
            int[] r1 = r15.f(r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            r17 = r1[r0]     // Catch: java.lang.Throwable -> L33
            r0 = 1
            r18 = r1[r0]     // Catch: java.lang.Throwable -> L33
            int r16 = com.daaw.AbstractC7262p51.c(r14)     // Catch: java.lang.Throwable -> L33
            r19 = r24
            r20 = r25
            int r8 = r15.g(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L33
            r1 = r21
            r5 = r23
            r9 = r26
            r6 = r17
            r7 = r18
            android.graphics.Bitmap r0 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L33
            java.io.IOException r1 = r13.a()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L91
            if (r0 == 0) goto L83
            android.graphics.Bitmap r1 = com.daaw.AbstractC7262p51.f(r0, r5, r14)     // Catch: java.lang.Throwable -> L33
            boolean r2 = r0.equals(r1)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L84
            boolean r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L84
            r0.recycle()     // Catch: java.lang.Throwable -> L33
            goto L84
        L83:
            r1 = 0
        L84:
            r10.c(r11)
            r10.c(r12)
            r13.d()
            i(r4)
            return r1
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L97:
            r10.c(r11)
            r10.c(r12)
            r13.d()
            i(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.a(java.io.InputStream, com.daaw.Pf, int, int, com.daaw.Cw):android.graphics.Bitmap");
    }

    public final Bitmap c(C1680Ng0 c1680Ng0, C5343iF0 c5343iF0, BitmapFactory.Options options, InterfaceC1883Pf interfaceC1883Pf, int i, int i2, int i3, EnumC0591Cw enumC0591Cw) {
        Bitmap.Config configD = d(c1680Ng0, enumC0591Cw);
        options.inSampleSize = i3;
        options.inPreferredConfig = configD;
        if (l(c1680Ng0)) {
            double d2 = i3;
            k(options, interfaceC1883Pf.e((int) Math.ceil(((double) i) / d2), (int) Math.ceil(((double) i2) / d2), configD));
        }
        return b(c1680Ng0, c5343iF0, options);
    }

    public int[] f(C1680Ng0 c1680Ng0, C5343iF0 c5343iF0, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        b(c1680Ng0, c5343iF0, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public final int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        int iH = (i == 90 || i == 270) ? h(i3, i2, i4, i5) : h(i2, i3, i4, i5);
        return Math.max(1, iH == 0 ? 0 : Integer.highestOneBit(iH));
    }

    public abstract int h(int i, int i2, int i3, int i4);
}
