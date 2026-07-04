package com.daaw;

import com.daaw.AI;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.daaw.zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10113zI {

    /* JADX INFO: renamed from: com.daaw.zI$a */
    public static class a implements AI {
        @Override // com.daaw.AI
        public Optional a(ZonedDateTime zonedDateTime) {
            return Optional.empty();
        }
    }

    public static AI a(InterfaceC6094ku interfaceC6094ku) {
        if (!(interfaceC6094ku instanceof C4273eT0)) {
            return interfaceC6094ku instanceof C8579tp ? new C9981yp((List) Collection.EL.parallelStream(((C8579tp) interfaceC6094ku).b()).map(new Function() { // from class: com.daaw.yI
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return AbstractC10113zI.a((InterfaceC6094ku) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())) : new a();
        }
        Map mapM = interfaceC6094ku.m();
        BI bi = new BI(interfaceC6094ku);
        for (EnumC8325su enumC8325su : EnumC8325su.values()) {
            if (mapM.get(enumC8325su) != null) {
                switch (AI.a.a[enumC8325su.ordinal()]) {
                    case 1:
                        bi.h((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 2:
                        bi.f((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 3:
                        bi.e((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 4:
                        bi.c((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 5:
                        bi.b((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 6:
                        bi.g((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 7:
                        bi.i((C8046ru) mapM.get(enumC8325su));
                        break;
                    case 8:
                        bi.d((C8046ru) mapM.get(enumC8325su));
                        break;
                }
            }
        }
        return bi.a();
    }
}
