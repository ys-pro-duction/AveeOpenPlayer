package com.daaw;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8579tp implements InterfaceC6094ku {
    public Pattern B = Pattern.compile("\\|");
    public List C;
    public C7210ou D;

    public C8579tp(List list) {
        this.C = DesugarCollections.unmodifiableList(list);
        AbstractC6948ny0.d(list, "List of Cron cannot be null or empty");
        this.D = ((InterfaceC6094ku) list.get(0)).v();
        AbstractC6948ny0.a(((long) list.size()) == Collection.EL.stream(list).filter(new Predicate() { // from class: com.daaw.sp
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
                return C8579tp.a(this.a, (InterfaceC6094ku) obj);
            }
        }).count(), "All Cron objects must have same definition for CompositeCron");
    }

    public static /* synthetic */ boolean a(C8579tp c8579tp, InterfaceC6094ku interfaceC6094ku) {
        c8579tp.getClass();
        return interfaceC6094ku.v().equals(c8579tp.D);
    }

    public List b() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC6094ku
    public Map m() {
        throw new UnsupportedOperationException("Currently not supported for CompositeCron");
    }

    @Override // com.daaw.InterfaceC6094ku
    public C8046ru p(EnumC8325su enumC8325su) {
        throw new UnsupportedOperationException("Currently not supported for CompositeCron");
    }

    @Override // com.daaw.InterfaceC6094ku
    public C7210ou v() {
        return this.D;
    }
}
