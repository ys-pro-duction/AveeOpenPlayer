package com.daaw;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: com.daaw.gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4884gd0 implements Collection, InterfaceC9783y60, j$.util.Collection {
    public static final a D = new a(null);
    public final List B;
    public final int C;

    /* JADX INFO: renamed from: com.daaw.gd0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4884gd0 a() {
            List listA = AbstractC3570bv0.a().a();
            ArrayList arrayList = new ArrayList(listA.size());
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C4316ed0((InterfaceC3008Zu0) listA.get(i)));
            }
            return new C4884gd0(arrayList);
        }

        public a() {
        }
    }

    public C4884gd0(List list) {
        G10.g(list, "localeList");
        this.B = list;
        this.C = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C4316ed0) {
            return e((C4316ed0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        return this.B.containsAll(collection);
    }

    public boolean e(C4316ed0 c4316ed0) {
        G10.g(c4316ed0, "element");
        return this.B.contains(c4316ed0);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4884gd0) && G10.c(this.B, ((C4884gd0) obj).B);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.B.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.B.iterator();
    }

    public final C4316ed0 m(int i) {
        return (C4316ed0) this.B.get(i);
    }

    public final List p() {
        return this.B;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return this.C;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.B + ')';
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }
}
