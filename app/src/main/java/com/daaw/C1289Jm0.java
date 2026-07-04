package com.daaw;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Jm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1289Jm0 extends AbstractC4063di0 {
    public int J0;
    public int K0;
    public String L0;
    public int M0;
    public IX N0;
    public WeakReference O0;
    public int P0;

    public C1289Jm0(IX ix, int i, WeakReference weakReference, Context context, InterfaceC4909gi0 interfaceC4909gi0, InterfaceC7580qE interfaceC7580qE, boolean z, Handler handler, InterfaceC2931Zb interfaceC2931Zb, C2201Sb c2201Sb, InterfaceC2827Yb... interfaceC2827YbArr) {
        super(context, interfaceC4909gi0, interfaceC7580qE, z, handler, interfaceC2931Zb, c2201Sb, interfaceC2827YbArr);
        this.J0 = 44100;
        this.K0 = 2;
        this.L0 = "audio/raw";
        this.P0 = 0;
        this.O0 = weakReference;
        this.M0 = i;
        this.N0 = ix;
        AbstractC1262Jf1.a(this, i, ix);
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void A(boolean z) {
        IX ixB = AbstractC1262Jf1.b(this, this.M0, this.N0);
        if (ixB != null) {
            ixB.e(true);
        }
        super.A(z);
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        super.B(j, z);
    }

    @Override // com.daaw.AbstractC4063di0
    public void E0(int i) {
        super.E0(i);
        IX ixB = AbstractC1262Jf1.b(this, this.M0, this.N0);
        if (ixB != null) {
            ixB.a(i);
        }
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0
    public void f0(Format format) {
        super.f0(format);
        int i = format.C;
        if (i < 0) {
            this.P0 = 16;
        } else {
            this.P0 = (i / format.T) / format.S;
        }
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0
    public void g0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws VI {
        this.J0 = 44100;
        this.K0 = 2;
        this.L0 = "audio/raw";
        if (mediaFormat.containsKey("sample-rate")) {
            this.J0 = mediaFormat.getInteger("sample-rate");
        }
        if (mediaFormat.containsKey("channel-count")) {
            this.K0 = mediaFormat.getInteger("channel-count");
        }
        if (mediaFormat.containsKey("mime")) {
            this.L0 = mediaFormat.getString("mime");
        }
        super.g0(mediaCodec, mediaFormat);
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0
    public boolean k0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        IX ixB = AbstractC1262Jf1.b(this, this.M0, this.N0);
        if (!z && (i2 & 2) == 0 && ixB != null && i >= 0 && i < 8192 && byteBuffer != null) {
            ixB.c(byteBuffer, j3, i, this.J0, this.K0, this.P0, j);
        }
        return super.k0(j, j2, mediaCodec, byteBuffer, i, i2, j3, z);
    }

    @Override // com.daaw.AbstractC4063di0, com.daaw.AbstractC4630fi0, com.daaw.AbstractC1048He
    public void z() {
        IX ixB = AbstractC1262Jf1.b(this, this.M0, this.N0);
        if (ixB != null) {
            ixB.e(false);
        }
        super.z();
    }
}
