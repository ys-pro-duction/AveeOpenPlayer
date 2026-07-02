package com.daaw;

import android.text.TextUtils;
import com.daaw.CO0;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Pg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1889Pg1 implements InterfaceC8715uJ {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(\\d+)");
    public final String a;
    public final R31 b;
    public InterfaceC9838yJ d;
    public int f;
    public final C2584Vs0 c = new C2584Vs0();
    public byte[] e = new byte[1024];

    public C1889Pg1(String str, R31 r31) {
        this.a = str;
        this.b = r31;
    }

    public final Z41 b(long j) {
        Z41 z41A = this.d.a(0, 3);
        z41A.d(Format.x(null, "text/vtt", null, -1, 0, this.a, null, j));
        this.d.n();
        return z41A;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        int iB = (int) interfaceC9001vJ.b();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((iB != -1 ? iB : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int iC = interfaceC9001vJ.c(bArr2, i2, bArr2.length - i2);
        if (iC != -1) {
            int i3 = this.f + iC;
            this.f = i3;
            if (iB == -1 || i3 != iB) {
                return 0;
            }
        }
        e();
        return -1;
    }

    public final void e() throws C3000Zs0 {
        C2584Vs0 c2584Vs0 = new C2584Vs0(this.e);
        try {
            AbstractC2015Qg1.d(c2584Vs0);
            long jF = 0;
            long jC = 0;
            while (true) {
                String strK = c2584Vs0.k();
                if (TextUtils.isEmpty(strK)) {
                    Matcher matcherA = AbstractC2015Qg1.a(c2584Vs0);
                    if (matcherA == null) {
                        b(0L);
                        return;
                    }
                    long jC2 = AbstractC2015Qg1.c(matcherA.group(1));
                    long jB = this.b.b(R31.i((jF + jC2) - jC));
                    Z41 z41B = b(jB - jC2);
                    this.c.H(this.e, this.f);
                    z41B.c(this.c, this.f);
                    z41B.a(jB, 1, this.f, 0, null);
                    return;
                }
                if (strK.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = g.matcher(strK);
                    if (!matcher.find()) {
                        throw new C3000Zs0("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strK);
                    }
                    Matcher matcher2 = h.matcher(strK);
                    if (!matcher2.find()) {
                        throw new C3000Zs0("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strK);
                    }
                    jC = AbstractC2015Qg1.c(matcher.group(1));
                    jF = R31.f(Long.parseLong(matcher2.group(1)));
                }
            }
        } catch (C7107oZ0 e) {
            throw new C3000Zs0(e);
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.d = interfaceC9838yJ;
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
