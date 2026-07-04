package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 extends U1 {
    @Override // j$.util.stream.P1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.b += ((U1) o1).b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }
}
