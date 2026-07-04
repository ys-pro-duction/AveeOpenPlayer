package com.daaw;

import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.daaw.yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9981yp implements AI {
    public List a;

    public C9981yp(List list) {
        AbstractC6948ny0.d(list, "ExecutionTime list cannot be null or empty");
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public static /* synthetic */ int b(Optional optional, Optional optional2) {
        if (!optional.isPresent() || !optional2.isPresent()) {
            return 0;
        }
        return ((ZonedDateTime) optional2.get()).compareTo((ChronoZonedDateTime<?>) optional.get());
    }

    @Override // com.daaw.AI
    public Optional a(final ZonedDateTime zonedDateTime) {
        return (Optional) Collection.EL.parallelStream(this.a).map(new Function() { // from class: com.daaw.up
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AI) obj).a(zonedDateTime);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: com.daaw.vp
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Optional) obj).isPresent();
            }
        }).sorted(new Comparator() { // from class: com.daaw.wp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C9981yp.b((Optional) obj, (Optional) obj2);
            }
        }).findFirst().orElseGet(new Supplier() { // from class: com.daaw.xp
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
    }
}
