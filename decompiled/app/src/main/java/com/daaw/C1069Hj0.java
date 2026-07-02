package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1069Hj0 implements InterfaceC6921ns {
    public final String a;
    public final a b;
    public final boolean c;

    /* JADX INFO: renamed from: com.daaw.Hj0$a */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public C1069Hj0(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        if (c4615ff0.z()) {
            return new C1173Ij0(this);
        }
        AbstractC1876Pd0.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
