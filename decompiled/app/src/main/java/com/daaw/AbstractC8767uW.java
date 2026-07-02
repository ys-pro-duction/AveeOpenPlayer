package com.daaw;

import com.daaw.AbstractC6962o10;
import com.daaw.AbstractC8914v;
import com.daaw.C2756Xj0;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8767uW extends AbstractC8914v.c {
    public static final AbstractC6962o10.a w;
    public static final C2756Xj0.g x;
    public C6262lX0 s;
    public C2756Xj0 t;
    public Charset u;
    public boolean v;

    /* JADX INFO: renamed from: com.daaw.uW$a */
    public class a implements AbstractC6962o10.a {
        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, AbstractC6962o10.a));
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        w = aVar;
        x = AbstractC6962o10.b(":status", aVar);
    }

    public AbstractC8767uW(int i, C5695jX0 c5695jX0, T51 t51) {
        super(i, c5695jX0, t51);
        this.u = AbstractC0439Bk.c;
    }

    public static Charset O(C2756Xj0 c2756Xj0) {
        String str = (String) c2756Xj0.g(AbstractC7365pU.j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0439Bk.c;
    }

    public static void R(C2756Xj0 c2756Xj0) {
        c2756Xj0.e(x);
        c2756Xj0.e(AbstractC7798r10.b);
        c2756Xj0.e(AbstractC7798r10.a);
    }

    public abstract void P(C6262lX0 c6262lX0, boolean z, C2756Xj0 c2756Xj0);

    public final C6262lX0 Q(C2756Xj0 c2756Xj0) {
        C6262lX0 c6262lX0 = (C6262lX0) c2756Xj0.g(AbstractC7798r10.b);
        if (c6262lX0 != null) {
            return c6262lX0.q((String) c2756Xj0.g(AbstractC7798r10.a));
        }
        if (this.v) {
            return C6262lX0.h.q("missing GRPC status in response");
        }
        Integer num = (Integer) c2756Xj0.g(x);
        return (num != null ? AbstractC7365pU.l(num.intValue()) : C6262lX0.t.q("missing HTTP status code")).e("missing GRPC status, inferred error from HTTP status code");
    }

    public void S(IE0 ie0, boolean z) throws Throwable {
        C6262lX0 c6262lX0 = this.s;
        if (c6262lX0 != null) {
            this.s = c6262lX0.e("DATA-----------------------------\n" + JE0.e(ie0, this.u));
            ie0.close();
            if (this.s.n().length() > 1000 || z) {
                P(this.s, false, this.t);
                return;
            }
            return;
        }
        if (!this.v) {
            P(C6262lX0.t.q("headers not received before payload"), false, new C2756Xj0());
            return;
        }
        int iB = ie0.b();
        D(ie0);
        if (z) {
            if (iB > 0) {
                this.s = C6262lX0.t.q("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.s = C6262lX0.t.q("Received unexpected EOS on empty DATA frame from server");
            }
            C2756Xj0 c2756Xj0 = new C2756Xj0();
            this.t = c2756Xj0;
            N(this.s, false, c2756Xj0);
        }
    }

    /* JADX WARN: Finally extract failed */
    public void T(C2756Xj0 c2756Xj0) {
        AbstractC7785qy0.o(c2756Xj0, "headers");
        C6262lX0 c6262lX0 = this.s;
        if (c6262lX0 != null) {
            this.s = c6262lX0.e("headers: " + c2756Xj0);
            return;
        }
        try {
            if (this.v) {
                C6262lX0 c6262lX0Q = C6262lX0.t.q("Received headers twice");
                this.s = c6262lX0Q;
                if (c6262lX0Q != null) {
                    this.s = c6262lX0Q.e("headers: " + c2756Xj0);
                    this.t = c2756Xj0;
                    this.u = O(c2756Xj0);
                    return;
                }
                return;
            }
            Integer num = (Integer) c2756Xj0.g(x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                C6262lX0 c6262lX02 = this.s;
                if (c6262lX02 != null) {
                    this.s = c6262lX02.e("headers: " + c2756Xj0);
                    this.t = c2756Xj0;
                    this.u = O(c2756Xj0);
                    return;
                }
                return;
            }
            this.v = true;
            C6262lX0 c6262lX0V = V(c2756Xj0);
            this.s = c6262lX0V;
            if (c6262lX0V != null) {
                if (c6262lX0V != null) {
                    this.s = c6262lX0V.e("headers: " + c2756Xj0);
                    this.t = c2756Xj0;
                    this.u = O(c2756Xj0);
                    return;
                }
                return;
            }
            R(c2756Xj0);
            E(c2756Xj0);
            C6262lX0 c6262lX03 = this.s;
            if (c6262lX03 != null) {
                this.s = c6262lX03.e("headers: " + c2756Xj0);
                this.t = c2756Xj0;
                this.u = O(c2756Xj0);
            }
        } catch (Throwable th) {
            C6262lX0 c6262lX04 = this.s;
            if (c6262lX04 != null) {
                this.s = c6262lX04.e("headers: " + c2756Xj0);
                this.t = c2756Xj0;
                this.u = O(c2756Xj0);
            }
            throw th;
        }
    }

    public void U(C2756Xj0 c2756Xj0) {
        AbstractC7785qy0.o(c2756Xj0, "trailers");
        if (this.s == null && !this.v) {
            C6262lX0 c6262lX0V = V(c2756Xj0);
            this.s = c6262lX0V;
            if (c6262lX0V != null) {
                this.t = c2756Xj0;
            }
        }
        C6262lX0 c6262lX0 = this.s;
        if (c6262lX0 == null) {
            C6262lX0 c6262lX0Q = Q(c2756Xj0);
            R(c2756Xj0);
            F(c2756Xj0, c6262lX0Q);
        } else {
            C6262lX0 c6262lX0E = c6262lX0.e("trailers: " + c2756Xj0);
            this.s = c6262lX0E;
            P(c6262lX0E, false, this.t);
        }
    }

    public final C6262lX0 V(C2756Xj0 c2756Xj0) {
        Integer num = (Integer) c2756Xj0.g(x);
        if (num == null) {
            return C6262lX0.t.q("Missing HTTP status code");
        }
        String str = (String) c2756Xj0.g(AbstractC7365pU.j);
        if (AbstractC7365pU.m(str)) {
            return null;
        }
        return AbstractC7365pU.l(num.intValue()).e("invalid content-type: " + str);
    }

    @Override // com.daaw.AbstractC8914v.c, com.daaw.C1381Kj0.b
    public /* bridge */ /* synthetic */ void c(boolean z) {
        super.c(z);
    }
}
