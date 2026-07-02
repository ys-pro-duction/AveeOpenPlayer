package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class CV1 extends AbstractC9330wV1 implements InterfaceC3917d93 {
    public String E;
    public final EU1 F;
    public boolean G;
    public final BV1 H;
    public final C3447bV1 I;
    public ByteBuffer J;
    public boolean K;
    public final Object L;
    public final String M;
    public final int N;
    public boolean O;

    public CV1(FU1 fu1, EU1 eu1) {
        super(fu1);
        this.F = eu1;
        this.H = new BV1();
        this.I = new C3447bV1();
        this.L = new Object();
        this.M = (String) AbstractC4255eO2.d(fu1 != null ? fu1.G() : null).b("");
        this.N = fu1 != null ? fu1.zzf() : 0;
    }

    public static final String B(String str) {
        return "cache:".concat(String.valueOf(XS1.i(str)));
    }

    private final void zzv() {
        int iA = (int) this.H.a();
        int iA2 = (int) this.I.a(this.J);
        int iPosition = this.J.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        int iO = AbstractC7646qU1.O();
        int iQ = AbstractC7646qU1.Q();
        String str = this.E;
        p(str, B(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    public final boolean A() {
        return this.O;
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void k() {
        this.G = true;
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void l(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
        if (interfaceC7659qX2 instanceof L43) {
            this.H.b((L43) interfaceC7659qX2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        r23.O = true;
        o(r24, r4, (int) r23.I.a(r23.J));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:? -> B:23:0x00cf). Please report as a decompilation issue!!! */
    @Override // com.daaw.AbstractC9330wV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.CV1.v(java.lang.String):boolean");
    }

    public final String y() {
        return this.E;
    }

    public final ByteBuffer z() {
        synchronized (this.L) {
            try {
                ByteBuffer byteBuffer = this.J;
                if (byteBuffer != null && !this.K) {
                    byteBuffer.flip();
                    this.K = true;
                }
                this.G = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.J;
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void a(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void g(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z) {
    }

    @Override // com.daaw.InterfaceC3917d93
    public final void f(InterfaceC7659qX2 interfaceC7659qX2, C5835k03 c5835k03, boolean z, int i) {
    }
}
