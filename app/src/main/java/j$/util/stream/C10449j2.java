package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10449j2 extends AbstractC10424e2 {
    public long b;
    public long c;
    public final /* synthetic */ C10454k2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10449j2(C10454k2 c10454k2, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = c10454k2;
        this.b = c10454k2.m;
        long j = c10454k2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(AbstractC10497t1.x(j, this.d.m, this.c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.p(obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
