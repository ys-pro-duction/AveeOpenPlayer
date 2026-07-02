package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ea1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0722Ea1 {
    public static final C0722Ea1 b = new C0722Ea1(null);
    public final String a;

    public C0722Ea1(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0722Ea1.class == obj.getClass()) {
            String str = this.a;
            String str2 = ((C0722Ea1) obj).a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.a + ")";
    }
}
