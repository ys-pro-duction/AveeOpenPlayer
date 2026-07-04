package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.wY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9340wY implements NI0 {
    public final NI0 a;
    public final NI0 b;

    public C9340wY(NI0 ni0, NI0 ni02) {
        this.a = ni0;
        this.b = ni02;
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KI0 c(AY ay, int i, int i2) {
        KI0 ki0C;
        ParcelFileDescriptor parcelFileDescriptorA;
        InputStream inputStreamB = ay.b();
        if (inputStreamB != null) {
            try {
                ki0C = this.a.c(inputStreamB, i, i2);
            } catch (IOException unused) {
                ki0C = null;
            }
        } else {
            ki0C = null;
        }
        return (ki0C != null || (parcelFileDescriptorA = ay.a()) == null) ? ki0C : this.b.c(parcelFileDescriptorA, i, i2);
    }

    @Override // com.daaw.NI0
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
