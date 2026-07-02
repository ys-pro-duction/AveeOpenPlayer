package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1635Mv extends AbstractC1799Ok {
    public byte[] i;
    public int j;
    public volatile boolean k;

    public AbstractC1635Mv(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(interfaceC2595Vv, c2907Yv, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = bArr;
    }

    @Override // com.daaw.C0833Fc0.c
    public final void a() {
        try {
            this.h.d(this.a);
            int iC = 0;
            this.j = 0;
            while (iC != -1 && !this.k) {
                g();
                iC = this.h.c(this.i, this.j, 16384);
                if (iC != -1) {
                    this.j += iC;
                }
            }
            if (!this.k) {
                e(this.i, this.j);
            }
            AbstractC6280lb1.h(this.h);
        } catch (Throwable th) {
            AbstractC6280lb1.h(this.h);
            throw th;
        }
    }

    @Override // com.daaw.C0833Fc0.c
    public final void b() {
        this.k = true;
    }

    @Override // com.daaw.AbstractC1799Ok
    public long c() {
        return this.j;
    }

    public abstract void e(byte[] bArr, int i);

    public byte[] f() {
        return this.i;
    }

    public final void g() {
        byte[] bArr = this.i;
        if (bArr == null) {
            this.i = new byte[16384];
        } else if (bArr.length < this.j + 16384) {
            this.i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
