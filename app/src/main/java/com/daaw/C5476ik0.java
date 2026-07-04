package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.ik0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5476ik0 extends AbstractC1048He implements Handler.Callback {
    public final InterfaceC3794ck0 K;
    public final InterfaceC5198hk0 L;
    public final Handler M;
    public final C5103hP N;
    public final C4073dk0 O;
    public final Metadata[] P;
    public final long[] Q;
    public int R;
    public int S;
    public InterfaceC3516bk0 T;
    public boolean U;

    public C5476ik0(InterfaceC5198hk0 interfaceC5198hk0, Looper looper) {
        this(interfaceC5198hk0, looper, InterfaceC3794ck0.a);
    }

    @Override // com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        I();
        this.U = false;
    }

    @Override // com.daaw.AbstractC1048He
    public void E(Format[] formatArr, long j) {
        this.T = this.K.c(formatArr[0]);
    }

    public final void I() {
        Arrays.fill(this.P, (Object) null);
        this.R = 0;
        this.S = 0;
    }

    public final void J(Metadata metadata) {
        Handler handler = this.M;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            K(metadata);
        }
    }

    public final void K(Metadata metadata) {
        this.L.p(metadata);
    }

    @Override // com.daaw.VH0
    public boolean a() {
        return true;
    }

    @Override // com.daaw.WH0
    public int b(Format format) {
        if (this.K.b(format)) {
            return AbstractC1048He.H(null, format.J) ? 4 : 2;
        }
        return 0;
    }

    @Override // com.daaw.VH0
    public boolean c() {
        return this.U;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        K((Metadata) message.obj);
        return true;
    }

    @Override // com.daaw.VH0
    public void p(long j, long j2) {
        if (!this.U && this.S < 5) {
            this.O.l();
            if (F(this.N, this.O, false) == -4) {
                if (this.O.p()) {
                    this.U = true;
                } else if (!this.O.o()) {
                    C4073dk0 c4073dk0 = this.O;
                    c4073dk0.G = this.N.a.X;
                    c4073dk0.u();
                    int i = (this.R + this.S) % 5;
                    this.P[i] = this.T.a(this.O);
                    this.Q[i] = this.O.E;
                    this.S++;
                }
            }
        }
        if (this.S > 0) {
            long[] jArr = this.Q;
            int i2 = this.R;
            if (jArr[i2] <= j) {
                J(this.P[i2]);
                Metadata[] metadataArr = this.P;
                int i3 = this.R;
                metadataArr[i3] = null;
                this.R = (i3 + 1) % 5;
                this.S--;
            }
        }
    }

    @Override // com.daaw.AbstractC1048He
    public void z() {
        I();
        this.T = null;
    }

    public C5476ik0(InterfaceC5198hk0 interfaceC5198hk0, Looper looper, InterfaceC3794ck0 interfaceC3794ck0) {
        super(4);
        this.L = (InterfaceC5198hk0) AbstractC7115ob.e(interfaceC5198hk0);
        this.M = looper == null ? null : new Handler(looper, this);
        this.K = (InterfaceC3794ck0) AbstractC7115ob.e(interfaceC3794ck0);
        this.N = new C5103hP();
        this.O = new C4073dk0();
        this.P = new Metadata[5];
        this.Q = new long[5];
    }
}
