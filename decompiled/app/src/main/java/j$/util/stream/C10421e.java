package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10421e implements InterfaceC10431g, AutoCloseable {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ C10421e(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC10431g j(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C10426f ? ((C10426f) baseStream).a : baseStream instanceof DoubleStream ? A.j((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C10442i0.j((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? T2.j((java.util.stream.Stream) baseStream) : new C10421e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C10421e) {
            obj = ((C10421e) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g onClose(Runnable runnable) {
        return j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g unordered() {
        return j(this.a.unordered());
    }
}
