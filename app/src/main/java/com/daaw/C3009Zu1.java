package com.daaw;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: renamed from: com.daaw.Zu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3009Zu1 extends K73 {
    public Date M;
    public Date N;
    public long O;
    public long P;
    public double Q;
    public float R;
    public U73 S;
    public long T;

    public C3009Zu1() {
        super("mvhd");
        this.Q = 1.0d;
        this.R = 1.0f;
        this.S = U73.j;
    }

    @Override // com.daaw.I73
    public final void c(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.M = P73.a(AbstractC2593Vu1.f(byteBuffer));
            this.N = P73.a(AbstractC2593Vu1.f(byteBuffer));
            this.O = AbstractC2593Vu1.e(byteBuffer);
            this.P = AbstractC2593Vu1.f(byteBuffer);
        } else {
            this.M = P73.a(AbstractC2593Vu1.e(byteBuffer));
            this.N = P73.a(AbstractC2593Vu1.e(byteBuffer));
            this.O = AbstractC2593Vu1.e(byteBuffer);
            this.P = AbstractC2593Vu1.e(byteBuffer);
        }
        this.Q = AbstractC2593Vu1.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.R = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        AbstractC2593Vu1.d(byteBuffer);
        AbstractC2593Vu1.e(byteBuffer);
        AbstractC2593Vu1.e(byteBuffer);
        this.S = new U73(AbstractC2593Vu1.b(byteBuffer), AbstractC2593Vu1.b(byteBuffer), AbstractC2593Vu1.b(byteBuffer), AbstractC2593Vu1.b(byteBuffer), AbstractC2593Vu1.a(byteBuffer), AbstractC2593Vu1.a(byteBuffer), AbstractC2593Vu1.a(byteBuffer), AbstractC2593Vu1.b(byteBuffer), AbstractC2593Vu1.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.T = AbstractC2593Vu1.e(byteBuffer);
    }

    public final long h() {
        return this.P;
    }

    public final long i() {
        return this.O;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.M + ";modificationTime=" + this.N + ";timescale=" + this.O + ";duration=" + this.P + ";rate=" + this.Q + ";volume=" + this.R + ";matrix=" + this.S + ";nextTrackId=" + this.T + "]";
    }
}
