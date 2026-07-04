package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I21 extends AbstractC1048He implements Handler.Callback {
    public final Handler K;
    public final B21 L;
    public final InterfaceC7386pZ0 M;
    public final C5103hP N;
    public boolean O;
    public boolean P;
    public int Q;
    public Format R;
    public InterfaceC6828nZ0 S;
    public C7665qZ0 T;
    public AbstractC7943rZ0 U;
    public AbstractC7943rZ0 V;
    public int W;

    public I21(B21 b21, Looper looper) {
        this(b21, looper, InterfaceC7386pZ0.a);
    }

    @Override // com.daaw.AbstractC1048He
    public void B(long j, boolean z) {
        I();
        this.O = false;
        this.P = false;
        if (this.Q != 0) {
            N();
        } else {
            L();
            this.S.flush();
        }
    }

    @Override // com.daaw.AbstractC1048He
    public void E(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.R = format;
        if (this.S != null) {
            this.Q = 1;
        } else {
            this.S = this.M.c(format);
        }
    }

    public final void I() {
        O(Collections.EMPTY_LIST);
    }

    public final long J() {
        int i = this.W;
        if (i == -1 || i >= this.U.h()) {
            return Long.MAX_VALUE;
        }
        return this.U.c(this.W);
    }

    public final void K(List list) {
        this.L.h(list);
    }

    public final void L() {
        this.T = null;
        this.W = -1;
        AbstractC7943rZ0 abstractC7943rZ0 = this.U;
        if (abstractC7943rZ0 != null) {
            abstractC7943rZ0.s();
            this.U = null;
        }
        AbstractC7943rZ0 abstractC7943rZ02 = this.V;
        if (abstractC7943rZ02 != null) {
            abstractC7943rZ02.s();
            this.V = null;
        }
    }

    public final void M() {
        L();
        this.S.a();
        this.S = null;
        this.Q = 0;
    }

    public final void N() {
        M();
        this.S = this.M.c(this.R);
    }

    public final void O(List list) {
        Handler handler = this.K;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            K(list);
        }
    }

    @Override // com.daaw.VH0
    public boolean a() {
        return true;
    }

    @Override // com.daaw.WH0
    public int b(Format format) {
        return this.M.b(format) ? AbstractC1048He.H(null, format.J) ? 4 : 2 : AbstractC8834uk0.l(format.G) ? 1 : 0;
    }

    @Override // com.daaw.VH0
    public boolean c() {
        return this.P;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        K((List) message.obj);
        return true;
    }

    @Override // com.daaw.VH0
    public void p(long j, long j2) throws VI {
        boolean z;
        if (this.P) {
            return;
        }
        if (this.V == null) {
            this.S.b(j);
            try {
                this.V = (AbstractC7943rZ0) this.S.c();
            } catch (C7107oZ0 e) {
                throw VI.a(e, w());
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.U != null) {
            long J = J();
            z = false;
            while (J <= j) {
                this.W++;
                J = J();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC7943rZ0 abstractC7943rZ0 = this.V;
        if (abstractC7943rZ0 != null) {
            if (abstractC7943rZ0.p()) {
                if (!z && J() == Long.MAX_VALUE) {
                    if (this.Q == 2) {
                        N();
                    } else {
                        L();
                        this.P = true;
                    }
                }
            } else if (this.V.C <= j) {
                AbstractC7943rZ0 abstractC7943rZ02 = this.U;
                if (abstractC7943rZ02 != null) {
                    abstractC7943rZ02.s();
                }
                AbstractC7943rZ0 abstractC7943rZ03 = this.V;
                this.U = abstractC7943rZ03;
                this.V = null;
                this.W = abstractC7943rZ03.a(j);
                z = true;
            }
        }
        if (z) {
            O(this.U.g(j));
        }
        if (this.Q == 2) {
            return;
        }
        while (!this.O) {
            try {
                if (this.T == null) {
                    C7665qZ0 c7665qZ0 = (C7665qZ0) this.S.d();
                    this.T = c7665qZ0;
                    if (c7665qZ0 == null) {
                        return;
                    }
                }
                if (this.Q == 1) {
                    this.T.r(4);
                    this.S.e(this.T);
                    this.T = null;
                    this.Q = 2;
                    return;
                }
                int iF = F(this.N, this.T, false);
                if (iF == -4) {
                    if (this.T.p()) {
                        this.O = true;
                    } else {
                        C7665qZ0 c7665qZ02 = this.T;
                        c7665qZ02.G = this.N.a.X;
                        c7665qZ02.u();
                    }
                    this.S.e(this.T);
                    this.T = null;
                } else if (iF == -3) {
                    return;
                }
            } catch (C7107oZ0 e2) {
                throw VI.a(e2, w());
            }
        }
    }

    @Override // com.daaw.AbstractC1048He
    public void z() {
        this.R = null;
        I();
        M();
    }

    public I21(B21 b21, Looper looper, InterfaceC7386pZ0 interfaceC7386pZ0) {
        super(3);
        this.L = (B21) AbstractC7115ob.e(b21);
        this.K = looper == null ? null : new Handler(looper, this);
        this.M = interfaceC7386pZ0;
        this.N = new C5103hP();
    }
}
