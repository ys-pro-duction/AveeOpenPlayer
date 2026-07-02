package com.daaw;

/* JADX INFO: renamed from: com.daaw.lr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6362lr3 {
    public static final C6362lr3 d = new C6362lr3(new A62[0]);
    public static final String e = Integer.toString(0, 36);
    public static final InterfaceC9666xh3 f = new InterfaceC9666xh3() { // from class: com.daaw.kr3
    };
    public final int a;
    public final OP2 b;
    public int c;

    public C6362lr3(A62... a62Arr) {
        this.b = OP2.I(a62Arr);
        this.a = a62Arr.length;
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (((A62) this.b.get(i)).equals(this.b.get(i3))) {
                    AbstractC3305ay2.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(A62 a62) {
        int iIndexOf = this.b.indexOf(a62);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final A62 b(int i) {
        return (A62) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6362lr3.class == obj.getClass()) {
            C6362lr3 c6362lr3 = (C6362lr3) obj;
            if (this.a == c6362lr3.a && this.b.equals(c6362lr3.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }
}
