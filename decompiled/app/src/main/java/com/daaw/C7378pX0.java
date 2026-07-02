package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.pX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7378pX0 {
    public int a;
    public int b;
    public String c;
    public HashMap d;

    public C7378pX0() {
        this.a = 0;
        this.b = 0;
        this.c = "";
    }

    public void a(String str) {
        if (str == null) {
            str = "unk";
        }
        this.b++;
        this.c += str;
        this.c += "\n";
    }

    public void b(String str, Exception exc) {
        a(str + ": " + exc.getMessage());
    }

    public void c(String str) {
        if (str == null) {
            str = "unk";
        }
        this.a++;
        this.c += str;
        this.c += "\n";
    }

    public void d(String str) {
        if (str == null) {
            str = "unk";
        }
        this.a++;
        if (this.d == null) {
            this.d = new HashMap();
        }
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            this.d.put(str, 1);
        } else {
            this.d.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public String e() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.c);
        HashMap map = this.d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(" (");
                sb.append(entry.getValue());
                sb.append(")");
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public boolean f() {
        return this.b > 0;
    }

    public void g() {
        this.a = 0;
        this.b = 0;
        this.c = "";
        HashMap map = this.d;
        if (map != null) {
            map.clear();
            this.d = null;
        }
    }

    public C7378pX0(C7378pX0 c7378pX0) {
        this.a = c7378pX0.a;
        this.b = c7378pX0.b;
        this.c = c7378pX0.c;
        if (c7378pX0.d != null) {
            this.d = new HashMap(c7378pX0.d);
        } else {
            this.d = null;
        }
    }
}
