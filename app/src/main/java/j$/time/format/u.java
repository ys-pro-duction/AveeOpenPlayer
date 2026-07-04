package j$.time.format;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC10401a;
import j$.util.stream.AbstractC10482q0;
import j$.util.stream.C10425e3;
import j$.util.stream.C10462m0;
import j$.util.stream.C10491s0;
import j$.util.stream.D3;
import j$.util.stream.EnumC10486r0;
import j$.util.stream.V2;
import j$.util.stream.W2;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements BiConsumer, BiFunction, Consumer, Supplier, D3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                break;
            default:
                ((BiConsumer) this.b).accept(obj, obj2);
                ((BiConsumer) this.c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C10462m0((EnumC10486r0) this.b, (Predicate) this.c);
    }

    public u(W2 w2, EnumC10486r0 enumC10486r0, Supplier supplier) {
        this.a = 7;
        this.b = enumC10486r0;
        this.c = supplier;
    }

    @Override // j$.util.stream.D3
    public int d() {
        return V2.u | V2.r;
    }

    @Override // j$.util.stream.D3
    public Object b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        AbstractC10482q0 abstractC10482q0 = (AbstractC10482q0) ((Supplier) this.c).get();
        abstractC10401a.Q(spliterator, abstractC10482q0);
        return Boolean.valueOf(abstractC10482q0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.D3
    public Object c(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return (Boolean) new C10491s0(this, abstractC10401a, spliterator).invoke();
    }

    public u(Map map) {
        this.a = 0;
        this.b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                t tVar = a.b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, a.b);
            map2.put((z) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, a.b);
        this.c = map2;
    }

    public String e(long j, z zVar) {
        Map map = (Map) ((Map) this.b).get(zVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((Consumer) this.b).accept(obj);
                ((Consumer) this.c).accept(obj);
                break;
            case 5:
                if (obj == null) {
                    ((AtomicBoolean) this.b).set(true);
                } else {
                    ((ConcurrentHashMap) this.c).putIfAbsent(obj, Boolean.TRUE);
                }
                break;
            case 6:
            case 7:
            default:
                C10425e3 c10425e3 = (C10425e3) this.b;
                c10425e3.getClass();
                if (c10425e3.b.putIfAbsent(obj != null ? obj : C10425e3.d, Boolean.TRUE) == null) {
                    ((Consumer) this.c).accept(obj);
                }
                break;
            case 8:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
