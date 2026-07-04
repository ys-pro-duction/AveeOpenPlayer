package com.daaw;

import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: com.daaw.yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10006yu {
    public final Map a = new HashMap();
    public final C7210ou b;

    public C10006yu(C7210ou c7210ou) {
        this.b = (C7210ou) AbstractC6948ny0.c(c7210ou, "CronDefinition must not be null");
        d(c7210ou);
    }

    public static /* synthetic */ int b(String str) {
        return str.split("\\|").length;
    }

    public final void d(C7210ou c7210ou) {
        List list = (List) Collection.EL.stream(c7210ou.e()).map(new Function() { // from class: com.daaw.uu
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.g((YJ) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).sorted(C0375Au.b()).collect(Collectors.toList());
        List list2 = list;
        while (e(list2)) {
            int size = list2.size() - 1;
            ArrayList arrayList = new ArrayList(list2.subList(0, size));
            this.a.put(Integer.valueOf(size), arrayList);
            list2 = arrayList;
        }
        this.a.put(Integer.valueOf(list.size()), list);
    }

    public final boolean e(List list) {
        return !list.isEmpty() && ((C0375Au) list.get(list.size() - 1)).d();
    }

    public InterfaceC6094ku f(String str) {
        AbstractC6948ny0.c(str, "Expression must not be null");
        String strTrim = str.replaceAll("\\s+", " ").trim();
        if (AbstractC6266lY0.b(strTrim)) {
            throw new IllegalArgumentException("Empty expression!");
        }
        Set setC = this.b.c();
        if (str.startsWith("@")) {
            if (setC.isEmpty()) {
                throw new IllegalArgumentException("Nicknames not supported!");
            }
            switch (str) {
                case "@midnight":
                    return h(str, setC, EnumC8604tu.MIDNIGHT, C6373lu.f(this.b));
                case "@annually":
                    return h(str, setC, EnumC8604tu.ANNUALLY, C6373lu.b(this.b));
                case "@hourly":
                    return h(str, setC, EnumC8604tu.HOURLY, C6373lu.d(this.b));
                case "@reboot":
                    return h(str, setC, EnumC8604tu.REBOOT, C6373lu.h(this.b));
                case "@weekly":
                    return h(str, setC, EnumC8604tu.WEEKLY, C6373lu.i(this.b));
                case "@yearly":
                    return h(str, setC, EnumC8604tu.YEARLY, C6373lu.p(this.b));
                case "@monthly":
                    return h(str, setC, EnumC8604tu.MONTHLY, C6373lu.g(this.b));
                case "@daily":
                    return h(str, setC, EnumC8604tu.DAILY, C6373lu.c(this.b));
            }
        }
        if (str.contains("||")) {
            return new C8579tp((List) DesugarArrays.stream(str.split("\\|\\|")).map(new Function() { // from class: com.daaw.vu
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.f((String) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
        }
        if (str.contains("|")) {
            ArrayList arrayList = new ArrayList();
            int iOrElse = DesugarArrays.stream(str.split("\\s+")).mapToInt(new ToIntFunction() { // from class: com.daaw.wu
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return C10006yu.b((String) obj);
                }
            }).max().orElse(0);
            for (int i = 0; i < iOrElse; i++) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : str.split("\\s+")) {
                    if (str2.contains("|")) {
                        sb.append(String.format("%s ", str2.split("\\|")[i]));
                    } else {
                        sb.append(String.format("%s ", str2));
                    }
                }
                arrayList.add(sb.toString().trim());
            }
            return new C8579tp((List) Collection.EL.stream(arrayList).map(new Function() { // from class: com.daaw.vu
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.f((String) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
        }
        String[] strArrSplit = strTrim.toUpperCase().split(" ");
        int length = strArrSplit.length;
        String str3 = (String) DesugarArrays.stream(strArrSplit).filter(new Predicate() { // from class: com.daaw.xu
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
                return ((String) obj).endsWith(",");
            }
        }).findAny().orElse(null);
        if (str3 != null) {
            throw new IllegalArgumentException(String.format("Invalid field value! Trailing commas not permitted! '%s'", str3));
        }
        List list = (List) this.a.get(Integer.valueOf(length));
        if (list == null) {
            throw new IllegalArgumentException(String.format("Cron expression contains %s parts but we expect one of %s", Integer.valueOf(length), this.a.keySet()));
        }
        try {
            int length2 = strArrSplit.length;
            ArrayList arrayList2 = new ArrayList(length2 + 1);
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(((C0375Au) list.get(i2)).e(strArrSplit[i2]));
            }
            return new C4273eT0(this.b, arrayList2).b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Failed to parse cron expression. %s", e.getMessage()), e);
        }
    }

    public final C0375Au g(YJ yj) {
        return new C0375Au(yj.d(), yj.c(), yj.e());
    }

    public final InterfaceC6094ku h(String str, Set set, EnumC8604tu enumC8604tu, InterfaceC6094ku interfaceC6094ku) {
        if (set.contains(enumC8604tu)) {
            return interfaceC6094ku;
        }
        throw new IllegalArgumentException(String.format("Nickname %s not supported!", str));
    }
}
