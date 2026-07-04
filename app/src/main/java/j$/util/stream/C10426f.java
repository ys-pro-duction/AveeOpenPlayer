package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10426f implements BaseStream {
    public final /* synthetic */ InterfaceC10431g a;

    public /* synthetic */ C10426f(InterfaceC10431g interfaceC10431g) {
        this.a = interfaceC10431g;
    }

    public static /* synthetic */ BaseStream j(InterfaceC10431g interfaceC10431g) {
        if (interfaceC10431g == null) {
            return null;
        }
        return interfaceC10431g instanceof C10421e ? ((C10421e) interfaceC10431g).a : interfaceC10431g instanceof C ? B.j((C) interfaceC10431g) : interfaceC10431g instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC10431g) : interfaceC10431g instanceof InterfaceC10452k0 ? C10447j0.j((InterfaceC10452k0) interfaceC10431g) : interfaceC10431g instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC10431g) : new C10426f(interfaceC10431g);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10431g interfaceC10431g = this.a;
        if (obj instanceof C10426f) {
            obj = ((C10426f) obj).a;
        }
        return interfaceC10431g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return j(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return j(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return j(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return j(this.a.unordered());
    }
}
