package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.jg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5738jg1 {

    /* JADX INFO: renamed from: com.daaw.jg1$b */
    public static final class b extends AbstractC5738jg1 {
        public final List a;
        public final List b;
        public final TC c;
        public final C4083dm0 d;

        public b(List list, List list2, TC tc, C4083dm0 c4083dm0) {
            super();
            this.a = list;
            this.b = list2;
            this.c = tc;
            this.d = c4083dm0;
        }

        public TC a() {
            return this.c;
        }

        public C4083dm0 b() {
            return this.d;
        }

        public List c() {
            return this.b;
        }

        public List d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (!this.a.equals(bVar.a) || !this.b.equals(bVar.b) || !this.c.equals(bVar.c)) {
                    return false;
                }
                C4083dm0 c4083dm0 = this.d;
                C4083dm0 c4083dm02 = bVar.d;
                if (c4083dm0 != null) {
                    return c4083dm0.equals(c4083dm02);
                }
                if (c4083dm02 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            C4083dm0 c4083dm0 = this.d;
            return iHashCode + (c4083dm0 != null ? c4083dm0.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.a + ", removedTargetIds=" + this.b + ", key=" + this.c + ", newDocument=" + this.d + '}';
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg1$c */
    public static final class c extends AbstractC5738jg1 {
        public final int a;
        public final QI b;

        public c(int i, QI qi) {
            super();
            this.a = i;
            this.b = qi;
        }

        public QI a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.a + ", existenceFilter=" + this.b + '}';
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg1$d */
    public static final class d extends AbstractC5738jg1 {
        public final e a;
        public final List b;
        public final AbstractC4340ei c;
        public final C6262lX0 d;

        public d(e eVar, List list, AbstractC4340ei abstractC4340ei, C6262lX0 c6262lX0) {
            super();
            AbstractC6557mb.d(c6262lX0 == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.a = eVar;
            this.b = list;
            this.c = abstractC4340ei;
            if (c6262lX0 == null || c6262lX0.o()) {
                this.d = null;
            } else {
                this.d = c6262lX0;
            }
        }

        public C6262lX0 a() {
            return this.d;
        }

        public e b() {
            return this.a;
        }

        public AbstractC4340ei c() {
            return this.c;
        }

        public List d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a != dVar.a || !this.b.equals(dVar.b) || !this.c.equals(dVar.c)) {
                    return false;
                }
                C6262lX0 c6262lX0 = this.d;
                if (c6262lX0 != null) {
                    return dVar.d != null && c6262lX0.m().equals(dVar.d.m());
                }
                if (dVar.d == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            C6262lX0 c6262lX0 = this.d;
            return iHashCode + (c6262lX0 != null ? c6262lX0.m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.a + ", targetIds=" + this.b + '}';
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg1$e */
    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    public AbstractC5738jg1() {
    }
}
