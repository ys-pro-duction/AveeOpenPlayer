package com.daaw;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.Gd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0942Gd1 implements InterfaceC1468Lf {
    public static final a c = new a();
    public a a;
    public int b;

    /* JADX INFO: renamed from: com.daaw.Gd1$a */
    public static class a {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public C0942Gd1() {
        this(c, -1);
    }

    public Bitmap a(ParcelFileDescriptor parcelFileDescriptor, InterfaceC1883Pf interfaceC1883Pf, int i, int i2, EnumC0591Cw enumC0591Cw) throws IOException {
        MediaMetadataRetriever mediaMetadataRetrieverA = this.a.a();
        mediaMetadataRetrieverA.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i3 = this.b;
        Bitmap frameAtTime = i3 >= 0 ? mediaMetadataRetrieverA.getFrameAtTime(i3) : mediaMetadataRetrieverA.getFrameAtTime();
        mediaMetadataRetrieverA.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }

    public C0942Gd1(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }
}
