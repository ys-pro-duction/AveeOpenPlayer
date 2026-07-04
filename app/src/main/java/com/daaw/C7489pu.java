package com.daaw;

import j$.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7489pu {
    public final Map a = new EnumMap(EnumC8325su.class);
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public boolean d;

    /* JADX INFO: renamed from: com.daaw.pu$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0479Bu.values().length];
            a = iArr;
            try {
                iArr[EnumC0479Bu.CRON4J.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0479Bu.QUARTZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0479Bu.UNIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0479Bu.SPRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0479Bu.SPRING53.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static C7210ou a() {
        return b().o().l(0, 59).d().a().n().l(0, 23).d().a().l().l(0, 31).h().d().a().p().l(1, 12).d().a().m().e(0, 6).n(1).d().a().e().c();
    }

    public static C7489pu b() {
        return new C7489pu();
    }

    public static C7210ou d(EnumC0479Bu enumC0479Bu) {
        int i = a.a[enumC0479Bu.ordinal()];
        if (i == 1) {
            return a();
        }
        if (i == 2) {
            return f();
        }
        if (i == 3) {
            return j();
        }
        if (i == 4) {
            return h();
        }
        if (i == 5) {
            return i();
        }
        throw new IllegalArgumentException(String.format("No cron definition found for %s", enumC0479Bu));
    }

    public static C7210ou f() {
        return b().q().l(0, 59).a().o().l(0, 59).a().n().l(0, 23).a().l().l(1, 31).h().j().i().f().a().p().l(1, 12).a().m().e(1, 7).n(2).g().h().f().a().y().l(1970, 2099).d().b().a().k(AbstractC6931nu.a()).c();
    }

    public static C7210ou h() {
        return b().q().l(0, 59).d().a().o().l(0, 59).d().a().n().l(0, 23).d().a().l().l(1, 31).f().a().p().l(1, 12).a().m().e(0, 7).n(1).m(7, 0).g().f().a().c();
    }

    public static C7210ou i() {
        return b().q().l(0, 59).d().a().o().l(0, 59).d().a().n().l(0, 23).d().a().l().l(1, 31).h().j().i().f().a().p().l(1, 12).a().m().e(0, 7).n(1).m(7, 0).g().h().f().a().x().r().v().w().s().u().t().c();
    }

    public static C7210ou j() {
        return b().o().l(0, 59).d().a().n().l(0, 23).d().a().l().l(1, 31).d().a().p().l(1, 12).d().a().m().e(0, 7).n(1).m(7, 0).d().a().c();
    }

    public C7210ou c() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.b);
        ArrayList arrayList = new ArrayList(this.a.values());
        List.EL.sort(arrayList, YJ.b());
        return new C7210ou(arrayList, hashSet, this.c, this.d);
    }

    public C7489pu e() {
        this.d = true;
        return this;
    }

    public void g(YJ yj) {
        boolean z;
        Iterator it = this.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((YJ) it.next()).e()) {
                z = true;
                break;
            }
        }
        if (!yj.e() && z) {
            throw new IllegalArgumentException("Can't register mandatory definition after a optional definition.");
        }
        this.a.put(yj.d(), yj);
    }

    public C7489pu k(AbstractC6652mu abstractC6652mu) {
        this.b.add(abstractC6652mu);
        return this;
    }

    public C7882rK l() {
        return new C7882rK(this, EnumC8325su.DAY_OF_MONTH);
    }

    public WJ m() {
        return new WJ(this, EnumC8325su.DAY_OF_WEEK);
    }

    public ZJ n() {
        return new ZJ(this, EnumC8325su.HOUR);
    }

    public ZJ o() {
        return new ZJ(this, EnumC8325su.MINUTE);
    }

    public ZJ p() {
        return new ZJ(this, EnumC8325su.MONTH);
    }

    public ZJ q() {
        return new ZJ(this, EnumC8325su.SECOND);
    }

    public C7489pu r() {
        this.c.add(EnumC8604tu.ANNUALLY);
        return this;
    }

    public C7489pu s() {
        this.c.add(EnumC8604tu.DAILY);
        return this;
    }

    public C7489pu t() {
        this.c.add(EnumC8604tu.HOURLY);
        return this;
    }

    public C7489pu u() {
        this.c.add(EnumC8604tu.MIDNIGHT);
        return this;
    }

    public C7489pu v() {
        this.c.add(EnumC8604tu.MONTHLY);
        return this;
    }

    public C7489pu w() {
        this.c.add(EnumC8604tu.WEEKLY);
        return this;
    }

    public C7489pu x() {
        this.c.add(EnumC8604tu.YEARLY);
        return this;
    }

    public ZJ y() {
        return new ZJ(this, EnumC8325su.YEAR);
    }
}
