package com.daaw;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes4.dex */
public class UT0 extends AbstractList implements RandomAccess, List {
    public int B;
    public Object C;

    public static class b implements Iterator {
        public static final b B = new b();

        public static b a() {
            return B;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    public class c extends d {
        public final int C;

        public c() {
            super();
            this.C = ((AbstractList) UT0.this).modCount;
        }

        @Override // com.daaw.UT0.d
        public void a() {
            if (((AbstractList) UT0.this).modCount == this.C) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) UT0.this).modCount + "; expected: " + this.C);
        }

        @Override // com.daaw.UT0.d
        public Object b() {
            return UT0.this.C;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            UT0.this.clear();
        }
    }

    public static abstract class d implements Iterator {
        public boolean B;

        public d() {
        }

        public abstract void a();

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.B;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.B) {
                throw new NoSuchElementException();
            }
            this.B = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i = this.B;
        if (i == 0) {
            this.C = obj;
        } else if (i == 1) {
            this.C = new Object[]{this.C, obj};
        } else {
            Object[] objArr = (Object[]) this.C;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.C = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.B] = obj;
        }
        this.B++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.C = null;
        this.B = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.B)) {
            return i2 == 1 ? this.C : ((Object[]) this.C)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.B);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i = this.B;
        if (i == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                e(2);
            }
            return bVarA;
        }
        if (i == 1) {
            return new c();
        }
        Iterator it = super.iterator();
        if (it == null) {
            e(3);
        }
        return it;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.B)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.B);
        }
        if (i2 == 1) {
            obj = this.C;
            this.C = null;
        } else {
            Object[] objArr = (Object[]) this.C;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.C = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.B - 1] = null;
            }
            obj = obj2;
        }
        this.B--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.B)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.B);
        }
        if (i2 == 1) {
            Object obj2 = this.C;
            this.C = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.C;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.B;
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator comparator) {
        int i = this.B;
        if (i >= 2) {
            Arrays.sort((Object[]) this.C, 0, i, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            e(4);
        }
        int length = objArr.length;
        int i = this.B;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.C;
                return objArr2;
            }
            objArr[0] = this.C;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.C, i, objArr.getClass());
                if (objArrCopyOf == null) {
                    e(6);
                }
                return objArrCopyOf;
            }
            if (i != 0) {
                System.arraycopy(this.C, 0, objArr, 0, i);
            }
        }
        int i2 = this.B;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.B)) {
            if (i2 == 0) {
                this.C = obj;
            } else if (i2 == 1 && i == 0) {
                this.C = new Object[]{obj, this.C};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.C;
                } else {
                    Object[] objArr2 = (Object[]) this.C;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.B - i);
                }
                objArr[i] = obj;
                this.C = objArr;
            }
            this.B++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.B);
    }
}
