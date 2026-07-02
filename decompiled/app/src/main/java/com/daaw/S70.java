package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class S70 {
    public static final S70 c = new S70("COMPOSITION");
    public final List a;
    public T70 b;

    public S70(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public S70 a(String str) {
        S70 s70 = new S70(this);
        s70.a.add(str);
        return s70;
    }

    public final boolean b() {
        return ((String) this.a.get(r0.size() - 1)).equals("**");
    }

    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = (String) this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) this.a.get(i + 1)).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.a.size() - 1) {
            return false;
        }
        return ((String) this.a.get(i2)).equals(str);
    }

    public T70 d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.a.get(i)).equals("**")) {
            return (i != this.a.size() - 1 && ((String) this.a.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            S70 s70 = (S70) obj;
            if (!this.a.equals(s70.a)) {
                return false;
            }
            T70 t70 = this.b;
            T70 t702 = s70.b;
            if (t70 != null) {
                return t70.equals(t702);
            }
            if (t702 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return ((String) this.a.get(i)).equals(str) || ((String) this.a.get(i)).equals("**") || ((String) this.a.get(i)).equals("*");
    }

    public boolean h(String str, int i) {
        return "__container".equals(str) || i < this.a.size() - 1 || ((String) this.a.get(i)).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        T70 t70 = this.b;
        return iHashCode + (t70 != null ? t70.hashCode() : 0);
    }

    public S70 i(T70 t70) {
        S70 s70 = new S70(this);
        s70.b = t70;
        return s70;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    public S70(S70 s70) {
        this.a = new ArrayList(s70.a);
        this.b = s70.b;
    }
}
