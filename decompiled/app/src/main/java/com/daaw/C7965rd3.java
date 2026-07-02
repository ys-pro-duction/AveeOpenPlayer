package com.daaw;

/* JADX INFO: renamed from: com.daaw.rd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7965rd3 {
    public static final C7965rd3 c = new C7965rd3(0, 0, 1, 1, 0, null);
    public static final String d = Integer.toString(0, 36);
    public static final String e = Integer.toString(1, 36);
    public static final String f = Integer.toString(2, 36);
    public static final String g = Integer.toString(3, 36);
    public static final String h = Integer.toString(4, 36);
    public static final InterfaceC9666xh3 i = new InterfaceC9666xh3() { // from class: com.daaw.Zn2
    };
    public final int a = 1;
    public C3190aa3 b;

    public /* synthetic */ C7965rd3(int i2, int i3, int i4, int i5, int i6, Lb3 lb3) {
    }

    public final C3190aa3 a() {
        if (this.b == null) {
            this.b = new C3190aa3(this, null);
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7965rd3.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
