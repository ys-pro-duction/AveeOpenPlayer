package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10469n2 extends AbstractC10419d2 {
    public long b;
    public long c;
    public final /* synthetic */ C10474o2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10469n2(C10474o2 c10474o2, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = c10474o2;
        this.b = c10474o2.m;
        long j = c10474o2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(AbstractC10497t1.x(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
