package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10431g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC10431g onClose(Runnable runnable);

    InterfaceC10431g parallel();

    InterfaceC10431g sequential();

    Spliterator spliterator();

    InterfaceC10431g unordered();
}
