package com.revenuecat.purchases.models;

import com.daaw.AbstractC1080Hm;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC2911Yw;
import com.daaw.C0576Cs0;
import com.daaw.G10;
import com.daaw.InterfaceC9783y60;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0096\u0001J\u0013\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0018\u0010!\u001a\u0004\u0018\u00010\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0096\u0003J\b\u0010$\u001a\u00020\u000fH\u0016J\u0011\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0001J\t\u0010&\u001a\u00020\u0017H\u0096\u0001J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0003J\u0011\u0010)\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0096\u0001J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+2\u0006\u0010#\u001a\u00020\u000fH\u0096\u0001J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH\u0096\u0001J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00100\u001a\u000201R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions;", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptions", "(Ljava/util/List;)V", "basePlan", "getBasePlan", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOffer", "getDefaultOffer", "freeTrial", "getFreeTrial", "introOffer", "getIntroOffer", "size", "", "getSize", "()I", "billingPeriodToDays", "period", "Lcom/revenuecat/purchases/models/Period;", "billingPeriodToDays$purchases_defaultsRelease", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "findLongestFreeTrial", "offers", "findLowestNonFreeOffer", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "withTag", "tag", "", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SubscriptionOptions implements List<SubscriptionOption>, InterfaceC9783y60, j$.util.List {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String RC_IGNORE_OFFER_TAG = "rc-ignore-offer";
    private final List<SubscriptionOption> subscriptionOptions;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions$Companion;", "", "()V", "RC_IGNORE_OFFER_TAG", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionOptions(List<? extends SubscriptionOption> list) {
        G10.g(list, "subscriptionOptions");
        this.subscriptionOptions = list;
    }

    private final SubscriptionOption findLongestFreeTrial(List<? extends SubscriptionOption> offers) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = offers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase freePhase = subscriptionOption.getFreePhase();
            C0576Cs0 c0576Cs0 = freePhase != null ? new C0576Cs0(subscriptionOption, Integer.valueOf(billingPeriodToDays$purchases_defaultsRelease(freePhase.getBillingPeriod()))) : null;
            if (c0576Cs0 != null) {
                arrayList.add(c0576Cs0);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue = ((Number) ((C0576Cs0) next).d()).intValue();
                do {
                    Object next2 = it2.next();
                    int iIntValue2 = ((Number) ((C0576Cs0) next2).d()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C0576Cs0 c0576Cs02 = (C0576Cs0) next;
        if (c0576Cs02 != null) {
            return (SubscriptionOption) c0576Cs02.c();
        }
        return null;
    }

    private final SubscriptionOption findLowestNonFreeOffer(List<? extends SubscriptionOption> offers) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = offers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase introPhase = subscriptionOption.getIntroPhase();
            C0576Cs0 c0576Cs0 = introPhase != null ? new C0576Cs0(subscriptionOption, Long.valueOf(introPhase.getPrice().getAmountMicros())) : null;
            if (c0576Cs0 != null) {
                arrayList.add(c0576Cs0);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long jLongValue = ((Number) ((C0576Cs0) next).d()).longValue();
                do {
                    Object next2 = it2.next();
                    long jLongValue2 = ((Number) ((C0576Cs0) next2).d()).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C0576Cs0 c0576Cs02 = (C0576Cs0) next;
        if (c0576Cs02 != null) {
            return (SubscriptionOption) c0576Cs02.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int billingPeriodToDays$purchases_defaultsRelease(Period period) {
        G10.g(period, "period");
        Integer num = (Integer) SubscriptionOptionsKt.DAYS_IN_UNIT.get(period.getUnit());
        return period.getValue() * (num != null ? num.intValue() : 0);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SubscriptionOption element) {
        G10.g(element, "element");
        return this.subscriptionOptions.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        G10.g(elements, "elements");
        return this.subscriptionOptions.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (G10.c(SubscriptionOptions.class, other != null ? other.getClass() : null)) {
            return (other instanceof SubscriptionOptions ? (SubscriptionOptions) other : null) != null && G10.c(AbstractC1496Lm.e(this.subscriptionOptions), AbstractC1496Lm.e(((SubscriptionOptions) other).subscriptionOptions));
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public SubscriptionOption get(int index) {
        return this.subscriptionOptions.get(index);
    }

    public final SubscriptionOption getBasePlan() {
        SubscriptionOption next;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.isBasePlan()) {
                break;
            }
        }
        return next;
    }

    public final SubscriptionOption getDefaultOffer() {
        SubscriptionOption next;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.isBasePlan()) {
                break;
            }
        }
        SubscriptionOption subscriptionOption = next;
        if (subscriptionOption == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SubscriptionOption subscriptionOption2 : this) {
            if (!subscriptionOption2.isBasePlan()) {
                arrayList.add(subscriptionOption2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((SubscriptionOption) obj).getTags().contains(RC_IGNORE_OFFER_TAG)) {
                arrayList2.add(obj);
            }
        }
        SubscriptionOption subscriptionOptionFindLongestFreeTrial = findLongestFreeTrial(arrayList2);
        return (subscriptionOptionFindLongestFreeTrial == null && (subscriptionOptionFindLongestFreeTrial = findLowestNonFreeOffer(arrayList2)) == null) ? subscriptionOption : subscriptionOptionFindLongestFreeTrial;
    }

    public final SubscriptionOption getFreeTrial() {
        SubscriptionOption next;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getFreePhase() != null) {
                break;
            }
        }
        return next;
    }

    public final SubscriptionOption getIntroOffer() {
        SubscriptionOption next;
        Iterator<SubscriptionOption> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getIntroPhase() != null) {
                break;
            }
        }
        return next;
    }

    public int getSize() {
        return this.subscriptionOptions.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return AbstractC1496Lm.e(this.subscriptionOptions).hashCode();
    }

    public int indexOf(SubscriptionOption element) {
        G10.g(element, "element");
        return this.subscriptionOptions.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.subscriptionOptions.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<SubscriptionOption> iterator() {
        return this.subscriptionOptions.iterator();
    }

    public int lastIndexOf(SubscriptionOption element) {
        G10.g(element, "element");
        return this.subscriptionOptions.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<SubscriptionOption> listIterator() {
        return this.subscriptionOptions.listIterator();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public SubscriptionOption remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<SubscriptionOption> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public SubscriptionOption set2(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super SubscriptionOption> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public List<SubscriptionOption> subList(int fromIndex, int toIndex) {
        return this.subscriptionOptions.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    public final List<SubscriptionOption> withTag(String tag) {
        G10.g(tag, "tag");
        ArrayList arrayList = new ArrayList();
        for (SubscriptionOption subscriptionOption : this) {
            if (subscriptionOption.getTags().contains(tag)) {
                arrayList.add(subscriptionOption);
            }
        }
        return arrayList;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return contains((SubscriptionOption) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return indexOf((SubscriptionOption) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return lastIndexOf((SubscriptionOption) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<SubscriptionOption> listIterator(int index) {
        return this.subscriptionOptions.listIterator(index);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ SubscriptionOption remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ SubscriptionOption set(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public boolean add(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        G10.g(tArr, "array");
        return (T[]) AbstractC1080Hm.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
