package com.daaw;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public interface YY0 {

    public static final class a implements Collection, InterfaceC9783y60, j$.util.Collection {
        public final Set B;

        public a(Set set) {
            G10.g(set, "set");
            this.B = set;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.B.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.B.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            G10.g(collection, "elements");
            return this.B.containsAll(collection);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.B.add(obj);
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.B.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.B.iterator();
        }

        public int m() {
            return this.B.size();
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.B.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            G10.g(collection, "slotIds");
            return this.B.remove(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            G10.g(collection, "slotIds");
            return this.B.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return m();
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

        public /* synthetic */ a(Set set, int i, AbstractC2911Yw abstractC2911Yw) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            G10.g(objArr, "array");
            return AbstractC1080Hm.b(this, objArr);
        }
    }

    boolean a(Object obj, Object obj2);

    void b(a aVar);
}
